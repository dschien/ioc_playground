package com.schien;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by csxds on 04/07/2017.
 */
@Component
@Qualifier("Blackboard")
public class BlackboardTEPlatform implements TEPlatform {
    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public void failStudent(Student student) {

    }
}
