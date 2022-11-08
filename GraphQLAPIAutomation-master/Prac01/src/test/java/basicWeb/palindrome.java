package basicWeb;


/*
 * Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
Create another class palindrome which has three attributes: head, tail, and size.
addNode() will add a new node to the list:
Create a new node.
It first checks, whether the head is equal to null which means the list is empty.
If the list is empty, both head and tail will point to a newly added node.
If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
reverseList() will reverse the order of the node present in the list:
Node current will represent a node from which a list needs to be reversed.
Node prevNode represent the previous node to current and nextNode represent the node next to current.
The list will be reversed by swapping the prevNode with nextNode for each node.
isPalindrome() will check whether given list is palindrome or not:
Declare a node current which will initially point to head node.
The variable flag will store a boolean value true.
Calculate the mid-point of the list by dividing the size of the list by 2.
Traverse through the list till current points to the middle node.
Reverse the list after the middle node until the last node using reverseList(). This list will be the second half of the list.
Now, compare nodes of first half and second half of the list.
If any of the nodes don't match then, set a flag to false and break the loop.
If the flag is true after the loop which denotes that list is a palindrome.
If the flag is false, then the list is not a palindrome.
display() will display the nodes present in the list:
Define a node current which will initially point to the head of the list.
Traverse through the list till current points to null.
Display each node by making current to point to node next to it in each iteration.
 */

public class palindrome {  
    
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
   
    public int size;  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
      
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
          
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
        //Size will count the number of nodes present in the list  
        size++;  
    }  
      
    //reverseList() will reverse the singly linked list and return the head of the list  
    public Node reverseList(Node temp){  
        Node current = temp;  
        Node prevNode = null, nextNode = null;  
          
       //Swap the previous and next nodes of each node to reverse the direction of the list  
        while(current != null){  
            nextNode = current.next;  
            current.next = prevNode;  
            prevNode = current;  
            current = nextNode;  
        }  
        return prevNode;  
    }  
      
    //isPalindrome() will determine whether given list is palindrome or not.  
    public void isPalindrome(){  
        Node current = head;  
        boolean flag = true;  
          
        //Store the mid position of the list  
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
          
        //Finds the middle node in given singly linked list  
        for(int i=1; i<mid; i++){  
            current = current.next;  
        }  
          
        //Reverse the list after middle node to end  
        Node revHead = reverseList(current.next);  
   
        //Compare nodes of first half and second half of list  
        while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
   
        if(flag)  
            System.out.println("Given singly linked list is a palindrome");  
        else  
            System.out.println("Given singly linked list is not a palindrome");  
    }  
      
    //display() will display all the nodes present in the list  
        public void display() {  
            //Node current will point to head  
            Node current = head;  
              
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            System.out.println("Nodes of singly linked list: ");  
            while(current != null) {  
                //Prints each node by incrementing pointer  
                System.out.print(current.data + " ");  
                current = current.next;  
            }  
            System.out.println();  
    }  
          
    public static void main(String[] args) {  
          
        palindrome sList = new palindrome();  
          
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(1);  
          
        sList.display();  
          
        //Checks whether given list is palindrome or not  
        sList.isPalindrome();  
    }
}