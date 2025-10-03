import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> ll = new ArrayList<>();
        int m = p.length();
        int n = s.length();

        if (m > n){
            System.out.println(ll);
        }

        int[] freqp = new int[26];
        int[] freqs = new int[26];


        for(int i=0; i<m; i++){
            freqp[p.charAt(i)-'a']++;
        }

        for(int i=0; i<m; i++){
            freqs[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(freqp,freqs)){
            ll.add(0);
        }
        
        for(int i=m; i<n; i++){
            freqs[s.charAt(i)-'a']++;
            freqs[s.charAt(i-m)-'a']--;

            if(Arrays.equals(freqp,freqs)){
                ll.add(i-m+1);
            }
        }
        System.out.println(ll);
    }
}
