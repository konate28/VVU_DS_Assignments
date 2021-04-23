public class Stacks<E>{

    public class Node<E>{
        E data;
        Node<E> next;
    }

    Node<E> top=null;
    E data=null;
    int count=0;

    public boolean isEmpty(){//method to verify if the stack is empty
        if(top==null){//this means there nothing in the stack
            return true;
        }
        return false;
    }
    public void push(E d){ //method to add data in the stack
        Node<E> new_node= new Node<E>();
        new_node.data=d;

        if(top==null){
            new_node.next=top;
            top=new_node;
            count++;
        }
        else {
            new_node.next=top;
            top=new_node;
            count++;
        }
    }
    public void display(){//display method for output
        Node<E> temp_node = top;
        while(temp_node!=null){
            System.out.println(temp_node.data);
            temp_node=temp_node.next;
            count--;
        }
    }
    public E peek(){
       if (top==null){
           return null;
       } 
       return top.data;
    }
    public E pop(){
        if(top==null){
            return null;
        
        }
        else{
            Node<E> new_node =new Node<E>();
            
            new_node.data=top.data;
            top=top.next;
            return new_node.data;
        }
    }
    public static void main(String[] args) {

       Stacks<String> obj = new Stacks<String>(); 
       obj.push("Grapes");
       obj.push("Pineapple");
       obj.push("water-mellon");

       obj.display();
       System.out.println(obj.peek()); 
       //System.out.println(obj.count);
       System.out.println(obj.pop()); 
       System.out.println("\n");
       obj.display();
    }
}

