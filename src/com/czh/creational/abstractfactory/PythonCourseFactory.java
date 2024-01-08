package com.czh.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Note getNote() {
        return new PythonNote();
    }
}
