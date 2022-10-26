import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        System.out.println("selamat datang kamu ingin simbol apa");
        System.out.println("tulis sibol yang inginkan");
        Scanner scanner = new Scanner(System.in);
        String simbol = scanner.nextLine();
        System.out.println("tulis jumlah yang ingin kamu tampilkan");
        int jumlah = scanner.nextInt();
        for (var i =0;i<jumlah;i++) {
            System.out.println(simbol);
        }
    }
}
