public class Node {
    int val;
    Node next;
    Node head;
    Node(){

    }

    Node(int val){
        this.val = val;
        this.next = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertLast(int val){
        Node temp = head;
        while(temp!=null){
            
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(head.val+"->");
            temp = temp.next;
        }
    }
}
