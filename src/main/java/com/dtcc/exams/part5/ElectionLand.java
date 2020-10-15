package com.dtcc.exams.part5;

import java.util.*;

public class ElectionLand {

    public String electionWinner(String[] votes){
        String winner=null;
        TreeSet<String> tree = new TreeSet<String>();

        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<votes.length;i++){
            map.put(votes[i], map.containsKey(votes[i]) ? map.get(votes[i]) + 1 : 1);
        }
        int max= Collections.max(map.values());

        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(e.getValue()==max){
                tree.add(e.getKey());
            }
        }
        winner=tree.last();
        return winner;
    }
}
