import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printReverseArrayList(ArrayList<Integer> arr){
        ArrayList<Integer> reverseArr = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            reverseArr.add(arr.get(i));
        }
        for(Integer ele : reverseArr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        
        printReverseArrayList(arr);
    }
}
