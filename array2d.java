package packu;

import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][]; //adding col not mandatory -jagged array
        int arr1[][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int arr3[][]=new int[3][3];

        //taking input for arr3
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                arr3[i][j]=sc.nextInt();
            }
        }
        //output of arr3
        System.out.println("arr3: ");
        for(int[] element:arr3){
            System.out.println(Arrays.toString(element));
        }

        //taking input for arr - jagged array
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter no. of columns for "+i+"row");
            int col_num=sc.nextInt();
            arr[i]=new int[col_num];
            System.out.println("Enter col value for this row");
            for(int j=0;j<col_num;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output of arr3
        System.out.println("arr:  jagged array");
        for(int[] element:arr){
            System.out.println(Arrays.toString(element));
        }

    }
}
