package Cube;

public class CubeRunner {
    public static void main(String[] args){

        Cube cube = new Cube(3.0);
        double v = cube.volume();
        System.out.println("The volume of the cube is " + v + " cubic units.");
        double s = cube.surfaceArea();
        System.out.println("The surface area of the cube is " + s + " square units.");

        cube.setSideForVolume(125.0);
        double a = cube.getSide();
        s = cube.surfaceArea();
        System.out.println("The side length is now " + a + " units.\nThe surface area is " + s + " square units.");

    }
}
