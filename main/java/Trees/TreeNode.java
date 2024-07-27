package Trees;

public class TreeNode {
    int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }

      static void insert(TreeNode node, int val){
          if(node == null){
              return;
          }
          if(val < node.val){
              node.left = new TreeNode(val);
          }
          else{
              node.right = new TreeNode(val);
          }

      }
      static TreeNode makeTree(int[] array){
          if(array.length == 0){
              return null;
          }
          TreeNode root = new TreeNode(array[0]);
            for(int i = 1; i < array.length; i++){
                //insert left
                //insert right
                //if value is null skip that
                //[2,2,1,null,1,0,null,0]
                // 2 is root
                //2 is left
                //1 is right
                //left of 2 is null
                //right of 2 is 1
                //left of 1 is 0
                //right of 1 is null
                //left of 0 is null
                //right of 0 is null


            }
            return root;
      }
  }
