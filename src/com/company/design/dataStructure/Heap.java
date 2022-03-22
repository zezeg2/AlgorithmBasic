package com.company.design.dataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    private ArrayList<Integer> heapArray = null;

    public Heap() {
        heapArray = new ArrayList<>();
        heapArray.add(null);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heapArray=" + heapArray +
                '}';
    }

    public Heap(Integer data) {
        heapArray = new ArrayList<>();

        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean insertTo(Integer data) {
        Integer insertedIdx, parentIdx;
        if (heapArray == null) {
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }
        this.heapArray.add(data);
        insertedIdx = this.heapArray.size() - 1;

        while (this.moveUp(insertedIdx)) {
            parentIdx = insertedIdx / 2;
            Collections.swap(this.heapArray, insertedIdx, parentIdx);
            insertedIdx = parentIdx;
        }

        return true;
    }

    private boolean moveUp(Integer insertedIdx) {
        if (insertedIdx <= 1) return false;
        Integer parentIdx = insertedIdx / 2;
        return this.heapArray.get(insertedIdx) > this.heapArray.get(parentIdx);
    }

    public Integer pop() {
        Integer poppedData, poppedIdx, leftChildIdx, rightChildIdx;
        if (this.heapArray == null) return null;
        else {
            poppedData = this.heapArray.get(1);
            this.heapArray.set(1, this.heapArray.get(this.heapArray.size()-1));
            this.heapArray.remove(this.heapArray.size()-1);
            poppedIdx = 1;

            while (this.moveDown(poppedIdx)){
                leftChildIdx = poppedIdx*2;
                rightChildIdx = poppedIdx*2+1;

                if (rightChildIdx >=this.heapArray.size()){
                    if (this.heapArray.get(poppedIdx) < this.heapArray.get(leftChildIdx)){
                        Collections.swap(heapArray,poppedIdx,leftChildIdx);
                    }
                }
                else{
                    if (this.heapArray.get(leftChildIdx) > this.heapArray.get(rightChildIdx)){
                        if (this.heapArray.get(poppedIdx) < heapArray.get(leftChildIdx)){
                            Collections.swap(heapArray,poppedIdx,leftChildIdx);
                            poppedIdx = leftChildIdx;
                        }
                    }
                    else{
                        if (this.heapArray.get(poppedIdx) < heapArray.get(rightChildIdx)){
                            Collections.swap(heapArray,poppedIdx,rightChildIdx);
                            poppedIdx = rightChildIdx;
                        }
                    }

                }
            }
            return poppedData;
        }
    }

    public boolean moveDown(Integer poppedIdx) {
        Integer leftPoppedIdx, rightPoppedIdx;
        leftPoppedIdx = poppedIdx * 2;
        rightPoppedIdx = poppedIdx * 2 + 1;

        // case1 자식노드가 하나도 없을때
        if (leftPoppedIdx >= this.heapArray.size()) return false;
        // case2 오른쪽 자식 노드만 없을때
        else if (rightPoppedIdx >= this.heapArray.size()) {
            return this.heapArray.get(poppedIdx) < this.heapArray.get(leftPoppedIdx);
        }
        // case3 왼쪽, 오른쪽 자식노드가 모두 있을 때
        else {
            if (this.heapArray.get(leftPoppedIdx) > this.heapArray.get(rightPoppedIdx)) {
                return this.heapArray.get(poppedIdx) < this.heapArray.get(leftPoppedIdx);
            }
            else {
                return this.heapArray.get(poppedIdx) < this.heapArray.get(rightPoppedIdx);
            }
        }
    }
}
