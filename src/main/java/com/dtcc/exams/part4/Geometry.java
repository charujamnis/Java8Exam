package com.dtcc.exams.part4;

public class Geometry implements Circle, Rectangle{
    int height;
    int width;
    int radius;

    public Geometry(){

    }
    public Geometry(int height, int width, int radius){
        this.height=height;
        this.width=width;
        this.radius=radius;
    }

    @Override
    public double area(int radius) {
        return 0;
    }

    @Override
    public int area(int height, int width) {
        return 0;
    }

    public double getArea(int radius) {
        double area;
        area=3.14*radius*radius;
        return area;
    }

    public int getArea(int height,int width) {
        int area;
        area=height*width;
        return area;
    }
}
