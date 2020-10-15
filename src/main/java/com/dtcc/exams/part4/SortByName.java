package com.dtcc.exams.part4;

import java.util.Comparator;

public class SortByName implements Comparator<Geometry> {

    @Override
    public int compare(Geometry o1, Geometry o2) {
       // return o1.getName().compareTo(o2.getName());
        String []circle=o1.getClass().getName().split("\\.");
        String [] rectangle=o2.getClass().getName().split("\\.");
        return circle[circle.length-1].compareTo(rectangle[rectangle.length-1]);
    }
}
