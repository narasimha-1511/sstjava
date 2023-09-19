class user {
    private String name, email;
    private String PhNo;
    private int HomeTownPincode;

    public user(String name, String email, String ph, int Pincode) {
        this.name = name;
        this.email = email;
        this.PhNo = ph;
        this.HomeTownPincode = Pincode;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    String getPhNo() {
        return this.PhNo;
    }

    void PrintProfile() {
        System.out.println(" Name=" + this.name);
        System.out.println(" Email=" + this.email);
        System.out.println(" Phone Number=" + this.PhNo);
    }

    int getHometown() {
        return this.HomeTownPincode;
    }

    boolean belongToSameLocality(Student c) {
        return this.HomeTownPincode == c.getHometown();
    }

    void HomeTown() {
        System.out.println("Home TOwn Pincode = " + this.HomeTownPincode);
    }

}

class Student extends user {

    public Student(String name, String email, String ph, int pincode) {
        super(name, email, ph, pincode);
    }

    private String mentorEmail;
    private double cgr;
    private int Scholarship;

    int calculateFee() {
        return (int) (500000.0 - ((Scholarship / 100.0) * 500000.0));
    }

    void setMentorEmail(String s) {
        this.mentorEmail = s;
    }

    void setCGR(double a) {
        this.cgr = a;
    }

    void setscholarship(int a) {
        this.Scholarship = a;
    }

    String getMentorEmail() {
        return this.mentorEmail;
    }

    double getcgr() {
        return this.cgr;
    }

    int GetScholarship() {
        return this.Scholarship;
    }

    void PrintProfile() {
        System.out.println("---Studnet--Class-0-");
        System.out.println(" Name=" + this.getName());
        System.out.println(" Email=" + this.getEmail());
        System.out.println(" Phone Number=" + this.getPhNo());
    }

}

class Mentor extends user {
    private String jobProfile;
    private String Company;
    int YOE;

    public Mentor(String name, String email, String ph, int pincode) {
        super(name, email, ph, pincode);
    }

    int getYOE() {
        return this.YOE;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Narasimha", "facebook", "9014325088", 500062);
        Student s2 = new Student("Devil", "hahaah", "null", 500062);
        Mentor m1 = new Mentor("narasimha", null, null, 500062);
        s1.PrintProfile();
        System.out.println(m1.belongToSameLocality(s2));
        // As Student Class extends a User
        // Student is a User...
    }
}
