/**
 * Created by JaMachine on 8/21/2017.
 */
public class App {
    public static void main(String[] args) {

        new Thread(() -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("ТрэкШедулер 1");
                }
            }).run();
            new Thread(() -> System.out.println("ТрэкШедулер 2")).run();
        }).run();


    }
}
