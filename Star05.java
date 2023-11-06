import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai N = ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }
    }
}
