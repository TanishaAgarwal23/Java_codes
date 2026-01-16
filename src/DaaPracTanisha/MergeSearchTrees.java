package DaaPracTanisha;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MergeSearchTrees {

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);

        list1.addAll(list2);
        list1.sort(null);

        return constructBalancedBST(list1, 0, list1.size() - 1);
    }

    public static void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, list);
        list.add(node.data);
        inOrderTraversal(node.right, list);
    }
    public static TreeNode constructBalancedBST(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = constructBalancedBST(list, start, mid - 1);
        node.right = constructBalancedBST(list, mid + 1, end);
        return node;
    }
    public static void main(String[] args) {
        // Create two example trees
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(4);
        // Merge the two trees
        TreeNode mergedTree = mergeTrees(root1, root2);
        // Print the merged tree
        System.out.println("Merged Tree:");
        printInOrder(mergedTree);
    }
    public static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}

