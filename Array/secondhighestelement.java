import java.util.*;
public class secondhighestelement {
    public static void main(String[] args) {
        int arr[]={10,34,45,76};
        int highest =Integer.MIN_VALUE;
        int Sechighest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                Sechighest = highest;
                highest =arr[i];
            }
            else if(arr[i]<highest && arr[i]>Sechighest){
                Sechighest = arr[i];
            }
        }
        System.out.println(Sechighest);
    }
    
}
