package com.dtcc.exams.part3;

public enum RockPaperScissors{
    ROCK,
    PAPER ,
    SCISSORS;

    RockPaperScissors rockpaperscissors;

    private RockPaperScissors(){
    }

    public RockPaperScissors getWinningSign() {
        if(this == RockPaperScissors.PAPER){ rockpaperscissors=RockPaperScissors.SCISSORS;}
        else if(this == RockPaperScissors.ROCK){ rockpaperscissors=RockPaperScissors.PAPER;}
        else if(this == RockPaperScissors.SCISSORS){ rockpaperscissors=RockPaperScissors.ROCK;}
        return rockpaperscissors;
    }

    public RockPaperScissors getLosingSign() {
        if(this == RockPaperScissors.PAPER){ rockpaperscissors=RockPaperScissors.ROCK;}
        else if(this == RockPaperScissors.ROCK){ rockpaperscissors=RockPaperScissors.SCISSORS;}
        else if(this == RockPaperScissors.SCISSORS){ rockpaperscissors=RockPaperScissors.PAPER;}
        return rockpaperscissors;
    }
}
