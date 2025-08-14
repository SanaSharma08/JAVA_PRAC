package packu;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Methods {
    // (1) ADDITION FUNCTION - int
//    public static void  main(String[] args){
//        Methods sm=new Methods();
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1=sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2=sc.nextInt();
//        int result = sm.Sum(num1,num2);
//        System.out.println("The sum is : " + result);
//    }
//    public int Sum(int a , int b){
//        int sum = a + b;
//        return sum;
//    }


    // (2) GREETING FUNCTION - string
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        Methods mt = new Methods();
//        System.out.print("Enter your name: ");
//        String name = sc.next();
//        String greeting = mt.greet(name);
//        System.out.println(greeting);
//    }
//    public String greet(String a){
//        String arr[] = {"How are you " , "Nice to meet you " , "Hello " , "Good Morning " , "Have a nice day " , "Namaste "};
//        int min = 0;
//        int max = arr.length - 1;
//        Random random = new Random();
//        int randomNumber = random.nextInt((max - min) + 1) + min;
//        String wish = arr[randomNumber] + a + " !";
//        return wish;
//    }

    //Variable arguments
    public static void main(String[] args){
        fun(2,23,"hi" , "hello","nice");

        
    }
    static void fun(int a, int b, String ...elements){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(elements));
    }

}
