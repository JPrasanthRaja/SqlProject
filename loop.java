package SqlProject;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Hello");
        // }

        // int i = 0;

        // while (i <= 5) {
        //     System.out.println("Hi");
        //     i++;
        // }

        Scanner obj = new Scanner(System.in);
        System.out.println("Get Number:");
        int in = obj.nextInt();

        int i = 1;

        do{

            System.out.println("loop");
            i++;

        }while(i <= 4);

    }
}
