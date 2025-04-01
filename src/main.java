import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, num2 = 0;

        System.out.print("숫자를 입력하시오;");
        num = sc.nextInt();
        System.out.print("한번 더 입력해;");
        num2 = sc.nextInt();

        System.out.println(num+num2);
    }
}