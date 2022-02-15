
public class Cars extends Betweentwoveheciles{
    String numberofseat;
    String numberofdoor;
    Cars(String company,String Model,String Colour,String numberofcc,String mileage,String numberofseat, String numberofdoor ){
                this.company=company;
                this.Model=Model;
                this.Colour=Colour;
                this.mileage=mileage;
                this.numberofcc=numberofcc;
                this.numberofdoor=numberofdoor;
                this.numberofseat=numberofseat;
    }
                void show_b(){
                  show_a();
                    System.out.println("numberofseat"+numberofseat);
                    System.out.println("numberofdoor"+numberofdoor);
    }
    }
