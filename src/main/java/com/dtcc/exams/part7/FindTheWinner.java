package com.dtcc.exams.part7;

public class FindTheWinner {

    public FindTheWinner(){

    }
    public String winner(Integer[] leon,Integer[] wilhelm,String input){
        String winner=null;
         Integer player1=0;
         Integer player2=0;
        if(input.equalsIgnoreCase("even")){
            for(int i=0;i<leon.length;i++){
                if(i%2==0) {
                    player1 += leon[i] - wilhelm[i];
                    player2 += wilhelm[i] - leon[i];
                }
            }
            if(player1>player2){ winner="Zan"; }
            else if(player2> player1){ winner="Brian"; }
            else {winner="Tie";}
        }
        else if(input.equalsIgnoreCase("odd")){
            for(int i=0;i<leon.length;i++){
                if(i%2==1) {
                    player1 += leon[i] - wilhelm[i];
                    player2 += wilhelm[i] - leon[i];
                }
            }
            if(player1>player2){ winner="Zan"; }
            else if(player2> player1){ winner="Brian"; }
            else {winner="Tie";}
        }
        return winner;
    }
}
