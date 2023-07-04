public class Friend {
    int id;
    int food;

    public Friend(int id, int food) {
        this.id = id;
        this.food = food;
    }
}
public class Graph {
    Friend[] friends;
    int[][] adjMatrix;

    public Graph(Friend[] friends, int[][] adjMatrix) {
        this.friends = friends;
        this.adjMatrix = adjMatrix;
    }
}
public class PartyPlanner {
    public static void main(String[] args) {
        // Datos de entrada
        int N = 10; // Cantidad de amigos y amigos de amigos
        int F = 3; // Cantidad de amigos que queremos invitar
        int[][] adjMatrix = new int[N][N];
        adjMatrix[0] = new int[] { 0, 2, 4, 1, 0, 0, 0, 0, 0, 0 };
        adjMatrix[1] = new int[] { 2, 0, 0, 3, 10, 0, 0, 0, 0, 0 };
        adjMatrix[2] = new int[] { 4, 0, 0, 0, 0, 5, 0, 0, 0, 0 };
        adjMatrix[3] = new int[] { 1, 3, 0, 0, 0, 1, 7, 0, 0, 0 };
        adjMatrix[4] = new int[] { 0, 10, 0, 0, 0, 0, 0, 5, 1, 0 };
        adjMatrix[5] = new int[] { 0, 0, 5, 1, 0, 0, 0, 0, 0, 3 };
        adjMatrix[6] = new int[] { 0, 0, 0, 7, 0, 0, 0, 2, 0, 0 };
        adjMatrix[7] = new int[] { 0, 0, 0, 0, 5, 0, 2, 0, 4, 0 };

