package stack;

public class Stack {
    private Node top;


    public void push(int data) {
        Node aux = new Node(data);
        if (!this.isEmpty()) {
            this.top.prev = aux;
            aux.next = this.top;
        }

        this.top = aux;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int pop() {
        int element = top.data;
        Node aux = this.top;
        if (!this.isEmpty()) {
            if (this.size() == 1) {
                this.top = null;
            } else {
                this.top = aux.next;
                aux.next.prev = null;
                aux.next = null;
            }

            element = aux.data;
            aux = null;
        }

        return element;
    }

    public int size() {
        int amount = 0;
        Node aux = this.top;
        if (!this.isEmpty()) {
            while(aux != null) {
                ++amount;
                aux = aux.next;
            }
        }

        return amount;
    }

    public int top() {
        return this.isEmpty() ? null : this.top.data;
    }
}
