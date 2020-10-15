package com.dtcc.exams.part1;

public class DelTechConcatenator {
    Integer input;

    public DelTechConcatenator(Integer input) {
        this.input=input;
    }

    public boolean isDel(){
        if(this.input %3 ==0){return true;}
        else {return false;}
    }

    public boolean isTech(){
        if(this.input % 5 ==0){return true;}
        else {return false;}
    }

    public boolean isDelTech(){
        if(this.input % 3 == 0 && this.input % 5 == 0){return true;}
        else {return false;}
    }
}
