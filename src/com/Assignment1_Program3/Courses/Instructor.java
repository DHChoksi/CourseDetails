package com.Assignment1_Program3.Courses;

public class Instructor
{
    private String m_FirstName;
    private String m_LastName;
    private String m_OfficeNumber;

    // Constructor
    public Instructor(String firstName, String lastName, String officeNumber)
    {
        this.m_FirstName = firstName;
        this.m_LastName = lastName;
        this.m_OfficeNumber = officeNumber;
    }

    // Getters and Setters
    public String getM_FirstName()
    {
        return m_FirstName;
    }

    public void setM_FirstName(String m_FirstName)
    {
        this.m_FirstName = m_FirstName;
    }

    public String getM_LastName()
    {
        return m_LastName;
    }

    public void setM_LastName(String lastName)
    {
        this.m_LastName = lastName;
    }

    public String getM_OfficeNumber()
    {
        return m_OfficeNumber;
    }

    public void setM_OfficeNumber(String officeNumber)
    {
        m_OfficeNumber = officeNumber;
    }

    public void display()
    {
        System.out.println("Instructor: " + m_FirstName + " " + m_LastName + ", Office: " + m_OfficeNumber);
    }
}