
public class Test {
    public static void main(String[] args) {
        Cars c1=new Cars("Hybride","181","Red","50","500","5","7");

        Cars c2=new Cars("Alion","182","Green","50","400","7","5");

        Bikes b1=new Bikes("Black","v4","CBS_Hidrolick","R15","6","160");
Bikes b2=new Bikes("Black","Cbr","Non_CBS_Hidrolick","FZ","5","160");
        System.out.println("Car Information:");
        c1.show_b();
        System.out.println();
        c2.show_b();
        System.out.println();
        System.out.println("Bikes Information");
        b1.show_c();
        System.out.println();
        b2.show_c();
        System.out.println();
    }

}
