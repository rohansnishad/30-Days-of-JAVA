package Day9;

interface vehical{
    void start();
    void Stop();

}

class car implements vehical{
    @Override
    public void start() {
        System.out.println("Car has Started");
    }

    @Override
    public void Stop() {
        System.out.println("Car has Stoped");
    }
}
public class interfaces extends car{

    public static void mai(String[] args){
        car c = new car();
        c.start();
        c.Stop();
    }
}
