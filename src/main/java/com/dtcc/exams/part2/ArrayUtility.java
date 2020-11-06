package com.dtcc.exams.part2;

import java.sql.Array;
import java.util.*;

public class ArrayUtility<ArrayDataType> {
//ArrayUtility<Integer> arrayUtility = new ArrayUtility<>(inputArray);
   public Object[] inputArray;
   public ArrayUtility(ArrayDataType[] inputArray){
       this.inputArray=inputArray;
   }

    public Integer countDuplicatesInMerge(ArrayDataType[] arrayToMerge, ArrayDataType valueToEvaluate){
        int count=0;

        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==valueToEvaluate){
                count++;
            }
        }
        for(int i=0;i<arrayToMerge.length;i++){
            if(arrayToMerge[i]==valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public ArrayDataType getMostCommonFromMerge(ArrayDataType[] arrayToMerge, ArrayDataType valueToEvaluate){

       Map<ArrayDataType,Integer> map=new HashMap<ArrayDataType,Integer>();
       for(int i=0;i<arrayToMerge.length;i++){  //loop for ArrayToMerge
           if(map.containsKey(arrayToMerge[i])){
                int value= map.get(arrayToMerge[i]);
                map.put(arrayToMerge[i],value+1);
           }
           else{
               map.put(arrayToMerge[i],1);
           }
       }

        for(int i=0;i<inputArray.length;i++){ //loop for inputarray
            if(map.containsKey(inputArray[i])){
                int value= map.get(inputArray[i]);
                map.put((ArrayDataType) inputArray[i],value+1);
            }
            else{
                map.put((ArrayDataType) inputArray[i],1);
            }
        }

       int maxValueInMap=(Collections.max(map.values()));
       ArrayDataType mostCommon=null;
        for (Map.Entry<ArrayDataType,Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                mostCommon=entry.getKey();
            }
        }

      // return valueToEvaluate;
       return mostCommon;
    }

    public ArrayDataType[] removeValue(ArrayDataType valueToRemove){

        List<ArrayDataType> list=new ArrayList<ArrayDataType>();

        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]!=valueToRemove){
               list.add((ArrayDataType) inputArray[i]);
            }
        }

        ArrayDataType[] arrayToSend= (ArrayDataType[]) new Object[list.size()];
        arrayToSend=(ArrayDataType[]) list.toArray(arrayToSend);

        return arrayToSend;

    }

    public Integer getNumberOfOccurrences(ArrayDataType valueToEvaluate ){
        int count=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==valueToEvaluate){
                count++;
            }
        }
        return count;
    }
}
