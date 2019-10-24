package Solutions_1;

import java.util.Scanner;

public class SystemS16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе счисления: ");
        int userNumber = in.nextInt();
        System.out.println("Вы ввели: " + userNumber);
        System.out.println(userNumber + " в шестнадцатеричной системе счисления: ");

        int inputIn = 0;
        String str = "";
        while (userNumber > 0) {
            inputIn = userNumber % 16;
            userNumber = userNumber / 16;
            switch (inputIn){
                case 10:
                    str = str + "A";
                    break;
                case 11:
                    str = str + "B";
                    break;
                case 12:
                    str = str + "C";
                    break;
                case 13:
                    str = str + "D";
                    break;
                case 14:
                    str = str + "E";
                    break;
                case 15:
                    str = str + "F";
                    break;
                default:
                    str = inputIn + str;

            }
        }
        System.out.println(str);
    }
}



