# reactor-cassandra
Project Reactor with Apache Cassandra

### Create keyspace
    CREATE KEYSPACE IF NOT EXISTS reactor_cassandra 
    WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 3};

### Schema ( Query First Approach )
#### List all Students of year=2020, class=nursery 
    CREATE TABLE all_students (
        year smallint,
        class_name text,
        class_section text,
        class_roll smallint,
        student_id text,
        fname text,
        lname text,
        PRIMARY KEY ((year, class_name), student_id)
    ) WITH CLUSTERING ORDER BY (student_id DESC);`

```cassandraql
INSERT INTO all_students (year, class_name, class_section, class_roll, student_id, fname, lname ) VALUES (2020, 'Nursery', 'A', 14, 'AD1255', 'Jack', 'Rick' );
INSERT INTO all_students (year, class_name, class_section, class_roll, student_id, fname, lname ) VALUES (2020, 'Nursery', 'A', 15, 'AD1256', 'Jack2', 'Rick' );

select * from all_students where year=2020 and class_name='Nursery';`
```

#### View a Student profile with list for each year cgpa 

    CREATE TABLE student_report (
        student_id text,
        year smallint,
        class_name text,
        class_section text,
        class_roll smallint,
        cgpa text,
        grade text,
        PRIMARY KEY (student_id, year)
    );

```cassandraql
INSERT INTO student_report (student_id, year, class_name, class_section, class_roll, cgpa, grade) VALUES ('AD1255', 2020, 'Nursery', 'A', 14, '3.8', 'A');
INSERT INTO student_report (student_id, year, class_name, class_section, class_roll, cgpa, grade) VALUES ('AD1255', 2019, 'Play', 'A', 12, '3.6', 'B+');
INSERT INTO student_report (student_id, year, class_name, class_section, class_roll, cgpa, grade) VALUES ('AD1256', 2020, 'Nursery', 'A', 14, '3.9', 'A');

SELECT * FROM student_report where student_id='AD1255';
```

#### View a student current information
    CREATE TABLE student_information (
        student_id text,
        class_name text,
        class_section text,
        class_roll smallint,
        date_joined timestamp,
        is_current_student boolean,
        fname text,
        lname text,
        PRIMARY KEY (student_id)
    );

```cassandraql
INSERT INTO student_information (student_id, class_name, class_section, class_roll, date_joined, is_current_student, fname, lname) VALUES('AD1255', 'Nursery', 'A', 12, '2020-01-03T10:05:00+0000', true, 'Jack', 'Rick');
INSERT INTO student_information (student_id, class_name, class_section, class_roll, date_joined, is_current_student, fname, lname) VALUES('AD1256', 'Nursery', 'A', 14, '2020-01-03T10:05:00+0000', true, 'Jack', 'Rick');

SELECT * from student_information;
```

### Important CQL
    describe keyspaces;
    describe tables;
    describe table {table_name};