import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinations(arr,k,ll,ans,0);
        System.out.println(ans);
    }

    public static void combinations(int[] arr, int k,List<Integer> ll, List<List<Integer>> ans, int idx){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            ll.add(arr[i]);
            combinations(arr,k,ll,ans,i+1);
            ll.remove(ll.size()-1);
        }
    }
}
