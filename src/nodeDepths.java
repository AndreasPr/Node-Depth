/**
 * Created on 06/Jan/2021 to NodeDepths
 */
public class nodeDepths {

    static class Node{
        int data;
        Node left, right;
    }

    static Node newNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.right = null;
        newNode.left = null;
        return newNode;
    }

    public static int findHeight(Node node){

        if(node == null){
            System.out.println("Leaf node: ");
            return -1;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        if(leftHeight > rightHeight){
            System.out.println("Left: "+leftHeight + 1);
            return leftHeight + 1;
        }
        else{
            System.out.println("Right: "+rightHeight + 1);
            return rightHeight + 1;
        }
    }

    public static void main(String args[]){
        Node root =  newNode(2);
        root.left = newNode(7);
        root.right = newNode(5);
        root.left.left = newNode(2);
        root.left.right = newNode(6);
        root.right.right = newNode(9);
        root.left.right.left = newNode(5);
        root.left.right.right = newNode(11);
        root.right.right.left = newNode(4);

        System.out.println(findHeight(root));
    }

}
