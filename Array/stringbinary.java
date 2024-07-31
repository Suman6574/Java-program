public class stringbinary {
    public static int linear(String arr[],String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String arr [] ={"samosa","roti","dal","chawal"};
        String key = "roti";
         int index=linear(arr, key);
         if(index == -1){
          System.out.println("not found");
         }else{
            System.out.println("key is at index "+index);
         }
        
    }
    
}
