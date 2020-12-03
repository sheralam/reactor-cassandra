package io.github.sheralam.reactorcassandra.student_information.entity;

import io.github.sheralam.reactorcassandra.student_information.entity.primary_keys.StudentReportKey;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@RequiredArgsConstructor
public class StudentReport {
    //    PRIMARY KEY (student_id, year)
    @PrimaryKey
    final StudentReportKey studentReportKey;
    private String className;
    private String classSection;
    private short classRoll;
    private String cgpa;
    private String grade;

}
