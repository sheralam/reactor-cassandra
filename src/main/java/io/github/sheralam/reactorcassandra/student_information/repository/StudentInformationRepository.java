package io.github.sheralam.reactorcassandra.student_information.repository;

import io.github.sheralam.reactorcassandra.student_information.entity.StudentInformation;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentInformationRepository extends ReactiveCassandraRepository<StudentInformation, String> {
}
