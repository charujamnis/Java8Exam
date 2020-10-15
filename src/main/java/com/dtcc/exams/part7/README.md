## Find the Winner!

Zan and Brian each have a deck of numbered cards in a pile face down. 
They play a game where they each alternately discard and flip the cards on the pile from top to bottom. 
At the beginning of the game, someone will call out "Even" or "Odd". The first move depends on which is called. 
If "Even" is called, the player's top cards are flipped so they can see the face value. 
If instead "Odd" is called, the top card is removed from each deck and discarded, then each flips his next card. 
Zan subtracts the value of Brian's card from his own and adds the result to his score. 
Likewise, Brian subtracts the value of Zan's card from his own and adds the result to his score.

 

From this point forward, each alternately discards then flips a card.
Each time two cards are flipped, the players' scores are computed as before. 
Once all the cards have been played, whoever has the most points wins. 
You must determine the name of the winner if there is one, otherwise they tie.  Return Zan, Brian or Tie.

 

### Function Description

Complete the winner function in the editor below. It has the following parameters:

```
public String winner(int[] player1, int[] player2, String s) {

}
```

### Test Case

```
@Test
public void winnerTest1(){
    Integer[] zan = {1,2,3};
    Integer[] brian = {2,1,3};
    String input = "Even";
    FindTheWinner findTheWinner = new FindTheWinner();
    String expected = "Brian";
    String actual = findTheWinner.winner(zan, brian, input);
    Assert.assertEquals(expected, actual);
}
```

### Explanation

In this game, Zan = [1, 2, 3] and Brian = [2, 1, 3]. 

Because s = Even, the only cards flipped are at indexes 0 and 2.

* When i = 0, 
	* Zan gets Zan<sub>[0]</sub> − Brian<sub>[0]</sub> = 1 − 2 = -1 point 
	* Brian gets Brian<sub>[0]</sub> − Zan<sub>[0]</sub> = 2 − 1 = 1 point.
* When i = 2, 
	* Zan gets Zan<sub>[2]</sub> − Brian<sub>[2]</sub> = 3 − 3 = 0 points 
	* Brian gets Brian<sub>[2]</sub> − Leon<sub>[2]</sub> = 3 − 3 = 0 points.

At the end of play, Zan's cumulative score is -1 and Brian's is 1 so Brian wins.