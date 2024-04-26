import java.util.*;

public class AdjencyListBerarah {
    int V;
    LinkedList<Character> adjListArray[];

    // Konstruktor
    AdjencyListBerarah(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // Method untuk menambahkan edge pada tiap vertex
    public void addEdge(char src, char dest) {
        adjListArray[src - 'A'].add(dest);
    }

    // Method untuk mencetak graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (!adjListArray[i].isEmpty()) {
                System.out.print("Vertex " + (char) (i + 'A') + " Menyambung Ke Vertex: ");
                for (char c : adjListArray[i]) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AdjencyListBerarah graph = new AdjencyListBerarah(9);
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('A', 'E');
        graph.addEdge('B', 'E');
        graph.addEdge('C', 'B');
        graph.addEdge('D', 'G');
        graph.addEdge('E', 'F');
        graph.addEdge('E', 'H');
        graph.addEdge('F', 'C');
        graph.addEdge('F', 'E');
        graph.addEdge('G', 'H');
        graph.addEdge('H', 'I');
        graph.addEdge('I', 'F');

        graph.printGraph();
    }

}
