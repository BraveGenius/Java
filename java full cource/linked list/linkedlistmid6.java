
public class linkedlistmid6 {
    public static class node{

        int data;
        int next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            //step1
            size++;
            Node newNode = new Node(data);
            if(head == null){
                head = tail =newNode;
                return;
            }
            //step2
            newNode.next = head;//link
            head= newNode;

        }
        public void addLast(int data){
            //step1 --create new node
            size++;
            Node newNode =new Node(data);
                if(head==null){
                    head = tail =newNode;
                    return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    
           public void print(){
            if (head == null){
                System.out.println("LL is empty");
                return;
            }
            Node temp =head;
            while(temp !=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
    
           }
          
    
    
    
       
        public static void main(String[] args) {
            linkedlist3 ll =new linkedlist3();
            ll.print();
            ll.addFirst(2);
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addLast(3);
            ll.print();
            ll.addLast(4);
            ll.print();
            }
    }
