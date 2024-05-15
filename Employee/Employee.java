package Employee;

public class Employee {

    private double salary;

    public Employee(double s){

        salary = s;

    }

    public void increase(double i){

        if (i > 0){
            salary = salary + i;
        }

    }

    public double getPay(){

        return salary;

    }

}
