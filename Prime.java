package packu;
import java.util.*;

public class Prime {
    public boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int temp = 2;
        while (temp <= Math.sqrt(num)) {
            if (num % temp == 0) {
                return false;
            }
            temp++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Prime pp=new Prime();
        int number=sc.nextInt();
        boolean b= pp.isPrime(number);
        System.out.println(b);

    }
}
