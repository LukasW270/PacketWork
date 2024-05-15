package Travel;

public class TravelRunner {
    public static void main(String[] args){

        for (int i = 6; i <= 40; i = i+2){

            Travel travel = new Travel(i);
            int a = travel.goByVan();
            int b = travel.goByCanoe();
            int c = travel.goByPlane();

            System.out.println("people = " + i + ", vans = " + a + ", canoes = " + b + ", planes = " + c);

        }

    }
}
