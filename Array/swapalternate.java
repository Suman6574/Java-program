public class swapalternate {
    public static void main(String[] args) {
        int arr[]={12,14,16,18};
        int n =arr.length;
        for(int i=0;i<n;i+=2){

            if(arr[i+1] <n){
                swap(arr[i],arr[i+1]);

            }

        }
    }
    
}
