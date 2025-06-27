package Day6;


class vehicals{
    String car ,bike;


    void Showinfo(){
        System.out.println(" Car  "+car);
        System.out.println(" Bike  "+bike);
    }
}
public class oops extends vehicals {
    public static void main(String[] args){

        vehicals v = new vehicals();
        v.bike="KTM";
        v.car="BMW";
        v.Showinfo();
    }
}
