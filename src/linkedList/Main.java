package linkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        //insert elements at the beginning of the list
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(5);
        list.push(7);
        list.push(6);


        //insert elements at the end of the list
        list.append(4);

        //print the elements
        list.print();

        //search one value --> return node
        System.out.println("\nSearch number '1':");
        System.out.println(list.search(1)+"\n");

        //remove
        list.remove(2);

        //print after removing
        System.out.println("After removing '2': ");
        list.print();


        //sort the elements
        System.out.println("\nSorted:");
        list.sort();
        list.print();



    }
}
