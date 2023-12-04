import java.util.Scanner;

class circle{
    int radius;
    float pi =3.14f;
    public circle(int r){
       this.radius=r;
    }
    //This Returns The area of the circle
     double area(){
        return pi*this.radius*this.radius;
    }
     boolean equals(circle r){
        if(this.radius != r.radius)
        return false;
    return true;
    }
     double perimeter(){
    return 2*pi*this.radius;
    }
}

class Rectangle{
    int length;
    int breadth;
    public Rectangle(int r,int b){
       this.length=r;
       this.breadth=b;
    }
    //This Returns The area of the circle
     double area(){
        return this.length*this.breadth;
    }
     boolean isSquare(){
        if(this.length != this.breadth)
        return false;
    return true;
    }
     double perimeter(){
    return 2*(this.length+this.breadth);
    }
    boolean equals(Rectangle r){
        if(this.length != r.length || this.breadth != r.breadth)
        return false;
    return true;
    }
}

public class sep1{
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Radius Of the Cirlce");
    int r = in.nextInt();
    circle cobj = new circle(r);
    System.out.println(cobj.area()+" "+cobj.perimeter());
    circle cobj2 = new circle(5);
    System.out.println(cobj.equals(cobj2));

    
    System.out.println("Enter the length Of the rectangle");
    int l = in.nextInt();
    System.out.println("Enter the breafth Of the rectangle");
    int b = in.nextInt();
    Rectangle robj1 = new Rectangle(l,b);
    System.out.println(robj1.area()+" "+robj1.perimeter());
    System.out.println(robj1.isSquare());
    Rectangle isrect = new Rectangle(1,3);
    System.out.println(robj1.equals(isrect));

    in.close();

 }
}