public class SecondLargestDigit_String {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        int max = -1;
        int smax = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                int val = c-'0';
                if(val>max){
                    smax = max;
                    max = val;
                }

                else if(val>smax && val!=max){
                    smax = val;
                }
            }
        }
        return smax;
    }
}
