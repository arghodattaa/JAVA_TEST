package student;
import man.*;
//use inheritance student extends man class
public abstract class Student extends Man{
    private String id = "00-00000-0";
    private double cgpa = 0.0;
    private double point = 0.0;
    public Student(){}
    public Student( String name, String id, double cgpa, double point){
        super( name);
        this.id = id;
        this.cgpa = cgpa;
        this.point = point;
    }
    public double getCgpa (){
         return cgpa;
    }
    public double getPoint(){
        return point;
    }
    public String subInfo(){
        return "Name : "+getName() + ".  ID : " + id; 
    }
    public abstract void allShow();
}