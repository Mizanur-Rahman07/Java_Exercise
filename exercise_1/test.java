// package problem_A;


public class test {
    public static void main(String[] args) {
        Teacher t1=new Teacher(2000,"Mizan","Software  Engineering","Professor");


        Teacher t2=new Teacher(2001,"Munna","Software  Engineering","Lecturer");


        students s1=new students(2482,"Khaled","Software Engineering","25");


        students s2=new students(2482,"Jamal","Software Engineering","25");
        System.out.println("Teacher Information :");
        t1.show_b();
        System.out.println();
        t2.show_b();
        System.out.println();
        System.out.println("Student Information");
        s1.show_c();
        System.out.println();
        s2.show_c();
        System.out.println();

    }

}
