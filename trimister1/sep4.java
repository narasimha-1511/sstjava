// Solving The Rectangle Problem aagain
class Rectangle {
    int len;
    int br;

    public Rectangle(int l, int b) {// ->Here sep4 is Rectangle
        this.len = l;
        this.br = b;
    }

    int area() {
        return this.len * this.br;
    }

    boolean issquare() {
        return this.len == this.br;
    }

    boolean isAreaGreater(int k) {
        return this.area() > k;
    }
}

class Student{
    String name,email,metorEmail;
    long PhNo;
    int Scholarship,cgr,HomeTownPincode;
    
    public Student(String name,String email,long ph,int Pincode){
      this.name = name;
      this.email = email;
      this.PhNo = ph;
      this.HomeTownPincode=Pincode;
    }
    public Student(String mentor,int cgr,int Scholarship){
      this.metorEmail=mentor;
      this.cgr=cgr;
      this.Scholarship=Scholarship;
    }
    String getName(){
        return this.name;
    }
    String getEmail(){
        return this.email;
    }
    long getPhNo(){
        return this.PhNo;
    }

    void PrintProfile(){
        System.out.println("Student's Name="+this.name);
        System.out.println("Student's Email="+this.email);
        System.out.println("Student's Phone Number="+this.PhNo);
    }
    boolean belongToSameLocality(Student c){
      return this.HomeTownPincode==c.HomeTownPincode;
    }
    void HomeTown(){
        System.out.println("Home TOwn Pincode = "+this.HomeTownPincode);
    }
    int calculateFee(){
        return (int) (500000.0-((Scholarship/100.0)*500000.0));
    }

}

public class sep4 {

    // Solving the Rectanlge Question AGaign
    int[] solve(int[] A, int B[]) {

        int ans[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            // Creating a new Reactangle Object
            Rectangle rectI = new Rectangle(A[i], B[i]);
            // Iterate over all the rectangles on the left Side of i
            int count = 0;// For Counting sqaures and Area is greater than them or not
            for (int j = 0; j < i; j++) {
                Rectangle rectJ = new Rectangle(A[j], B[j]);
                if (rectJ.issquare() && rectJ.isAreaGreater(rectI.area())) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
