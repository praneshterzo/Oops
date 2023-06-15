
abstract class pranesh{
    abstract void name();

    public void type() {
        System.out.print("Employee");
    }
}

class terzo extends pranesh{

    @Override
    void name() {
        System.out.print("Terzo ");
    }

}

public class Main {

    public static void main(String args[]){

        pranesh p = new terzo();
        p.name();
        p.type();
    }
}