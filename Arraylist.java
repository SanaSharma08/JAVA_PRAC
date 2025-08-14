package packu;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(10);
        arr1.add(12);
        arr1.add(13);
        arr1.add(33);
        arr1.add(45);
        arr1.add(99);
        arr1.add(80);
        arr1.add(200);
        arr1.add(189);
        arr1.add(60);
        arr1.add(0);
        System.out.println(arr1.size());
        System.out.println(arr1);
        System.out.println(arr1.get(2));
        System.out.println(arr1.set(5,400)); //returns value being replaced- here:80
        System.out.println(arr1.remove(8));
        System.out.println(arr1.size());
    }
}
