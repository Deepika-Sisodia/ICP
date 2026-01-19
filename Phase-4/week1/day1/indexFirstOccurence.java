package week1.day1;

public class indexFirstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        for(int i=0; i<=haystack.length()-needle.length(); i++){
            int j;
            for(j=0; j<needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == needle.length()){
                System.out.println(i);
                return;
            }
        }
    }
}
