package com.schien;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by csxds on 04/07/2017.
 */
@Component
public class SAFETEPlatform implements TEPlatform {
    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public void failStudent(Student student) {

    }
}
