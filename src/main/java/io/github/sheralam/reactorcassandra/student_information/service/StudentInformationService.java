package io.github.sheralam.reactorcassandra.student_information.service;

import io.github.sheralam.reactorcassandra.student_information.entity.StudentInformation;
import io.github.sheralam.reactorcassandra.student_information.repository.StudentInformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class StudentInformationService {
    private final StudentInformationRepository studentInformationRepository;

    public Flux<StudentInformation> getAll(){
        return studentInformationRepository.findAll();
    }
}
