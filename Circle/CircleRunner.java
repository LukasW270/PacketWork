package Circle;

public class CircleRunner {
    
    public static void main(String[] args){

        Circle circle = new Circle(3);
        double c = circle.getC();
        System.out.println("The circumference is " + c);

        double a = circle.getA();
        System.out.println("The area is " + a);

        circle.changeR(1);

        a = getArea();
        System.out.println("The new area is " + a);
    }

}
