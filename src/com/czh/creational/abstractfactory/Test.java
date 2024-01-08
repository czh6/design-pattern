package com.czh.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory1 = new JavaCourseFactory();
        Video video1 = courseFactory1.getVideo();
        Note note1 = courseFactory1.getNote();
        video1.play();
        note1.read();

        CourseFactory courseFactory2 = new PythonCourseFactory();
        Video video2 = courseFactory2.getVideo();
        Note note2 = courseFactory2.getNote();
        video2.play();
        note2.read();
    }
}
