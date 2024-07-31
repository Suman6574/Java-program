import java.util.*;
public class Removeduplicate {
    public static void main(String[] args) {
        int arr []={1,1,2,2,2,3,3,4,4,4};
        //ArrayList<Integer> temp = new ArrayList<>();
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
     }
        System.out.println(i+1);
        for (int j =0;j<=i;j++) {
            System.out.print(arr[j] +" ");
        }
    }
    
}
