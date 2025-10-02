public class longestRepeatingCharSubstring {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int n = s.length();
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;
        for(int r=0; r<n; r++){
            freq[s.charAt(r)-'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(r)-'A']);

            while((r-l+1)-maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        System.out.println(maxLen);
    }
}
