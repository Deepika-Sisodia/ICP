import java.util.ArrayList;
import java.util.List;

public class merge2DArrays {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}}, nums2 = {{1,4},{3,2},{4,1}};
        int i=0, j=0;
        int k = 0;
        int[][] ans = new int[nums1.length+nums2.length][2];
        while(i<nums1.length && j<nums2.length){
            List<Integer> ll = new ArrayList<>();
            if(nums1[i][0]==nums2[j][0]){
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1]+nums2[j][1];
                i++;
                j++;
                k++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1];
                i++;
                k++;
            }
            else{
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1];
                j++;
                k++;
            }

        }

        while(i<nums1.length){
            List<Integer> ll = new ArrayList<>();
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1];
            i++;
            k++;
        }

        while(j<nums2.length){
            List<Integer> ll = new ArrayList<>();
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1];
            j++;
            k++;
        }

        int[][] res = new int[k][2];
        for(int m=0; m<k; m++){
            res[m][0] = ans[m][0];
            res[m][1] = ans[m][1];
        }

        for(int r=0; r<res.length; r++){
            System.out.print("["+res[r][0]+","+res[r][1]+"]");
        }

    }
}
