package binarytree;

public class Tree {
    private Node root;
    public void insert(int newData) {

        if(root == null) {
            root = new Node(newData);
        }else {
            root.addNode(newData);
        }
    }

    public void inorder() { //left, root, right
        inorder_aux(root);
    }
    private void inorder_aux(Node root) {
        if(root == null) {
            return;
        }

        inorder_aux(root.left);
        System.out.print(root.data+"\t");
        inorder_aux(root.right);

    }

    public void preorder() {
        preorder_aux(root);
    }
    private void preorder_aux(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+"\t");
        preorder_aux(root.left);
        preorder_aux(root.right);

    }

    public void postorder() {
        postorder_aux(root);
    }
    private void postorder_aux(Node root) {
        if(root == null) {
            return;
        }
        postorder_aux(root.left);
        postorder_aux(root.right);
        System.out.print(root.data+"\t");

    }

    public int size(){
        return size_aux(root);
    }

    private int size_aux(Node root){
        int size = 0;

        if(root == null) {
            return 0;
        }else{
            size+= size_aux(root.left);
            size++; //root found
            size+=size_aux(root.right);
        }
        return size;
    }



}
