import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oyun başlangıcı için satır girin:");
        int rowNumber = scanner.nextInt();
        System.out.print("Oyun başlangıcı için sutun girin:");
        int colNumber = scanner.nextInt();
        MineSweeper mineSweeper=new MineSweeper(rowNumber,colNumber);
        mineSweeper.run();
    }
}