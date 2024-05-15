package Travel;

public class Travel {
    
    private int people;

    public Travel(int n){
        people = n;
    }

    public int goByVan(){
        int b = (people - (people % 8))/8;
        return b;
    }

    public int goByCanoe(){
        int c = (people - (people % 3))/3;
        return c;
    }

    public int goByPlane(){
        int p = (people - (people % 12))/12;
        return p;
    }

}
