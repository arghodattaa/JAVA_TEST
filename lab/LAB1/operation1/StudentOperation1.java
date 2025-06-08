package operation1;
import student.*;
//use abstraction concept 
public class StudentOperation1 extends Student {
    public StudentOperation1(){}
    
    public StudentOperation1(String name, String id, double cgpa, double point) {
        super(name, id, cgpa, point);
      
    }

    public  void allShow(){
        System.out.println(subInfo());
        System.out.println("CGPA : "+ getCgpa()+ " point : "+ getPoint());
    }
}
