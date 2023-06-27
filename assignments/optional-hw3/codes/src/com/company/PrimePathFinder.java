package com.company;

import java.util.*;

import static com.company.SubsetFinder.removeSubPaths;
import static com.company.TestPathGenerator.deriveTestPaths;

public class PrimePathFinder {
    private int[][] graph;
    private boolean[] visited;
    private static List<List<Integer>> primePaths;

    public List<List<Integer>> findPrimePaths(int[][] graph, int startNode, int endNode) {
        this.graph = graph;
        int numNodes = graph.length;
        visited = new boolean[numNodes];
        primePaths = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        path.add(startNode);
        findPaths(startNode, endNode, path);

        return primePaths;
    }

    private void findPaths(int currentNode, int endNode, List<Integer> path) {
        visited[currentNode] = true;

        if (currentNode == endNode) {
            primePaths.add(new ArrayList<>(path));
        } else {
            for (int neighbor : graph[currentNode]) {
                if (!visited[neighbor]) {
                    path.add(neighbor);
                    findPaths(neighbor, endNode, path);
                    path.remove(path.size() - 1);
                } else {
                    path.add(neighbor);
                    primePaths.add(new ArrayList<>(path.subList(path.indexOf(neighbor), path.size())));
                    path.remove(path.size() - 1);
                }
            }
        }

        visited[currentNode] = false;
    }

    public static List<List<Integer>> findNumberCombinations(int[] numbers) {
        List<List<Integer>> combinations = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                combinations.add(Arrays.asList(numbers[i], numbers[j]));
            }
        }

        return combinations;
    }

    private static List<List<Integer>> findPrimePathsFromSrcToDest(int[][] graph, int src, int dest) {
        PrimePathFinder pathFinder = new PrimePathFinder();

        return pathFinder.findPrimePaths(graph, src, dest);
    }

    private static HashSet<List<Integer>> findPrimePaths(int[][] graph) {
        int[] vertices = new int[graph.length];

        for (int i = 0; i< graph.length; i++) vertices[i] = i;

        List<List<Integer>> combinations = findNumberCombinations(vertices);

        HashSet<List<Integer>> allPaths = new HashSet<>();
        for (List<Integer> list : combinations) {
            int src = list.get(0), dest = list.get(1);
            allPaths.addAll(findPrimePathsFromSrcToDest(graph, src, dest));
            allPaths.addAll(findPrimePathsFromSrcToDest(graph, dest, src));
        }

        return removeSubPaths(allPaths);
    }

    public static void main(String[] args) {
//        int[][] graph = {
//                {1},
//                {2},
//                {1, 3},
//                {}
//        };

        int[][] graph = {
                {1, 2},
                {3},
                {3},
                {}
        };

        HashSet<List<Integer>> primePaths = findPrimePaths(graph);
        HashSet<List<Integer>> testPaths = deriveTestPaths(primePaths, 0, graph.length - 1);

        System.out.println("Prime Paths: " + primePaths);
        System.out.println("Test Paths: " + testPaths);
    }
}
