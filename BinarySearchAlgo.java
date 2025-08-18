package packu;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        //return the index if target found;
        //return -1 if not found;
        int[] arr={1,2,6,9,11,14,20,36,48}; //sorted array
        int target1=36;
        int target2=1;
        int target3=12; // element not found case
        System.out.println("TARGET 1- " + target1 +" IS PRESENT AT: " + binarySearch(arr,target1));
        System.out.println("TARGET 2- " + target2 +" IS PRESENT AT: " + binarySearch(arr,target2));
        System.out.println("TARGET 3- " + target3 +" IS PRESENT AT: " + binarySearch(arr,target3));

    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            // might be possible to get an error id start + end exceeds the range of integer.
            // int mid=(start+end)/2;
            // better way to do it;
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid; //ans found
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
