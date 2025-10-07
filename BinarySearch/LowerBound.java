package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,60,70,80,100};
        int n = arr.length;
        int high = n-1;
        int low = 0;
        int lb = n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Target");
        int target = scan.nextInt();
        // if(target < arr[0]) lb = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                lb = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(lb);
    }    
}
