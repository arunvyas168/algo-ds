package tree.bst;

/**
 * Created by arunvyasnarayanan on 2/8/20.
 */
public class isValidBst {


    public static boolean isValidBST(Node root) {
        return isValidBstUtil(root, null, null);
    }

    public static boolean isValidBstUtil(Node root, Node left, Node right){

        if (root == null) {
            return true;
        }
        if (left != null && root.value <= left.value){
            return false;
        }
        if (right != null && root.value >= right.value) {
            return false;
        }
        return (isValidBstUtil(root.left, left, root) &&  isValidBstUtil(root.right, root, right));

    }
}
