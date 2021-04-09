//import java.util.Scanner;

class linkedlist{
     static Node head; //head node to hold the list
     private static class Node{
         int data;
         Node next;

         Node(int d){
             //costructor
             data = d;
             next = null;
         }
     }
     private static void insertion (int value){
         Node new_node = new Node(value);

         if(head==null){
                head=new_node;
         }
         else{
                Node temp_node=head;
                while(temp_node.next!=null){
                    temp_node=temp_node.next;
                }
                temp_node.next=new_node;
         }
         
     }
     public static void printlist(){

         Node curr_node=head;
         System.out.println("\n");
         System.out.print("The list: ");

         // Traverse the list
         while(curr_node.next!=null){
             //we print the data
             System.out.print(curr_node.data+ " " );
             curr_node=curr_node.next;

         }
     }
     public static void insertInfront(int val){
        Node new_node = new Node(val);

        if(head==null){
               head=new_node;
            }
        else{
            new_node.next=head;
            head=new_node;
        }
        System.out.print("\n \nAfter inserting 15 in front");
     }
     public static void insertAt(int position , int valToinsert){
         Node new_node = new Node(valToinsert);
         if(position<1){
            return;
         }
         else if(position==1){
                insertInfront(valToinsert);
            
         }
         else if(position>1){
             Node curr_node=head;
             for(int i=1; i<position-1; i++){
                curr_node=curr_node.next;
             }
             new_node.next=curr_node.next;
             curr_node.next=new_node;
         }
         System.out.print("\n \n Insert 30 after 10");
     }

     public static void insertAfter(int after ,int value ){
        Node new_node = new Node(value);
           if(head==null){//check for empty list
                return;
           } 
           else{
               Node curr_node=head;
               while(curr_node.data!=after){
                   curr_node=curr_node.next;
               }
               new_node.next=curr_node.next;//
               curr_node.next=new_node;//
           }
           System.out.print("\n \nInsert 25 after 16 ");
     }
     public static void deleteIteratively(int valTodel){
        if(head==null){//checking if the list is empty
            return;
        }
        else{
              Node curr_node = head;
              Node temp_node = new Node(valTodel);

              while(curr_node.data!=valTodel){
                  curr_node=curr_node.next;
              }
              temp_node=curr_node.next;
              curr_node.next=temp_node.next;

              
        }
        System.out.print("\n \nDelete 8 after 15");
     }

     


     public static void main(String[] args){
         //answering the first Q by creating the LL
         // 8-->10-->12-->16-->9-->14-->null

         /*linkedlist obj = new linkedlist();
         obj.insertion(8);
         obj.insertion(10);
         obj.insertion(12);
         obj.insertion(16);
         obj.insertion(9);
         obj.insertion(14);

         obj.printlist();

         //obj.printlist();
         obj.insertInfront(15);
         obj.printlist();

         obj.insertAfter(16,25); // inserting 25 after 16
         obj.printlist();
         
         obj.insertAt(4,30);// inserting 30 after 10;
         obj.printlist();


        obj.deleteIteratively(15);
        obj.printlist();
        //System.out.print("\n");*/
        linkedlist.insertion(8);
        linkedlist.insertion(10);
        linkedlist.insertion(12);
        linkedlist.insertion(16);
        linkedlist.insertion(9);
        linkedlist.insertion(14);

        linkedlist.printlist();

        //obj.printlist();
        linkedlist.insertInfront(15);
        linkedlist.printlist();

        linkedlist.insertAfter(16,25); // inserting 25 after 16
        linkedlist.printlist();
        
        linkedlist.insertAt(4,30);// inserting 30 after 10;
        linkedlist.printlist();


        linkedlist.deleteIteratively(15);
        linkedlist.printlist();

     }
     
}