import java.util.Scanner;

class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[90];

        for (int i = 0; i < 90; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The numbers are:");

        for (int i = 0; i < 90; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}