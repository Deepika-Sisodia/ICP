public class coinChange {
    public static void main(String[] args) {
        int n = 39;
        int[] arr = {1,2,5,10};
        int i = arr.length-1;
        int c = 0;
        while(i>=0 && n>0){
            if(n>=arr[i]){
                n = n - arr[i];
                c++;
            }
            else{
                i--;
            }
        }
        
        System.out.println(c);
    }
}
