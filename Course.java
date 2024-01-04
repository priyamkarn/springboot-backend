package com.scalar.springboot2.entities;

public class Course {
    public long id;
    public String title;
    public String description;
    public Course(long id,String title,String d)
    {
        this.id=id;
        this.title=title;
        this.description=d;
    }
    public void setID(long id)
    {
        this.id=id;
    }
    public long getID()
    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

}
