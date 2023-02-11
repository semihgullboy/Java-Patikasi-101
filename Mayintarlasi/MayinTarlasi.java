import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

    Random random = new Random();
    Scanner girdi = new Scanner(System.in);
    int satir;
    int sutun;
    int boyut;
    int bomba;
    int[][] map;
    int[][] board;
    boolean game = true;
    MineSweeper(int rowNumber,int colNumber){
        this.satir = rowNumber;
        this.sutun = colNumber;
        this.boyut = rowNumber*colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.bomba = this.boyut/4;
    }


    void run(){
        int row,col;
        olustur();
        print(this.map);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while(this.game){
            int success = 0;
            print(this.board);
            System.out.print("Satır Giriniz :");
            row = this.girdi.nextInt();
            System.out.print("Sütun Giriniz :");
            col = this.girdi.nextInt();
            if(row<0||row>=this.satir){
                System.out.println("Geçersiz Koordinat !");
                continue;
            }
            if(col<0||col>=this.sutun){
                System.out.println("Geçersiz Koordinat !");
                continue;
            }
            if (this.map[row][col]!=-1){
                bombaKontrol(row,col);
                success++;
                if (success==this.boyut-this.bomba){
                    System.out.println("Kazandınız !");
                }
            }else{
                this.game = false;
                System.out.println("Kaybettiniz ! :(");
            }
        }
    }

    private void bombaKontrol(int row, int col) {
        if(col+1<=this.sutun-1 && this.map[row][col+1] == -1){
            this.board[row][col]++;
        }else{
            this.board[row][col] =0;
        }
        if(col>0 && this.map[row][col-1]==-1){
            this.board[row][col]++;
        }
        if(row+1<this.satir-1 && this.map[row+1][col] == -1){
            this.board[row][col]++;
        }
        if(row>0 && this.map[row-1][col] == -1){
            this.board[row][col]++;
        }
        if(row==0 && this.map[row+1][col] == -1){
            this.board[row][col]++;
        }
    }

    private void print(int[][] map) {
        for (int[] ints:map){
            for (int j=0;j<map[0].length;j++){
                if (ints[j]>=0){
                    System.out.print(" ");
                }
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public void olustur(){
        int rand1,col1;
        int count = 0;
        while (count!=this.bomba){
            rand1 = random.nextInt(this.satir);
            col1 = random.nextInt(this.sutun);
            if(this.map[rand1][col1]!=-1){
                this.map[rand1][col1] = -1;
                count++;
            }
        }
    }
}