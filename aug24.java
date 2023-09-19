public class aug24 {

    public static void prinAllCharectersInString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static int CountVowelsInString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    public static boolean CompareStringReversingString(String s) {
        if (s.equals(ReverseString(s)))
            return true;
        return false;
    }

    public static boolean CheckPlaindromeString(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String ReverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static String PasswordString(String s){
     int Score =0,lc=0,uc=0,num=0,spc=0;
     if(s.length()<8)
     return "Password Not Accepted";
     for(int i=0;i<s.length();i++){
        if(lc==0 && (int)s.charAt(i)>='a' && (int)s.charAt(i)<='z'){
            Score++;
            lc=1;
        }else if(uc==0 && (int)s.charAt(i)>='A' && (int)s.charAt(i)<='Z'){
            Score++;
            uc=1;
        }else if(num==0 && (int)s.charAt(i)<=57 && (int)s.charAt(i)>=48) {
            Score++;
            num=1; 
        }else if(spc==0 && (int)s.charAt(i)>=33 && (int)s.charAt(i)<=47){
          Score++;
          spc=1;
        }
        if(Score==4)break;
     }

     switch(Score){
        case 1:
       return "poor";
       case 2:
       return "weak";
       case 3:
       return "moderate";
       case 4:
       return "Strong";
     }
     return "0";

    }

    public static String ToggleTheString(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='Z'){
             //   int asc = ;
                ans+=(char)((int)s.charAt(i)+32);//Differece Between Two Charecters is 32
            }
            else{
                ans+=(char)((int)s.charAt(i)-32);
            }
        }
       return ans;
    }

    public static void main(String[] args) {
        // Today We are Learning about Strings
        String aa = "Hey ";
        aa += 'e';
        aa += "d";
        aa += 100;
        prinAllCharectersInString(aa);

        System.out.println(CheckPlaindromeString("MALAYALAM"));

        System.out.println(PasswordString("Strong!55"));

        System.out.println(ToggleTheString("Hey My Name Is Narasimha"));
    }
}
