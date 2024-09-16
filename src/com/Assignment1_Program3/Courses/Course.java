package com.Assignment1_Program3.Courses;

public class Course {
    private String m_CourseName;
    private Textbook[] m_Textbooks;
    private Instructor[] m_Instructors;

    // Constructor
    public Course(String courseName, Instructor[] instructors, Textbook[] textbooks)
    {
        m_CourseName = courseName;
        m_Instructors = instructors;
        m_Textbooks = textbooks;
    }

    // Getters and Setters
    public String getCourseName()
    {
        return m_CourseName;
    }

    public void setCourseName(String courseName)
    {
        m_CourseName = courseName;
    }

    public Instructor[] getInstructors()
    {
        return m_Instructors;
    }

    public void setInstructors(Instructor[] instructors)
    {
        m_Instructors = instructors;
    }

    public Textbook[] getTextbooks()
    {
        return m_Textbooks;
    }

    public void setTextbooks(Textbook[] textbooks)
    {
        m_Textbooks = textbooks;
    }

    public void displayCourseInfo()
    {
        System.out.println("Course Name: " + m_CourseName);

        for (Instructor instructor : m_Instructors)
        {
            instructor.display();
        }

        for (Textbook textbook : m_Textbooks)
        {
            textbook.display();
        }
    }
}