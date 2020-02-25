package tree.bst;

/**
 * Created by arunvyasnarayanan on 2/23/20.
 */
public class DiameterOfTree {
    static int diameter;
    public static int diameterOfBinaryTree(Node root){
        diameter = Integer.MIN_VALUE;
        calculateDiameter(root);
        return diameter;
    }
    public static int calculateDiameter(Node root){
        if (root == null){
            return 0;
        }
        int lHeight = calculateDiameter(root.left);
        int rHeight = calculateDiameter(root.right);
        diameter = Math.max(diameter, (lHeight+rHeight+1));
        return 1+ Math.max(lHeight,rHeight);
    }
}
