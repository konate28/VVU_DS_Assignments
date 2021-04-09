public class DoublyLL{
    private static ListNode head;
    private static ListNode tail;
    
    private static class ListNode{ //Node class
        private String data;
        private ListNode next;
        private ListNode prev;

        ListNode (ListNode previous,String d, ListNode ne){ //constructor
            
            data=d;
            prev=previous;
            next=ne;
        }
       
    }
    public DoublyLL(){ //constructor for the doubly linked list
        head=null;
        tail=null;
    }
    public static void insertAtEnd(String valToadd){ // void method to insert a value at the tail of a list

        ListNode new_node=new ListNode(null,valToadd,null);
        if(head==null){ // if the does not exit new_node becomes the head
            head=new_node;
        }
        else{
            ListNode temp_node=head;
            while(temp_node.next!=null){
                temp_node=temp_node.next;
            }
            temp_node.next=new_node;
            new_node.prev=temp_node;
            tail=new_node; //at this point new_node contains the last element of the list
        }
    }
    public static void insertionFirst(String value){//void method to give the head position to a value
                                                //@param value is the data to add
        ListNode new_node=new ListNode(null,value,null);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head.prev=new_node;
            //new_node.next=head;
            head=new_node;
        }
    }
    public static void display(){// display method to print
        System.out.println("\n\n");
        if(head==null){// if the is null display empty list and stop there
            System.out.println("Empty List");
            return;
        }
        ListNode temp_node=head;
        while(temp_node!=null){
           System.out.println(temp_node.data);
           temp_node=temp_node.next;
           System.out.println("\n||");
           System.out.println("\\/");
           
        }
        System.out.println("\n");
    }
    public static void insertIn(int position, String value){ //method to add a value neither at the head position
                                                         //nor at at the tail but at a given postion
                                                         //@param position the index of the value to insert
                                                         //@param value the value to add

        if(head==null || position<1){//either when the position is under 1 or when the head is null 
                                    //we don't do anything
            return;
        }
        else if(position==1){
            insertionFirst(value);//with this it becomes the head
        }
        ListNode temp_node=head;
        for(int count=1; count<position; count++){ //looping to get the right position
            temp_node=temp_node.next;

        }
        if(temp_node.prev==null){
            ListNode new_node = new ListNode( null,value,temp_node);
            temp_node.prev=new_node;
            head=new_node;
        }
        else{
            ListNode new_node = new ListNode( temp_node.prev,value,temp_node);
            temp_node.prev.next=new_node;
            temp_node.prev=new_node;
        }
    }
    public static void reversePrint(){
        
        System.out.println("\n");
        if(head==null){// if the is null display empty list and stop there
            System.out.println("Empty List");
            return;
        }
        ListNode temp_node=tail;
        while(temp_node!=head){
           System.out.println(temp_node.data);
           temp_node=temp_node.prev;
           System.out.println("/\\");
           System.out.println("||\n");
           
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        System.out.println("\t\t\n\nMy Family tree from my G G Grand parents to me");
        //insertion
        DoublyLL.insertionFirst("Samba and Mariama");
        DoublyLL.insertAtEnd("Issa and Koumba");
        DoublyLL.insertAtEnd("Mohammed and Awa");
        DoublyLL.insertAtEnd("Safiatou");
        DoublyLL.insertIn(3,"Amadou and Hadjiratou");
        DoublyLL.display();

        System.out.println("\t\t\n\nMy Family tree from me to my G G Grand parents ");
        DoublyLL.reversePrint();


    }
}

    