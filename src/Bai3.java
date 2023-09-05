import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //in danh sach so chan
        System.out.println("Danh sach so chan: ");
        for(int i=0;i<n;i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //in danh sach so le
        System.out.println("\nDanh sach so le: ");
        for(int i=0;i<n;i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //in danh sach so nguyen to
        System.out.println("\nDanh sach so nguyen to: ");
        for(int i=2;i<n;i++) {
            if(isNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isNguyenTo(int nt) {
        if(nt < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(nt); i++) {
            if(nt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
