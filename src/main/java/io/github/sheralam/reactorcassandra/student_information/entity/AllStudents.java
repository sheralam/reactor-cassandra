package io.github.sheralam.reactorcassandra.student_information.entity;

import io.github.sheralam.reactorcassandra.student_information.entity.primary_keys.AllStudentKey;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@Data
@RequiredArgsConstructor
public class AllStudents {

    @PrimaryKey
    final AllStudentKey allStudentKey;
    String classSection;
    short classRoll;
    String fname;
    String lname;
}
