import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] cinema = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int selectedAmount = scanner.nextInt();
        int rowNumber = Integer.MAX_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= seats - selectedAmount; j++) {
                int emptySeatCounter = 0;
                for (int k = 0; k < selectedAmount; k++) {
                    if (cinema[i][j + k] == 0) {
                        emptySeatCounter++;
                    }
                }
                if (emptySeatCounter == selectedAmount && i + 1 < rowNumber) {
                    rowNumber = i + 1;
                }
            }
        }
        System.out.println(rowNumber != Integer.MAX_VALUE ? rowNumber : 0);
    }
}