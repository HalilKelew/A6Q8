package assignments;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        fib();
    }
        public static void fib(){
            Scanner sc = new Scanner(System.in);
            int a = 0,b = 1,c,d;
            System.out.println("Input:");
            d=sc.nextInt();
            System.out.println(a +"\n" +b);//\n is used to go to next line....
            for  (c=0;c<d;c++){
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
    }
}
    }
