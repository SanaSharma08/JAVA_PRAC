package packu;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={1,2,6,9,11,14,20,36,48};//sorted array
        int[] arr2={44,42,38,37,23,20,19,11,8,3,0,-10};
        int target1=36;
        int target2=1;
        int target3=12; // element not found case
        int t1=42;
        int t2=23;
        int t3=3;
        int t4=-10;
        int t5=100;
        System.out.println("Operations on Arr: asc");
        System.out.println("TARGET 1- " + target1 +" IS PRESENT AT: " + binarySearch(arr,target1));
        System.out.println("TARGET 2- " + target2 +" IS PRESENT AT: " + binarySearch(arr,target2));
        System.out.println("TARGET 3- " + target3 +" IS PRESENT AT: " + binarySearch(arr,target3));
        System.out.println("Operations on Arr2: desc");
        System.out.println(t1 +" IS PRESENT AT: " + binarySearch(arr2,t1));
        System.out.println(t2 +" IS PRESENT AT: " + binarySearch(arr2,t2));
        System.out.println(t3 +" IS PRESENT AT: " + binarySearch(arr2,t3));
        System.out.println(t4 +" IS PRESENT AT: " + binarySearch(arr2,t4));
        System.out.println(t5 +" IS PRESENT AT: " + binarySearch(arr2,t5));

    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans;
        boolean isASC= arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            } else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
