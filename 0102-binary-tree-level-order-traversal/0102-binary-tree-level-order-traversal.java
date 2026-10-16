
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair front = q.remove();
            TreeNode node = front.node;
            int level = front.level;

            if (level == result.size()) {
                result.add(new ArrayList<>());
            }

            result.get(level).add(node.val);

            if (node.left != null)
                q.add(new Pair(node.left, level + 1));

            if (node.right != null)
                q.add(new Pair(node.right, level + 1));
        }

        return result;
    }
}

class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}
