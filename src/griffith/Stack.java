package griffith;

// Academic project by Vladyslav Hordiienko
interface Stack<E> {
    public boolean push(E x);
    public E pop();
    public E peek();
    public boolean empty();
    public boolean full();
    public void display();
}
