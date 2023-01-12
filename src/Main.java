import model.Generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);


        System.out.println("enter length of desired password");
        number = input.nextInt();

        Generator generator = new Generator(number);

        System.out.println(generator.getPassword());
    }
}