package tree.bst;

/**
 * Created by arunvyasnarayanan on 2/8/20.
 */
public class testBst {
    public static void main(String args[]){
        Node root = null;
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        root = buildBST.createBstSortedArray(sortedArray);
        printBST.printInOrderBst(root);
        System.out.println();
        printBST.printPostOrderBst(root);
        System.out.println();
        printBST.printPreOrderBst(root);
        System.out.println();
        printBST.printLevelOrderBst(root);
    }
}
