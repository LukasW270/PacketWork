package Travel;

public class Travel {
    
    private int people;

    public Travel(int n){
        people = n;
    }

    public int goByVan(){
        int b = (int) Math.ceil(people/8.0);
        return b;
    }

    public int goByCanoe(){
        int c = (int) Math.ceil(people/3.0);
        return c;
    }

    public int goByPlane(){
        int p = (int) Math.ceil(people/12.0);
        return p;
    }

}
