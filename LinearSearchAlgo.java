package packu;
import java.util.Scanner;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int arr[]={12,34,33,56,70,88,1,0,49,11};
        int target=70;
        int target2=49;
        System.out.println(lsearch(arr,target));
        System.out.println(lsearcheach(arr,target2));
    }
    //forloop
    static int lsearch(int[] arr,int target){
        if(arr.length==0){ //edge case arr={}
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        //runs when no return statement before this ran i.e match not found
        return -1;
    }
    //OR
    //ForEach loop
    static int lsearcheach(int[] arr,int target){
        if(arr.length==0){ //edge case arr={}
            return -1;
        }
        int index=0;
        for(int element: arr){
            if(element==target){
                return index;
            }
            index++;
        }
        return -1;
    }
}
