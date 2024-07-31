public class checkifarraysortedrotated {
    public static void main(String[] args) {
        int arr[]={12,34,54,23,45};
        int count =0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        if(count <=1){
            System.out.print("sorted and rotated");
        }else{
            System.out.println("only sorted not rotated");
        }
    }
    
}
