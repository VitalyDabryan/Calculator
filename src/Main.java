import java.util.Scanner;
class Main {
    public static void main(String args[]) throws java.io.IOException{
        System.out.print("Number1: ");
        Scanner scan = new Scanner(System.in);
        int a, b, result = 0;
        char c = '+';
        a = scan.nextInt();
        while (c != 's') {
            System.out.print("Enter '+,-,*,/,'c' or 's': ");
            c = (char) System.in.read ();
            if (c == '-' || c =='+' || c == '*' || c == '/') {
                System.out.print("Number2: ");
                b = scan.nextInt();
                switch (c) {
                    case '+':
                        result = a + b;
                        break;
                    case  '-':
                        result = a - b;
                        break;
                    case  '*':
                        result = a * b;
                        break;
                    case  '/':
                        result = a / b;
                        break;
                };
                System.out.println ("Result: " + result);
            }
            else {
                if (c == 'c') {
                    result = 0;
                    System.out.println ("Result: " + result);
                    c = (char) System.in.read();
                } else
                if (c != 's') {
                    System.out.println("Nekorrectny simbol!");
                    c = (char) System.in.read();
                    result = a;}
                else break;
            }
            a = result;
        }
    }
}