package Dice;

public class Roll {
    public static void main(String[] args){

        int total = 0;
        
        Dice one = new Dice();
        for (int i = 0; i<=100; i++){
            one.roll();
            total = total + one.getTotal();
        }

    }
}
