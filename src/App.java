/**
 * Created by JaMachine on 8/21/2017.
 */
public class App {
    public static void main(String[] args) {

        new Thread(() -> {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("олд");
                }
            }).run();

            new Thread(() -> System.out.println("лямбда")).run();

        }).run();


//-----------------------------------------------------------------------------------------------------------


        Incrementer incrementer = x -> x + (int) (Math.random() * 100);

        System.out.println(incrementer.increment(7));

        //        Incrementer incrementer = new Incrementer() {
//            @Override
//            public int increment(int x) {
//                return x + (int) (Math.random() * 100);
//            }
//        };


    }
}
