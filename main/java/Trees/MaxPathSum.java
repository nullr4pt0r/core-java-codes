package Trees;

public class MaxPathSum {
    int max = Integer.MIN_VALUE;
    public  int maxPathSum(TreeNode A) {
        findmaxSum(A,0);
        return max;
    }

   void findmaxSum(TreeNode A, int sum){
        if(A == null){
            return;
        }
        sum += A.val;
        max = Math.max(sum, max);
        findmaxSum(A.left, sum);
        findmaxSum(A.right, sum);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(20);
        node.left = new TreeNode(-10);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(-10);
        node.right.right = new TreeNode(-50);

        System.out.println(new MaxPathSum().maxPathSum(node));
    }

}
