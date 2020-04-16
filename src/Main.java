import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Myarr arr = new Myarr(1000);
        for (int i = 0; i < arr.arr.length; i++) {
            arr.add(arr.fillRandom(10));
        }
        long time = System.currentTimeMillis();
        arr.sortBubble();
        System.out.println("Время выполнения = " + (System.currentTimeMillis() - time) + " мс.");
//        arr.sortSelect();
//        System.out.println("Время выполнения = " + (System.currentTimeMillis() - time) + " мс.");
        arr.info();
        arr.delete(0);
        arr.info();
    }
}
