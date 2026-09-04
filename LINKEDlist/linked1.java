package LINKEDlist;

public class linked1 {
    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void print(node ptr){
        while(ptr!=null){
            System.out.println("the element is: "+ptr.data);
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        node head=new node(78);
        node second=new node(34);
        node third=new node(89);
        node fourth=new node(56);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        print(head);
    }
    
}
