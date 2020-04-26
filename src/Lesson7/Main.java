package Lesson7;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");
        graph.addVertex("5");
        graph.addVertex("6");

        graph.addEdge("1","2");
        graph.addEdge("2","3");
        graph.addEdge("3","4");
        graph.addEdge("4","5");
        graph.addEdge("5","6");

        Stack<String> path = graph.shortPath("1","6");
        showPath(path);
    }

    private static void showPath(Stack<String> path) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        int lenght = 0;

        while ( !path.isEmpty() ) {
            if (!isFirst) {
                sb.append(" -> ");
            }
            isFirst = false;
            sb.append(path.pop());
            lenght++;
        }
        System.out.println(sb);
        System.out.println("path " + lenght);
    }
}
