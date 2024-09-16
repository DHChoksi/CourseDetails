package com.Assignment1_Program3.Courses.CourseTest;

import  com.Assignment1_Program3.Courses.*;

public class CourseDemo
{
    public static void main(String[] args)
    {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "8-348");
        Instructor instructor2 = new Instructor("Markus", "Eger", "8-48");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("The Art of Game Design", "Jesse Schell", "A K Peters/CRC Press");

        Instructor[] instructors = {instructor1, instructor2};
        Textbook[] textbooks = {textbook1, textbook2};

        Course course = new Course("Advance software engineering", instructors, textbooks);

        course.displayCourseInfo();
    }
}
