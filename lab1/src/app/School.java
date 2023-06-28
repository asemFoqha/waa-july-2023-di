package app;

import dependencyInjection.Dependency;

public class School {
    @Dependency
    private Student student;

    @Dependency
    private Course course;

    public void runApp(){
        student.print();
        course.print();
    }
}
