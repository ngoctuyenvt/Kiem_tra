public class Bai4 {
    public static void main(String[] args) {
        int[] arr = {2,7,6,8,9,21,34,56,32,12,37};
        // tim so lon nhat
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("So lon nhat: " + max);

        //tong so dau va so cuoi
        int result = arr[0] + arr[arr.length -1];
        System.out.println("Tong so dau va so cuoi: " + result);

        //tinh tong so chan
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Tong so chan trong mang: " + sum);
    }
}
