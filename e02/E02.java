import java.util.Scanner;
class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int x = scanner.nextInt();
        System.out.println("Give another number: ");
        int y = scanner.nextInt();
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " / " + y + " = " + (x/y));
    }
}