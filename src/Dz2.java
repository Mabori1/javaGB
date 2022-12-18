//class Dz2 {
//    int res = 0;
//
//    public int maxAreaOfIsland(int[][] grid) {
//
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    res = Math.max(res, dfs(i, j, grid));
//                }
//            }
//        }
//        return res;
//    }
//
//    private int dfs(int i, int j, int[][] grid) {
//
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
//                || grid[i][j] != 1) {
//            return 0;
//        }
//
//        grid[i][j] = 0;
//
//        return 1 + dfs(i - 1, j, grid)
//                + dfs(i + 1, j, grid)
//                + dfs(i, j - 1, grid)
//                + dfs(i, j + 1, grid);
//    }
//}
//
////=================================================================================
//class Solution {
//
//    HashMap<Integer, List<Integer>> isVisited = new HashMap<>();
//
//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//
//        if (image == null || image[0] == null) {
//            return image;
//        }
//
//        dfs(image, sr, sc, color, image[sr][sc]);
//
//        return image;
//    }
//
//    public void dfs(int[][] image, int i, int j, int newColor, int originalColor) {
//
//        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length
//                || image[i][j] != originalColor || (isVisited.containsKey(i)
//                && isVisited.get(i).contains(j))) {
//            return;
//        }
//
//        image[i][j] = newColor;
//
//        if (isVisited.containsKey(i)) {
//            isVisited.get(i).add(j);
//        } else {
//            List<Integer> list = new ArrayList<>();
//            list.add(j);
//            isVisited.put(i, list);
//        }
//
//        dfs(image, i + 1, j, newColor, originalColor);
//        dfs(image, i - 1, j, newColor, originalColor);
//        dfs(image, i, j + 1, newColor, originalColor);
//        dfs(image, i, j - 1, newColor, originalColor);
//    }
//}
////++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//public class Solution_recursion {
//    public boolean isSymmetric(TreeNode root) {
//
//        if (root == null) {
//            return true;
//        }
//
//        return dfs(root.left, root.right);
//    }
//
//    private boolean dfs(TreeNode q, TreeNode p) {
//        if (q == null && p == null) {
//            return true;
//        } else if (q == null && p != null) {
//            return false;
//        } else if (q != null && p == null) {
//            return false;
//        } else {
//            return q.val == p.val
//                    && dfs(q.left, p.right) && dfs(q.right, p.left);
//        }
//
//    }
//}
