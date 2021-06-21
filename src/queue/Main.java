package queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        //front element
        System.out.println("First element: "+queue.front());

        //element on third position
        System.out.println("Element on third position: "+queue.get(3));

        queue.print();

        System.out.println("\nSize: "+queue.size());


    }

}
