package week2;
public class Stack{
    int[] arr;
    int idx;
    int size;
    Stack(int size){
        this.size = size;
        arr = new int[size];
        idx=-1;
    }

    public void push(int a){
        if(idx==size){
            System.out.println("Stack Overflow");
            return;
        }
        idx++;
        arr[idx] = a;
    }

    public int pop(){
        if(idx==-1){
            System.out.println("Stack Underflow");
        }
        int r = arr[idx];
        idx--;
        return r;
    }

    public int peek(){
        if(idx==-1){
            System.out.println("Stack Underflow");
        }
        return arr[idx];
    }

    public boolean isEmpty(){
        return idx==-1;
    }

    public void Display(){
        for(int i=0; i<=idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display();
        System.out.println(st.pop());
        st.push(6);
    }
}