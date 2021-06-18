package binarytree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void addNode(int newdata) {
        if(newdata > data) {
            if(right == null) {
                right = new Node(newdata);
            }else {
                right.addNode(newdata);
            }
        }else {
            if(left == null) {
                left = new Node(newdata);
            }else {
                left.addNode(newdata);
            }
        }
    }

}
