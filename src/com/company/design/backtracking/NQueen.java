package com.company.design.backtracking;

import java.util.ArrayList;

public class NQueen {

    public NQueen() {
    }

    public void dfs(Integer n, Integer currentRow, ArrayList<Integer> currentCandidate){
        if (currentRow == n) System.out.println(currentCandidate);

        for (int i = 0; i < n; i++){
            if (this.isAvailable(currentCandidate, i)){
                currentCandidate.add(i);
                this.dfs(n, currentRow+1, currentCandidate );
                currentCandidate.remove(currentCandidate.size()-1);
            }
        }

    }

    private boolean isAvailable(ArrayList<Integer> candidate, Integer column) {
        Integer currentRow = candidate.size();
        for (int i = 0; i < currentRow; i++) if (
                    candidate.get(i) == column ||
                            Math.abs(candidate.get(i) - column) == currentRow - i
            ) return false;

        return true;
    }

}
