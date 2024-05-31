import java.lang.*;

public class SingleLinkedList {
    
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insertBegin(int data)
    {   
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void insertPosition(int data,int pos)
    {
        Node newnode=new Node(data);
        if (head == null) {
            head = newnode;
            return;
         }
        if(pos==0)
        {   newnode.next=head;
            head=newnode;
        }
        else{
            Node prev=head;
            int count=1;
            while(count < pos && prev.next != null)
            {
                prev=prev.next;
            }
            
            newnode.next=prev.next;
            prev.next=newnode;


        }
        

    }
    void insertLast(int data)
        {   Node newnode,current;
            newnode=new Node(data);
            if (head == null) {
         head = newnode;
         return;
      }
           
            
            current=head;
            while(current.next!=null)
            {   current=current.next;


            }
            current.next=newnode;
    

        }

        void display()
        {  Node current=head;
            while(current.next!=null)
            {System.out.print(current.data+"------->");
                current=current.next;
                
            }
            System.out.print(current.data);
        }
        public static void main (String[] args){
            SingleLinkedList sll=new SingleLinkedList();
            
           
            sll.insertPosition(1,1);
            sll.insertPosition(2,2);
            sll.insertBegin(0);
           
            sll.insertPosition(3,3);
            sll.insertPosition(4,4);
            sll.insertLast(5);
            sll.insertPosition(6,5);

            sll.insertLast(7);
            sll.display();
        }

    
}
