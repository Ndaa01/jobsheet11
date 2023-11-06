import java.util.Scanner;

public class NestedLoop_2341720132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota Ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari Ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota Ke-" + (i + 1) + ": ");
            double total = 0;
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                total += temp;
            }
            double rata = total / temps[i].length;
            System.out.println("\nRata-rata: " + rata);
            System.out.println();
        }
    }
}
