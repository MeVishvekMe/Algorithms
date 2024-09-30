import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,0},
            {1,0,0,0}
        };
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[matrix.length];
        dfs(matrix, 0, visited, result);
        System.out.println(result);
    }

    public static void dfs(int[][] matrix, int current, boolean[] visited, List<Integer> result) {
        visited[current] = true;
        result.add(current);
        int i = 0;
        while(i < matrix.length) {
            if (matrix[current][i] == 1 && !visited[i]) {
                dfs(matrix, i, visited, result);
            }
            i++;
        }
    }
}
