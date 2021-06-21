package binarytree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(8);
        tree.insert(3);
        tree.insert(7);
        tree.insert(9);

        tree.inorder();
        System.out.println();

        System.out.println("Size: "+ tree.size()+"\n");
    }


}
