package Trees;

public class SmallString {
    public static String smallestFromLeaf(TreeNode root) {
        return find(root);
    }

    public static String find(TreeNode root){
        if(root == null){
            return "";
        }
        String rootString = String.valueOf((char)('a'+root.val));
        String left = (find(root.left))+(rootString);
        String right = (find(root.right))+(rootString);

        if(left.compareTo(right) <= 0){
            return left;
        }
        return right;

    }

    public static void main(String[] args) {
//        [0,1,2,3,4,3,4]
        TreeNode node = new TreeNode(0);
//        node.left = new TreeNode(1);
//        node.right = new TreeNode(2);
//        node.left.left = new TreeNode(3);
//        node.left.right = new TreeNode(4);
//        node.right.left = new TreeNode(3);
//        node.right.right = new TreeNode(4);
        node.right = new TreeNode(1);
        System.out.println(smallestFromLeaf(node));
    }
}
