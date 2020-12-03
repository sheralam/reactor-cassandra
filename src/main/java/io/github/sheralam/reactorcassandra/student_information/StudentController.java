package io.github.sheralam.reactorcassandra.student_information;

import io.github.sheralam.reactorcassandra.student_information.entity.StudentInformation;
import io.github.sheralam.reactorcassandra.student_information.service.StudentInformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentInformationService studentInformationService;

    @GetMapping("/information")
    public Flux<StudentInformation> getAllStudentInformation(){
       return studentInformationService.getAll();
    }

}
