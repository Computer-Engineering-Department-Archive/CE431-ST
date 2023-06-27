package com.company;

import java.util.*;

public class TestPathGenerator {
    public static HashSet<List<Integer>> deriveTestPaths(HashSet<List<Integer>> primePaths, int source, int destination) {
        HashSet<List<Integer>> completePaths = new HashSet<>();
        HashSet<List<Integer>> cyclePaths = new HashSet<>();

        for (List<Integer> path : primePaths) {
            if (path.get(0) == source && path.get(path.size() - 1) == destination) completePaths.add(path);

            if (Objects.equals(path.get(0), path.get(path.size() - 1))) cyclePaths.add(path);
        }

        HashSet<List<Integer>> derivedPaths = new HashSet<>();
        for (List<Integer> path : completePaths) {
            derivedPaths.add(path);

            for (List<Integer> cycle : cyclePaths) {
                int vertex = cycle.get(0);

                List<Integer> derived = new ArrayList<>(path);
                derived.addAll(path.indexOf(vertex) + 1, cycle.subList(1, cycle.size()));

                derivedPaths.add(derived);
            }
        }

        return derivedPaths;
    }
}

