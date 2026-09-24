package Allprojects;

abstract class Shape{
    abstract void area();

}
class Circle extends Shape{
    public void area(){
        int r = 4 ;
        System.out.println("area of circle is :"+3.14*r*r);
    }
}
class Rectangle extends Shape{
    public void area(){
         int l = 3 ;
        int b = 4 ;
       
        System.out.println("area of rectangle:"+l * b);
    }
}
class Triangle extends Shape{
    public void area(){
        int l1 = 3 ;
        int b1 = 4 ;
        System.out.println("area of triangle"+ (0.5*l1*b1));
    }
}


public class Myproject2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        // int r = 4 ;
        c1.area();

        Rectangle r1 = new Rectangle();
        r1.area();

        Triangle t1 = new Triangle();
        t1.area();
        
    }
}
