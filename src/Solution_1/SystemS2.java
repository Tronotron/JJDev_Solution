package Solutions_1;

import java.util.Scanner;

public class SystemS2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе счисления: ");
        int userNumber = in.nextInt();
        System.out.println("Вы ввели: " + userNumber);
        System.out.println(userNumber + " в двоичной системе счисления: ");

        int inputIn = 0;
        String str = "";
        while (userNumber > 0) {
            inputIn = userNumber % 2;
            userNumber = userNumber/2;
            str = inputIn + str;
        }
        System.out.println(str);
        //System.out.println(Integer.toString(host, 2));
    }
}

