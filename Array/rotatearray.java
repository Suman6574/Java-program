import java.util.*;
public class rotatearray {
    public static void main(String[] args) {
        int arr []= {10,12,13,34};
        int k=2;
        int temp[] =new int[arr.length];
        //rotate the array to k position 
        for(int i=0;i<arr.length;i++){
           temp[(i+k)%arr.length] =arr[i];
        }
        //put the temp value in arr
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        //print the rotate array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
