package tree.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by arunvyasnarayanan on 2/8/20.
 */
public class printBST {

    public static void printInOrderBst(Node root){
        if (root == null){
            return;
        }
        printInOrderBst(root.left);
        System.out.print("-"+root.value+"-");
        printInOrderBst(root.right);
    }
    public static void printPreOrderBst(Node root){
        if (root == null){
            return;
        }
        System.out.print("-"+root.value+"-");
        printPreOrderBst(root.left);
        printPreOrderBst(root.right);
    }
    public static void printPostOrderBst(Node root){
        if (root == null){
            return;
        }
        printPostOrderBst(root.left);
        printPostOrderBst(root.right);
        System.out.print("-"+root.value+"-");
    }

    public static void printLevelOrderBst(Node root){
        Queue<Node> nodeQueue = new LinkedList<Node>();
        if (root == null){
            return;
        }
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            int levelSize = nodeQueue.size();
            while (levelSize>0) {
                Node current = nodeQueue.poll();
                System.out.print("-" + current.value + "-");
                if (current.left != null) {
                    nodeQueue.add(current.left);
                }
                if (current.right != null) {
                    nodeQueue.add(current.right);
                }
                levelSize--;
            }
            System.out.println();
        }
    }
}
