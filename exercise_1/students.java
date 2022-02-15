// package problem_A;


public class students extends person{
   String batch;

    students(int id,String name,String department,String batch){
        this.id=id;
        this.name=name;
        this.department=department;
        this.batch=batch;
    }
    void show_c(){
       show_a();
       System.out.println("batch"+batch);
    }

}

