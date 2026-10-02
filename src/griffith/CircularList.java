package griffith;

// Academic project by Vladyslav Hordiienko
public class CircularList {
    
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    

     private Node head = null;
     private Node tail = null;
     
 
    //add  new node to beggining of list
public void addFirst(int data) {
        Node newNode = new Node(data);
           if (head == null) {
            head = newNode;
               tail = newNode;
            newNode.next = head; 
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; 
        }
    }

     //add new node to end 
 public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    

    // return node at specific  index
 public Node getNode(int index) {
        if (head == null || index < 0) return null;
          if (head == null || index < 0) return null;

        Node current = head;
        int count = 0;

        while (count < index) {
            current = current.next;
            count++;
         
            if (current == head) return null; 
        }

        return current;
    }

       //add new node after  specific node
public void addAfter(Node node, int data) {
           if (node == null) return;
         Node newNode = new Node(data);
          newNode.next = node.next;
        node.next = newNode;
        if (node == tail) tail = newNode; 
    }

      //remove first node contain the given value
public void remove(int data) {
    	
    	    if (head == null) return; 

    	   
      if (head.data == data) {
    	    if (head == tail) {
    	          head = null;
    	          tail = null;
    	    } else {
    	        head = head.next; 
    	       tail.next = head; 
    	        }
    	        return; 
    	    }

    	    
    	    Node prev = head;
      
      while (prev.next != head) {
      if (prev.next.data == data) {
    	          
         if (prev.next == tail) {
                 tail = prev;
              }
    	      prev.next = prev.next.next; 
    	      tail.next = head; 
    	     return;
    	        }
    	        prev = prev.next;
    	    }
    	}
    

      //remove all nodes with  given value
public void removeAll(int data) {
        if (head == null) return;
          int initialsize = 100; 
        for (int i = 0; i < initialsize; i++) {
          Node found = findNode(data);
          if (found == null) break;
            remove(data);
        }
    }
    
    //helper for finding data
private Node findNode(int data) {
	if (head == null) return null; 

    Node current = head;
    
    while (true) {
   
        if (current.data == data) {
            return current;
        }
        
        current = current.next; 
        if (current == head) {
            break; 
        }
    }
    
    return null;
}
    //string represantation
 @Override
 public String toString() {
	
	       if (head == null) return "List is empty";

	     String result = "";
	     Node current = head;

	     while (true) {
	         result += current.data + " --- ";
	         current = current.next;
	         
	    
	         if (current == head) break;
	     }

	     return result + "head";
	 
    }
}
