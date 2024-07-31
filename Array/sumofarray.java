//import java.util.*;
public class sumofarray {
    public static int array(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        //int arr[]=new int[50];
        int arr[]={10,20,30};
        System.out.println(array(arr));
    }
    
}
