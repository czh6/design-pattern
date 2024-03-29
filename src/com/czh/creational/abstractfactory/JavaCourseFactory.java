package com.czh.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Note getNote() {
        return new JavaNote();
    }
}
