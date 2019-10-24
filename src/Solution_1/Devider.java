package Solutions_1;

import java.util.Random;

public class Devider {

        public static void main(String[] args) {
            Random input = new Random();
            for  (int i = 0; i < 10; i++) {
                int a = input.nextInt(128);
                int b = input.nextInt(128);
                System.out.println("NOD(" + a + "," + b + ") = " + getDeviderGCD(a,b));
            }
        }

        private static int getDeviderGCD(int a, int b){
            int bigger;
            int smaller;
            if (a >b) {
                bigger = a;
                smaller = b;
            } else {
                bigger = b;
                smaller = a;
            }
            while (smaller > 0 ) {
                int remainder = bigger % smaller;
                bigger = smaller;
                smaller = remainder;
            }
            return bigger;
    }
}