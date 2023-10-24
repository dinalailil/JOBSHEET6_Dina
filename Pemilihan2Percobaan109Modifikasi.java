import java.util.Scanner;
public class Pemilihan2Percobaan109Modifikasi {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = input09.nextInt();
        if((tahun % 4) == 0) {
            if ((tahun & 100) != 0)
            System.out.println("Tahun Kabisat");
        else
        System.out.println("Bukan Tahun Kabisat");}
    }
}