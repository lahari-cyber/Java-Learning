class Primenumbers {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {

            int i;

            for (i = 2; i < num; i++) {

                if (num % i == 0) {
                    break;
                }
            }

            if (i == num) {
                System.out.print(num + " ");
            }
        }
    }
}