

import java.util.Scanner;

public class boooommm {
    public static void main(String[] args) throws InterruptedException {

        Scanner ler = new Scanner(System.in);

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("BOOMMMMMMMM");

    }
}
