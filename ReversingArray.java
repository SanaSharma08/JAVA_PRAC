package packu;
import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,99,1111};
        int[] arr1={1,2,3,4,5,6,7,8,99,1111}; // methos modify arrayin place so if we use methods on same array , 1st method would receive original array & 2nd would reveice reversed array so outputs of both will be reverse of eachother.
        System.out.println("OUTPUT BY FOR LOOP METHOD: " + rev(arr));
        System.out.println("OUTPUT BY WHILE LOOP METHOD: " + rev2(arr1));
    }
    static  void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    //2 pointer method
    //Approach 1: for loop
    static String rev(int arr[]){
        int len=arr.length-1;
        for(int i=0;i<len;i++){ //loop terminates at i>len=true
            swap(arr,i,len);
            len--;
        }
        return Arrays.toString(arr);
    }
    //or
    //Approach 2: while loop
    static String rev2(int arr[]){
        int start=0;
        int end=arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return Arrays.toString(arr);
    }

}
