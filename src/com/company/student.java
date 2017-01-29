package com.company;

import java.io.Serializable;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Shafayat on 1/30/2017.
 */
public class student implements Serializable {
    private String name;
    private double GPA;
    public student(String name,double GPA)
    {
        this.name=name;
        this.GPA=GPA;
    }
    public void get()
    {
        System.out.println(name);
        System.out.println(GPA);
    }
}
