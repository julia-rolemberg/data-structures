package queue;

public class Queue {
    private Node front;
    private Node rear;

    public void enqueue(int data) {
        Node aux = new Node(data);

        if(this.size()==0) {
            front = aux;

        }else {
            rear.next = aux;
            aux.prev = rear;
        }
        rear = aux;

    }

    public void print() {
        Node aux = front;
        int i = 1 ;
        while(aux != null) {
            System.out.println(i+"° - "+aux.data);
            aux = aux.next;
            i++;
        }

    }

    public Node get(int position){
        Node aux = front;

        for(int i = 0 ; i<position; i++){
            aux = aux.next;
        }
        return aux;

    }


    public Node front(){ //retorna o elemento da frente
        return front;
    }

    public Node dequeue() {
        Node aux = front;
        if (this.size()>0) {
            if (this.size()==1) {
                front = null;
                rear = null;
            } else {
                aux.next.prev = null;
                front = front.next;
                aux.next = null;
            }
        }
        return aux;
    }

    public int size(){
        Node aux = front;
        int size = 0;

        while(aux != null){
            size++;
            aux = aux.next;
        }

        return size;
    }

    public Boolean isEmpty(){

        if(this.size()==0){
            return true;
        }
        return false;
    }
}
