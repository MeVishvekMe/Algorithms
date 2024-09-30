import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,0,1},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };
        List<Integer> result = new ArrayList<>();
        bfs(matrix, result);
        System.out.println(result);
    }

    public static void bfs(int[][] matrix, List<Integer> result) {
        boolean[] visited = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);
            int i = 0;
            while(i < matrix.length) {
                if(matrix[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
                i++;
            }
        }
    }
}