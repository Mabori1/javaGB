//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        dfs(root, ans);
//        return ans;
//
//    }
//
//    // depth first search (dfs) обход в глубину
//    private void dfs(TreeNode root, ArrayList<Integer> ans) {
//        if (root == null) {
//            return;
//        }
//        ans.add(root.val);
//        dfs(root.left, ans);
//        dfs(root.right, ans);
//    }
//}
//
//
//
//    public static void main(String[] args) {
//        findPath(1, 5, 1, 2, "");
//
//    }
//    private static void findPath(int src, int target, int addend, int mult, String path){
//        if (src > target){
//            return;
//        }
//        if (src == target){
//            System.out.println(path + " = " + target);
//            return;
//        }
//
//        findPath(src + addend, target, addend, mult, path + " " + src + " + " + addend);
//        findPath(src * mult, target, addend, mult, path + " " + src + " * " + mult);
//    }
//
//class DZ2 {
//    public int numIslands(char[][] grid) {
//        int count = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] == '1') {
//                    dfs(i, j, grid);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    private void dfs(int i, int j, char[][] grid) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
//                || grid[i][j] != '1') {
//            return;
//        }
//
//        grid[i][j] = '0';
//        dfs(i - 1, j, grid);
//        dfs(i + 1, j, grid);
//        dfs(i, j - 1, grid);
//        dfs(i, j + 1, grid);
//    }
//}
