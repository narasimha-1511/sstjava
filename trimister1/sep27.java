public class sep27 {
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void PrintFrom0toN(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        PrintFrom0toN(n - 1);
        System.out.print(n + " ");
    }

    public static void printarr(int arr[], int index) {
        if (index + 1 < arr.length)
            printarr(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static int sumOfDigits(int n) {
        int lastdigit = n % 10;
        if (n == 0)
            return 0;
        return sumOfDigits(n / 10) + lastdigit;
    }

    public static Boolean isPalindromeUnOptimized(String a) {

        if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        }
        if (a.length() > 2) {
            return isPalindromeUnOptimized(a.substring(1, a.length() - 1));
        }
        return true;

    }

    public static Boolean isPalindromeOptimized(String a, int start, int end) {

        if (a.charAt(start) != a.charAt(end)) {
            return false;
        }
        if (end - start + 1 > 2) {
            return isPalindromeOptimized(a, start + 1, end - 1);
        }
        return true;

    }
    public static Boolean isPalindrome(String a) {

        return isPalindromeOptimized(a, 0, a.length()-1);

    }

    public static int fibonacci(int N){
        if(N<=2){
            return 1;
        }
        return fibonacci(N-1)+fibonacci(N-2);
    }

    public static void main(String[] args) {
        PrintFrom0toN(5);
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5 };
        printarr(arr, 0);
        System.out.println();
        System.out.println(sumOfDigits(238));

        System.out.println(isPalindrome("abceba"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abccba"));

    }
}
