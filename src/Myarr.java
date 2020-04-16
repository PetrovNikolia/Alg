import java.util.Random;

public class Myarr {
    int[] arr;
    private int size;

    public Myarr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public boolean binaryFind(int value){
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public int fillRandom(int bound) {
        Random rnd = new Random();
        return rnd.nextInt(bound);
    }

    public void add(int number) {
        arr[this.size] = number;
        this.size++;
    }

    public void delete(int number){
        if(find(number) != -1) {
            for (int i = find(number); i < this.size - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.size--;
            for (int i = 0; i < this.size; i++) {
                if (this.arr[i] == number) delete(number);
            }
        }
    }

    public int find(int findNumber) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == findNumber) return i;
        }
        return -1;
    }

    public void info() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Размер массива = " + this.size);
        System.out.println("Элементов удалено = " + (arr.length - this.size));
    }

    public void sortBubble(){
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    private void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }


    public void sortSelect(){
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.arr[in]< this.arr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }
}
