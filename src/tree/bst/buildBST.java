package tree.bst;

/**
 * Created by arunvyasnarayanan on 2/8/20.
 */
public class buildBST {

    public static Node createBstSortedArray(int[] sortedArray){
        int start = 0;
        int end = sortedArray.length-1;
        return createBstSortedArrayUtil(sortedArray, start, end);
    }

    private static Node createBstSortedArrayUtil(int[] sortedArray, int start, int end){
        if (end<start){
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(sortedArray[mid]);

        node.left = createBstSortedArrayUtil(sortedArray, start, mid-1);
        node.right = createBstSortedArrayUtil(sortedArray, mid+1, end);
        return node;
    }

    public static Node addNodeBst(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if(val < root.value ){
            root.left = addNodeBst(root.left,val);
        } else{
            root.right = addNodeBst(root.right,val);
        }
        return root;
    }
}
