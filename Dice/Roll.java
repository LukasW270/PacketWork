package Dice;

public class Roll {
    public static void main(String[] args){

        int total1 = 0; int total2 = 0;
        
        Dice one = new Dice();
        for (int i = 0; i<=100; i++){
            one.roll();
            
            if (one.getTotal() == 7 || one.getTotal() == 11){
                total1 = total1 + 1;
            }
            else if (one.getTotal() == 2 || one.getTotal() == 3 || one.getTotal() == 12){
                total2 = total2 + 1;
            }
        }

        System.out.println("You rolled a 7 or 11\t\t" + total1 + "% of the time.");
        System.out.println("You rolled a 2, 3, or 12\t" + total2 + "% of the time.");

    }
}
