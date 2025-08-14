package packu;

public class Overloading {
    static void fun(int a){
        System.out.println(2*a);
    }
    static void fun(String a){
        System.out.println(a + "!!");
    }
    static void fun(int a, int b){
        System.out.println("Sum: " + (a + b));
    }
    public static void main(String[] args){
        fun(67);
        fun("Hello User");
        fun(88,100);

    }
}
