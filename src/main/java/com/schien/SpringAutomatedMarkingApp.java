package com.schien;

/**
 * Created by csxds on 05/07/2017.
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringAutomatedMarkingApp {

    private TEPlatform tePlatform;


    public SpringAutomatedMarkingApp(@Qualifier("Blackboard") TEPlatform tePlatform) {
        this.tePlatform = tePlatform;
    }


    @RequestMapping("/")
    private void markStudents() {
        for (Student student : this.tePlatform.getStudents()) {
            this.tePlatform.failStudent(student);
        }
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringAutomatedMarkingApp.class, args);
    }
}
