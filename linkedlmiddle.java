//find middle of the linked list
public class linkedlmiddle {
    Node head,tail;

    linkedlmiddle(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head==null)
           head = tail = newnode;
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public Node middle(){
            Node temp = head;
            Node ptemp = head;
            while(temp.next!=null&&temp.next.next!=null){
                ptemp = ptemp.next;
                temp = temp.next.next;
           }
           return ptemp;
        }
    

    public static void main(String args[]){
        linkedlmiddle l = new linkedlmiddle();
        l.create(2);
        l.create(3);
        l.create(5);
        l.create(7);
       l.create(1);
        l.print(l.head);
        System.out.println();
        Node middle = l.middle();
        System.out.println(middle.data);
    }
}
