package DaaPracTanisha;

import java.util.*;

public class SmallestSpanningTree {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of vertices: ");
int V = sc.nextInt();
List<int[]> edges = new ArrayList<>();

    System.out.println("Enter the number of edges: ");
    int E = sc.nextInt();
    
    System.out.println("Enter the edges in the format (source, destination, weight): ");
    for (int i = 0; i < E; i++) {
        int[] edge = new int[3];
        for (int j = 0; j < 3; j++) {
            edge[j] = sc.nextInt();
        }
        edges.add(edge);
    }
    
    System.out.println("Smallest value of largest edge in the spanning tree: " + computeSmallestSpanningTree(V, edges));
}

public static int computeSmallestSpanningTree(int V, List<int[]> edges) {
    Collections.sort(edges, Comparator.comparingInt(a -> a[2])); // Sort edges by weight
    
    UnionFind uf = new UnionFind(V);
    int maxEdge = 0;
    
    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        int weight = edge[2];
        
        if (uf.find(u) != uf.find(v)) {
            uf.union(u, v);
            maxEdge = Math.max(maxEdge, weight);
        }
    }
    
    return maxEdge;
}

static class UnionFind {
    int[] parent, rank;
    
    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX == rootY) {
            return;
        }
        
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}
}





