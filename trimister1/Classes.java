 class myFirstNewClass{
    int row;
    int col;
}
 class StringIntPair{
    int freq;
    String string;
}
class StudentData{
    String name;
    String email;
    String phNo;
    String parentPhNo;
    int rollNo;
    int homeTownPinCode;
    String MentorEmail;

    public StudentData(String n,String e){
       name = n;
       email = e;
    }
    public StudentData(int aa,String n,String e){
       name = n;
       email = e;
       rollNo = aa;
    }
    int getRollNo(){    
        return rollNo;
    }
    boolean equalsrollno(StudentData s){
        if(this.rollNo != s.rollNo)
        return false;
        return true;
    }
}
public class Classes{

    public static myFirstNewClass CheckForTheTarget(int[][] a,int target){
        myFirstNewClass hey = new myFirstNewClass();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == target) {
                    hey.col = j;
                    hey.row = i;
                    break;
                }
            }
        }
        return hey;
    }

    public static StringIntPair CheckForTheHighFreqString(String[] aa){
        StringIntPair ans = new StringIntPair();
        int max=0;
        String MaxString ="";
        for(int i=0;i<aa.length;i++){
            int temp=freaquency(aa, aa[i]);
         if(temp>max){
            max=temp;
            MaxString=aa[i];
         }
        }
        ans.freq=max;
        ans.string=MaxString;
        return ans;
    }

    public static int freaquency(String []a,String target){
        int count=0;
        for(int i=0;i<a.length;i++){
          if(a[i]==target)
          count++;
        }
        return count;
    }
    public static void main(String[] args) {
        myFirstNewClass neww = new myFirstNewClass();
        neww.col=10;
        neww.row=20;

        // int arr[][] = { 
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // neww = CheckForTheTarget(arr, 0);

        // System.out.println(neww.col+" "+neww.row);

        String aa[] = {"abc","aaa","abc","Aaa","abc"};
        StringIntPair str = new StringIntPair();
        str = CheckForTheHighFreqString(aa);
        System.out.println(str.freq+" "+str.string);


        //This is a Special Type Of Fucnction Is Know as Construuctor
        StudentData s1 = new StudentData("Narasimha","S.narawsi");
       System.out.println(s1.name+" "+s1.email+" "+s1.rollNo);
       StudentData s2 = new StudentData(0,"Narasimha","S.narawsi");
       System.out.println(s2.name+" "+s2.email+" "+s2.rollNo);
       System.out.println(s1.equals(s2));
       System.out.println(s1.equalsrollno(s2));
       System.out.println(s1);
       System.out.println(s2);

    }
}