package com.itheima.search;

public class A03_BlockSearchDeo1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int target = 37;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        Block[] block = {b1, b2, b3};
        int flag = -1;
        for (int i = 0; i < block.length; i++) {
            int max = block[i].getMax();
            if (max >= target) {
                flag = checkNumber(block[i], target, arr);
                break;
            }
        }
        System.out.println(flag);
    }

    public static int checkNumber(Block b, int target, int[] arr) {
        for (int i = b.getHead(); i <= b.getEnd(); i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int head;
    private int end;

    public Block() {
    }

    public Block(int max, int head, int end) {
        this.max = max;
        this.head = head;
        this.end = end;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
