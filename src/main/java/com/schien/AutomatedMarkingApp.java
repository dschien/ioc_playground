package com.schien;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by csxds on 04/07/2017.
 */
@Component
public class AutomatedMarkingApp {

    private TEPlatform tePlatform;

    public AutomatedMarkingApp(@Qualifier("Blackboard") TEPlatform tePlatform) {
        this.tePlatform = tePlatform;
    }


    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("/application-context.xml");

        AutomatedMarkingApp app = (AutomatedMarkingApp) context.getBean("markingApp");
        app.markStudents();
    }


    private void markStudents() {
        for (Student student : this.tePlatform.getStudents()) {
            this.tePlatform.failStudent(student);
        }
    }
}
