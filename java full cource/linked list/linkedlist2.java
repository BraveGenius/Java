package linked list;

public class linkedlist2{

    public static class Node{
         int data;
         int next;

        public Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //method add
    public void addFirst(int data){
        //step1 = create new node
        Node newNode =new Node(data);
        if(head== null){
            head = tail =newNode;
            return;
        }
        //step2 new node next =head
        newNode.next=head;

        //step3  head =newNode
        head =newNode;
    }
    public void addLast(int data){
        //step1 --create new node
        Node newNode =new Node(data);
            if(head==null){
                head = tail =newNode;
                return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public static void main(String args[]){
        linkedlist2 ll = new linkedlist2();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addLast(3);
        ll.addLast(7);
    }
    
}
