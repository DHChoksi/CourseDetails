package com.Assignment1_Program3.Courses;

public class Textbook
{
    private String m_Title;
    private String m_Author;
    private String m_Publisher;

    // Constructor
    public Textbook(String title, String author, String publisher)
    {
        this.m_Title = title;
        this.m_Author = author;
        this.m_Publisher = publisher;
    }

    // Getters and Setters
    public String getTitle()
    {
        return m_Title;
    }

    public void setTitle(String title)
    {
        m_Title = title;
    }

    public String getAuthor()
    {
        return m_Author;
    }

    public void setAuthor(String author)
    {
        m_Author = author;
    }

    public String getPublisher()
    {
        return m_Publisher;
    }

    public void setPublisher(String publisher)
    {
        m_Publisher = publisher;
    }

    // Method to display textbook information
    public void display()
    {
        System.out.println("Textbook: " + m_Title + " by " + m_Author + ", Publisher: " + m_Publisher);
    }
}