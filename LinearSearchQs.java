package packu;

import java.util.Arrays;

public class LinearSearchQs {
    public static void main(String[] args) {
        String name="Kunal";
        char target='u';
        char target2='p';
        System.out.println("Q1-SEARCH IN STRING");
        System.out.println(target + " exists in " + name +": " +  inString(target,name));
        System.out.println(target2 + " exists in " + name +": " + inString2(target2,name));

        //q2
        int nums[]={1,18,3,-7,99,71,29};
        int start=1;
        int end=4;
        int numtarget=3;
        System.out.println("Q2-SEARCH IN RANGE");
        System.out.println("AT INDEX: " + searchInRange(nums,numtarget,start,end));

        //q3
        System.out.println("Q3-GET MIN NUMBER");
        System.out.println("MINIMUM NUMBER: " + minNum(nums));

        //q4 - imp
        System.out.println("Q4-SEARCH IN 2D ARRAY");
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target3=34;
        int[] ans=search2D(arr,target3);
        System.out.println( target3 + " NUMBER AT INDEX: " + Arrays.toString(ans));
    }
    //Q1 - search for char in string
    // FOR LOOP - search for char in string
    static boolean inString(char ch, String s){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }

    //OR
    // FOR-EACH LOOP - Important! - search for char in string
    static boolean inString2(char ch, String s){
        if(s.length()==0){
            return false;
        }
        for(char c : s.toCharArray()){ // for-each loop requires array argument
            if(c==ch){
                return true;
            }
        }
        return false;
    }

    //Q2 - search for number in array within given range
    //Search for num in a range
    static int searchInRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    //Q3 - MINIMUM NUMBER
    static int minNum(int[] arr){
        int min=arr[0];
        for(int e: arr){
            if(e<min){
                min=e;
            }
        }
        return min;
    }

    //Q4- SEARCH IN 2D ARRAY
    static int[] search2D(int[][] arr , int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //Q5-LEETCODE 1295
    //Q6-LEETCODE 1672

}
