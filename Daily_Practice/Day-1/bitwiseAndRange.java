public class bitwiseAndRange{
    public static void main(String[] args){
        int left = 5;
        int right = 7;
        int count = 0;
        while(left < right){
            left = left >> 1;
            right = right >> 1;
            count++;
        }

        System.out.println(left << count);
    }
}