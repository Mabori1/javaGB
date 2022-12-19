package Dz4;

import java.util.ArrayDeque;

public class Task4 {
    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length, columns = mat[0].length;
        int[][] distances = new int[rows][columns];
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mat[i][j] == 0)
                    queue.push(new int[]{i, j});
                else
                    distances[i][j] = Integer.MAX_VALUE;
            }
        }
        int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
        while (!queue.isEmpty()) {
            int[] cell = queue.pop();
            int row = cell[0], column = cell[1];
            int distance = distances[row][column];
            int newDistance = distance + 1;
            for (int[] direction : directions) {
                int newRow = row + direction[0], newColumn = column + direction[1];
                if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < columns) {
                    if (distances[newRow][newColumn] > newDistance) {
                        distances[newRow][newColumn] = newDistance;
                        queue.push(new int[]{newRow, newColumn});
                    }
                }
            }
        }
        return distances;
    }
}
