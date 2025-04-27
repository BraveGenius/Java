public class LL {
Node head;


    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next =null;
        }

    }
    // add - first, 
    public void addFirst(String data){
        Node newNode =new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next=head ;
        head = newNode;
    }
    // add - last, 
    public void addLast(String data){
        Node newNode =new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    //print

    public void printlist(){
        if (head == null){
           System.out.println("list is  empty");
            return;
        }

        Node curNode = head;
        while(curNode != null){
            System.out.println(curNode.data +" ->");
            curNode = curNode.next;
        }
       System.out.println("Null");
    }

    //delete
    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node SecondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            SecondLast = SecondLast.next;
            lastNode = lastNode.next;
        }
        SecondLast.next = null;
    }

    public static void main(String[] args) {
        LL list =new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("list");
        list.printlist();

        list.addFirst("this");
        list.printlist();

        list.deleteLast();
        list.printlist();
        
    }
}
