import java.util.*;
class lab1{

    static boolean leap(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static boolean alphabet(char ch){
        return (ch>='A' && ch<='Z') || (ch>='a' && ch<= 'z');
    }

    static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    static int fibonacci(int n ){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    // 5. Find GCD of two Numbers 
    static int gcd(int a , int b){
        int temp;
        while(b!=0){
            temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }

    // 6.Find LCM of two Numbers
    static int lcm(int a , int b){
        int lcm = 1;

        for (int i = 1; ; i++) {
            int multiple = a * i;

            if (multiple % b == 0) {
                lcm = multiple;
                break;
            }
        }

        return lcm;
    }

    // 7. Count Number of Digits in an Integer 
    static int count(int n){
        int count = 0; 
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }

    // 8.Reverse a number 
    static int reverse(int n){
        int rev = 0;
        int digit;
        while(n!=0){
            digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        return rev;
    }

    //  9.Calculate the Power of a Number 
    static int pow(int n, int power){
        for(int i = 0; i<power-1; i++){
            n *= n;
        }
        return n;
    }

    // 10.Check if Palindrome 
    static boolean palindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 1. Check if leap year 
        int year1 = 2022;
        int year2 = 2020;
        System.out.println(leap(year1));
        System.out.println(leap(year2));
        System.out.println(" ");

        // 2. Check if alphabet or not
        char c1 = 'a';
        char c2 = 2;
        System.out.println(alphabet(c1));
        System.out.println(alphabet(c2));
        System.out.println(" ");

        // 3.Find Factorial of a Number 
        int n = sc.nextInt();
        System.out.println(fact(n));
        System.out.println(" ");

        // 4.Display Fibonacci Series 
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // 5.Find GCD of two Numbers 
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(" ");

        // 6.Find LCM of two Numbers
        System.out.println(lcm(a,b));
        System.out.println(" ");
        
        // 7.Count Number of Digits in an Integer 
        System.out.println(count(n));
        System.out.println(" ");

        // 8.Reverse a Number 
        System.out.println(reverse(n));
        System.out.println(" ");

        // 9.Calculate the Power of a Number 
        System.out.println(pow(a,b));
        System.out.println(" ");

        // 10.Check Palindrome 
        String s = "Kavak";

        if(palindrome(s)){
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }

    }
}