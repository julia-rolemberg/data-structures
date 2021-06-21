package stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println("Element at the top: "+stack.top());

        System.out.println("Size: "+stack.size());


        System.out.println("Removing the element at the top ("+stack.pop()+")");



    }


}
