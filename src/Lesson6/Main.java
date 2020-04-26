package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        balance();
    }
    static void balance() {
        int balanced = 0;
        Random random = new Random();
        Tree<Integer, String>[] treeMaps = new Tree[10000];
        for (int i = 0; i < treeMaps.length; i++) {
            treeMaps[i] = new Tree<>();
            while (treeMaps[i].height() < 5) {
                treeMaps[i].put(random.nextInt(200) , "");
            }
            if (treeMaps[i].isBalance()) {
                balanced++;
            }
        }
        System.out.println((double) balanced/treeMaps.length);
    }
}
