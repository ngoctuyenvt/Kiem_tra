import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Bảng cửu chương: ");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + "*" + i + "=" +result);
        }
    }
}
