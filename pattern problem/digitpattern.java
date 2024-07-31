public class digitpattern {
    public static void main(String args[]){
        int n=5;
        int cont=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cont +" ");
                cont++;
             }
             System.out.println();
        }
    }
    
}
