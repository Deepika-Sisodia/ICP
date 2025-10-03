import java.util.Arrays;

public class permutatinsString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<m; i++){
            char ch = s1.charAt(i);
            freq1[ch-'a']++;
        }

        for(int i=0; i<m; i++){
            char ch = s2.charAt(i);
            freq2[ch-'a']++;
        }

        if(Arrays.equals(freq1,freq2)){
            return true;
        }

        for(int i=m; i<n; i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-m)-'a']--;

            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }

        return false;
    }
}
