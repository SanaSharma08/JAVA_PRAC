package packu;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++) {
            int var = sc.nextInt();
            nums[i] = var;
        }
        //for each loop
//        for(int e : nums){
//            System.out.println(e);
//        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        arr[0]=99;
    }
}
