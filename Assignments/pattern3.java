class pattern3 {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (rows - i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}