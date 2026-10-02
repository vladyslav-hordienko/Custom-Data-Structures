package griffith;

public class DataStructuresDemo {
    public static void main(String[] args) {
        StackArr<Integer> stack = new StackArr<>(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top: " + stack.peek());
        stack.pop();
        stack.display();

        CircularList list = new CircularList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        CircularList.Node node = list.getNode(1);
        list.addAfter(node, 15);
        list.remove(5);
        System.out.println(list);
    }
}
