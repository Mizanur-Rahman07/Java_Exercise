// package problem_A;


public class Teacher  extends person {
    public String designation;

    Teacher(int id,String name,String department,String designation){
        this.id=id;
        this.name=name;
        this.department=department;
        this.designation=designation;
    }
    void show_b(){
        show_a();
        System.out.println("designation"+designation);
    }


}
