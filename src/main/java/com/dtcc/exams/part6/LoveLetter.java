package com.dtcc.exams.part6;

import java.util.ArrayList;
import java.util.Arrays;

public class LoveLetter {

    Integer[] output;

    public Integer[] mystery(String[] input){
        ArrayList<Integer> list=new ArrayList<>();
        //String [] reverseString=new String[input.length];
        for(int i=0;i<input.length;i++) {
            int n = input[i].length();
            String strReverse = "";
            for (int j = n - 1; j >= 0; j--) {
                strReverse += input[i].charAt(j) + "";
            }
            if (strReverse.equalsIgnoreCase(input[i])) {
                //reverseString[i] = "Palindrome";
                list.add(i, 0);
            }
            else {
                int num = calculateNumber(input[i]);
                list.add(i, num);
            }
                //reverseString[i]=strReverse;
            }
        Integer[] output = list.toArray(new Integer[list.size()]);
        return output;
    }

    public Integer calculateNumber(String input){
        int score=0;
        for(int i=0,k=input.length()-1;i<input.length()/2;i++,k--){
            char left=input.charAt(i);
            char right=input.charAt(k);
            if(Character.getNumericValue(left)>Character.getNumericValue(right)){
                score+=Character.getNumericValue(left)-Character.getNumericValue(right);
            }
            else{
                score+=Character.getNumericValue(right)-Character.getNumericValue(left);
            }
        }
        return score;
    }
}


