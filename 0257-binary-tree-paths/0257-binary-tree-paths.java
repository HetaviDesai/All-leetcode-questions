class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root != null) {
            dfs(root, "", ans);
        }
        return ans;
    }

    private void dfs(TreeNode root, String path, List<String> ans) {
        path += root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        if (root.left != null) {
            dfs(root.left, path + "->", ans);
        }
        if (root.right != null) {
            dfs(root.right, path + "->", ans);
        }
    }
}