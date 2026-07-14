import java.util.Scanner;

class interest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        float SI = (P * T * R) / 100.0f;

        System.out.println(SI);

        sc.close();
    }
}
