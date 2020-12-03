package io.github.sheralam.reactorcassandra.student_information.entity;

import lombok.Data;
import lombok.Value;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

@Table(value = "student_information")
@Data
public class StudentInformation {
     @PrimaryKey(value = "student_id")
     String studentId;


     @Column(value = "class_name")
     String className;

    @Column(value = "class_section")
     String classSection;

    @Column(value = "class_roll")
     Integer classRoll;

    @Column(value = "date_joined")
     LocalDateTime dateJoined;

    @Column(value = "is_current_student")
     boolean isCurrentStudent;

     String fname;
     String lname;
}
