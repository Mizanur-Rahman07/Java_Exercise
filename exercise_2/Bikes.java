
public class Bikes extends Betweentwoveheciles {
    String breaktype;
    Bikes(String company,String Model,String Colour,String numberofcc,String mileage,String breaktype){
        this.Colour=Colour;
        this.Model=Model;
        this.breaktype=breaktype;
        this.company=company;
        this.mileage=mileage;
        this.numberofcc=numberofcc;
    }
    void show_c(){
        show_a();
        System.out.println(breaktype+"breaktype");
    }
}
