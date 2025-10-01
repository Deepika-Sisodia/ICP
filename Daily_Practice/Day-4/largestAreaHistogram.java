import java.util.Stack;

public class largestAreaHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        // int maxArea = 0;
        // for(int i=0; i<heights.length; i++){
        //     int h = heights[i];
        //     int l = i;
        //     while(l>0 && heights[l-1]>=h){
        //         l--;
        //     }
        //     int r = i;
        //     while(r<heights.length-1 && heights[r+1]>=h){
        //         r++;
        //     }

        //     int w = r-l+1;
        //     int area = h*w;
        //     maxArea = Math.max(area,maxArea);
        // }

        // return maxArea;

        System.out.println(largestArea(heights));
        
    }
    public static int largestArea(int[] arr){
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    maxArea = Math.max(maxArea,h*r);
                }
                else{
                    int l = st.peek();
                    maxArea = Math.max(maxArea,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            int h = arr[st.pop()];
            if(st.isEmpty()){
                maxArea = Math.max(maxArea,h*r);
            }
            else{
                int l = st.peek();
                maxArea = Math.max(maxArea,h*(r-l-1));
            }
        }
        return maxArea;
    }
}
