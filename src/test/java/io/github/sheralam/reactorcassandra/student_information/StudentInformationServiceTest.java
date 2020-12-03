package io.github.sheralam.reactorcassandra.student_information;

import groovy.util.logging.Slf4j;
import io.github.sheralam.reactorcassandra.student_information.service.StudentInformationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@Slf4j
@SpringBootTest
public class StudentInformationServiceTest {

    @Autowired
    StudentInformationService studentInformationService;

    private <T> void print(T object){
        System.out.println(object.toString());
    }

    @Test
    public void testFindAll(){
    }
}