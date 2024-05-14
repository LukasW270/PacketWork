package Box;

public class BoxRunner {
    public static void main(String[] args){

        Box one = new Box(2.0,6.0);
        double areaOne = one.getArea();
        System.out.println("The area is: " + areaOne);

        one.bigger(2);
        
        double perimeter = one.getPerimeter();
        System.out.println("The doubled result is " + perimeter);
        

    }
}
