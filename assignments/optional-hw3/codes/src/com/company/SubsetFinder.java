package com.company;

import java.util.HashSet;
import java.util.List;

public class SubsetFinder {
    public static HashSet<List<Integer>> removeSubPaths(HashSet<List<Integer>> paths) {
        HashSet<List<Integer>> results = new HashSet<>(paths);

        for (List<Integer> path : paths) {
            for (List<Integer> otherPath : paths) {
                if (path != otherPath && isSubset(path, otherPath)) {
                    results.remove(path);
                }
            }
        }

        return results;
    }

    public static boolean isSubset(List<Integer> path, List<Integer> otherPath) {
        int i = 0;
        int j = 0;

        while (i < path.size() && j < otherPath.size()) {
            if (path.get(i).equals(otherPath.get(j))) {
                i++;
            }
            j++;
        }

        return i == path.size();
    }
}
