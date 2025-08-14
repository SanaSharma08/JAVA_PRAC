package packu;
import  java.util.Arrays;

public class MaxArrayItem {
    public static void main(String[] args) {
        int[] arr={1,2,3,900,5,6,799,0,999};
        int[] arr1={};
        System.out.println(max(arr));
        System.out.println(max(arr1));
        System.out.println(maxinrange(arr,2,7));
    }
    //max in entire array
    static int max(int[] arr){
        //run only if array is not empty - else return 0;
        if(arr.length>0){
            int max=arr[0];
            for(int b:arr){
                if(b>max){
                    max=b;
                }
            }
            return max;
        }
        return 0;
    }
    //max in a given range
    static int maxinrange(int[] arr,int start,int end){
        int max=arr[start];
        for(int i=start ; i<=end ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
