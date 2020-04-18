package Lesson5;

public class Backpack {
    Subject[] items;

    public Backpack(Subject[] items){
        this.items = items;
    }

    int packBackpack(int i, int weight) {
        if(i<0){
            return 0;
        }
        if(items[i].weight > weight){
            return packBackpack(i-1,weight);
        } else {
            return Math.max(packBackpack(i-1,weight),packBackpack(i-1,weight-items[i].weight)+items[i].cost);
        }
    }
}
