package code;

import code2.Pair;

class Test {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(6, "Apr");
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}