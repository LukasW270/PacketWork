package Dice;

public class Dice{
    private int die1, die2;

    public Dice(){
        die1 = (int)(Math.random()*6);
        die2 = (int)(Math.random()*6);
    }

    public void roll(){
        die1 = (int)(Math.random()*6);
        die2 = (int)(Math.random()*6);
    }

    public int getTotal(){
        int sum = die1 + die2;
        return sum;
    }

}