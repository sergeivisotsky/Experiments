package DifferentExperiments;

public class DijkstraAlgorithm {
    private static int verticleIndex = 7;

    private int minDistance(int distance[], boolean shortestPathSet[]) {
        int minimal = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < verticleIndex; i++) {
            if (!shortestPathSet[i] && distance[i] <= minimal) {
                minimal = distance[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void printResult(int distance[], int number) {
        System.out.println("Vertex" + "\t" + "Distance from the start point: ");
        for (int i = 0; i < verticleIndex; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    private void dijkstra(int[][] graph) {
        int distance[] = new int[verticleIndex];
        boolean shortestPathSet[] = new boolean[verticleIndex];
        for (int i = 0; i < verticleIndex; i++) {
            distance[i] = Integer.MAX_VALUE;
            shortestPathSet[i] = false;
        }
        distance[0] = 0;

        for (int i = 0; i < verticleIndex - 1; i++) {
            int minimalDist = minDistance(distance, shortestPathSet);
            shortestPathSet[minimalDist] = true;

            for (int j = 0; j < verticleIndex; j++) {
                if (!shortestPathSet[j] &&
                        graph[minimalDist][j] != 0 &&
                        distance[minimalDist] != Integer.MAX_VALUE &&
                        distance[minimalDist] + graph[minimalDist][j] < distance[j]) {
                    distance[j] = distance[minimalDist] + graph[minimalDist][j];
                }
            }
        }

        printResult(distance, verticleIndex);
    }

    public static void main(String[] args) {
        int graph[][] = {
                {0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0}
        };
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.dijkstra(graph);
    }
}
