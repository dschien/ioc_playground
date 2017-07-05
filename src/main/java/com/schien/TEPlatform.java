package com.schien;

import java.util.List;

/**
 * Created by csxds on 04/07/2017.
 */
public interface TEPlatform {
    public List<Student> getStudents();

    public void failStudent(Student student);
}
