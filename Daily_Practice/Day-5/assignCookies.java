import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);

        int l=0, r=0;

        while(l<m && r<n){
            if(g[r]<=s[l]){
                r+=1;
            }
            l+=1;
        }

        System.out.println(r);
    }
}
