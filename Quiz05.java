import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Jawaban lebih kecil dari angka");
                } else if (answer > number) {
                    System.out.println("Jawaban lebih besar dari angka");
                }

                success = (answer == number);
            } while (!success);
            System.out.print("Apakah anda ingin mengulangi permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
