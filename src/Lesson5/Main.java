package Lesson5;

public class Main {
    public static void main(String[] args) throws Exception {

        Subject[] massSubject = {new Subject("Карта",1,1200),
                new Subject("Консервы",1,1000),
                new Subject("Палатка",4,7000),
                new Subject("Лодка",5,11000),
                new Subject("Одежда",2,8000),
                new Subject("Котелок",1,2000)};

        Backpack backpack = new Backpack(massSubject);

        BinaryFind arr = new BinaryFind(3);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);

        int search = 20;
        System.out.println(arr.binary(search));

       // System.out.println(backpack.packBackpack(massSubject.length-1,10));
       // System.out.println(RecPower(2,3));
    }
    static int RecPower(int a, int b){
        if(b==1){
            return a;
        }
        return RecPower(a,b-1)*a;
    }
}
