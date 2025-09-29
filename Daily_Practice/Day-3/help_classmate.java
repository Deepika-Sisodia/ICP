import java.util.Stack;

public class help_classmate {
    public static void main(String[] args) {
        int[] arr = {3,8,5,2,15};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=-1;
            }

            st.push(i);
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
