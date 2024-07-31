public class stringarray {
    public static int array( String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i] == key){
             return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        String menu[]={"apple","banana","mango","grapes"};
        String key= "mango";
       System.out.println( array(menu,key));
        

    }
    
}
