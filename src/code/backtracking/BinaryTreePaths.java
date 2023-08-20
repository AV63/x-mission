package src.code.backtracking;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
 }
 }

public class BinaryTreePaths {

    void helper(List<String> paths, List<String> path, TreeNode node){

        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            path.add(String.valueOf(node.val));
            String str = String.join("->", path);
            paths.add(str);
            path.remove(path.size() - 1);
            return;
        }

        path.add(String.valueOf(node.val));
        helper(paths, path, node.left);
        helper(paths, path, node.right);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(paths, path, root);
        return paths;
    }

}
