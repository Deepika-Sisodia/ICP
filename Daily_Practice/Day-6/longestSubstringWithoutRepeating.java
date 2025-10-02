import java.util.HashSet;

public class longestSubstringWithoutRepeating{
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        int maxlen = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        while(r<n){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        System.out.println(maxlen);
    }
}