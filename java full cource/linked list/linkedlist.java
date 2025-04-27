
import java.util.LinkedList;



public class linkedlist {
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

    //Methods add,remove,print

    public void addFirst(int data){
         //step1 =create new node 
         Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;

        }
       
        //step2 -- newnode next =head
         newNode.next = head; //link
       //step3 -- head = newNode
         head =newNode;

    }
        public static void main(String args[]){
            LinkedList  ll = new Linkedlist();
            ll.addFirst(1);
            ll.addFirst(2);


        
     }
}
