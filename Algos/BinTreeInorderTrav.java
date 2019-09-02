/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */
class Solution {
	    private List<Integer> foo = new ArrayList<Integer>();
	        public List<Integer> inorderTraversal(TreeNode root) {
			        inorder(root);
				        return foo;
					    }
		    
		    public void inorder(TreeNode root){
			            if (root != null) {
					                inorder(root.left);
							            foo.add(root.val);
								                inorder(root.right);
										        }

				        }
}

//Binary Tree Inorder traversal 
////From: https://leetcode.com/problems/binary-tree-inorder-traversal/solution/
