import java.util.*;
public class linearsearch {
    public static int linear(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int number []={2,4,6,8,10,12,14,16,};
        
        int index=linear(number, key);
       if(index== -1){
        System.out.println(" Not found");
       }
       else{
        System.out.println("key is at index "+index);
       }
    }
    
}
