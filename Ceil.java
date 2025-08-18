package packu;

public class Ceil {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18,33};
        int target=17;
        System.out.println(ceil(arr,target));
    }
    //B.S. MANTRA: ANSWER MID SE HI MILEGA
    static int ceil(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ceil=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<=arr[mid]){ // we want the nearest larger num, so lets tackle the smaller side first.
                ceil=arr[mid]; // we target mid element for answer in B.S.
                end=mid-1;
            } else{
                start=mid+1; //eventually tackles right side as mid moves to the right side.
            }
        }
        return ceil;
    }
    static  int oldCeil(int[] arr,int t){
        int start=0;
        int end=arr.length-1;
        if(t<=arr[start]){
            return arr[start];
        } else if (t>arr[end]) {
            return Integer.MAX_VALUE;
        }
        while(start<=end){
            int mid=start+ (end-start)/2;
            boolean isBig= t > arr[mid];
            if(t==arr[mid]){
                return arr[mid];
            }
            if(isBig){
                    if(t>arr[mid] && t<=arr[mid+1]){
                        return arr[mid+1];
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(t<arr[mid] && t>arr[mid-1]){
                        return arr[mid];
                    }
                    else{
                        end=mid-1;
                    }
                }
        }
        return Integer.MAX_VALUE;
    }
}
