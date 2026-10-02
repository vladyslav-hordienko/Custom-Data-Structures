package griffith;

// Academic project by Vladyslav Hordiienko
public class StackArr<E> implements Stack<E> {
    private E[] data;
    private int top; // Index of the top element
    private int capacity;

   
    public StackArr(int size) {
        this.capacity = size;
        this.data = (E[]) new Object[size]; 
        this.top = -1; 
    }

    //add element to  top
    public boolean push(E x) {
        if (full()) return false; //no push if full
        data[++top] = x; //increase top and add 
        return true;
    }

       //remove top element
    public E pop() {
        if (empty()) return null; //no pop if empty
        return data[top--]; // Return data and decrease top
    }

    //returning top element without removing it
    public E peek() {
        if (empty()) return null;
        return data[top];
    }

    
    //checking if stack is empty
    public boolean empty() {
        return top == -1;
    }
    
    
      //checks if stack is full
    public boolean full() {
        return top == capacity - 1;
    }

    //print all elements in stack
    public void display() {
        if (empty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
