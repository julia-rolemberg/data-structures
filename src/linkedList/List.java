package linkedList;

public class List {
    private Node head;
    private Node tail;

    public void push(int data){ //insert an element at the beginning of the list
        Node new_node = new Node();
        new_node.data = data;
        if(head == null && tail == null){ //empty list - adding first element
            head = new_node;//receives the current node
            tail = new_node; //receives the current node (there is just one node inside the list)
        }else{ //the list is not empty
            head.prev = new_node;
            new_node.next = head;
            head = new_node;
        }
    }
    public void append(int data){ // insert an element at the end of the list
        Node new_node = new Node();
        new_node.data = data;
        if(head == null && tail == null){ //empty list - adding first element
            head = new_node;
            tail = new_node;
        }else{ //the list is not empty
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }
    public void print(){ // print all elements
        Node aux = head; //pointer that will walk through the list
        while(aux != null){ //while pointer is inside the list - turns to null when node.next is null(no element next)
            System.out.print(aux.data+"\t");
            aux = aux.next; // puts the pointer on next element
        }
        System.out.println();
    }

    public Node search(int data){ // search the node with this data
        Node aux = head; //pointer at the first element of the list
        while(aux != null){ //while pointer is inside the list/ the current node has next element
            if(aux.data == data){
                break; //found the correct node
            }
            aux = aux.next; //continue looking for the node
        }
        return aux; //return the correct node or return null if it does not exist inside the list
    }
    public void remove(int data){
        Node aux = search(data); //node to be removed
        if(aux != null){ //the node exists and can be removed
            if(head == tail){ //there is only one node in the list
                head = null;
                tail = null;
            }else{ //there is at least 2 nodes
                if(aux == head){ //removing the first element
                    aux.next.prev = null; //remove aux reference from the second node
                    head = head.next; // head referencing the second node
                    aux.next = null; // aux is "alone" - no element related to it
                }else if(aux == tail){ // removing the last element
                    aux.prev.next = null; //remove aux reference from the previous node
                    tail = tail.prev; //tail referencing aux's previous element
                    aux.prev = null; // no element related to aux
                }else {// removing from the middle (all things combined)
                    aux.prev.next = aux.next; // reference aux's next node at aux's previous node
                    aux.next.prev = aux.prev; // reference aux's previous node at aux's next node
                    aux.prev = null;
                    aux.next = null;
                }
            }
            aux = null; // delete the node
        }
    }

    public void sort(){
        Node current = head;
        Node next = null;
        if (head != null || tail != null) { // not an empty list
            while (current != null) {
                for (next = current.next; next != null; next = next.next) { // comparing the current node with all elements of the list
                    if (current.data > next.data) {
                        int temp = current.data; // keep current's data
                        current.data = next.data; // receive next's data(<)
                        next.data = temp; //conclusion of data exchange
                    }
                }
                current = current.next; //next position
            }
        }
    }




}
