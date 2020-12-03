package io.github.sheralam.reactorcassandra.student_information.entity.primary_keys;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Objects;

@PrimaryKeyClass
@Data
public class StudentReportKey implements Serializable {
    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private final String studentId;

    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    private final short year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentReportKey that = (StudentReportKey) o;
        return year == that.year &&
                studentId.equals(that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, year);
    }
}
