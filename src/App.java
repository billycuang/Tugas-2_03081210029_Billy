import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Hitung Volume Tabung");
        tabung tabung1 = new tabung();
        System.out.println("Masukkan jari-jari");
        tabung1.r = keyboard.nextInt();
        System.out.println("Masukkan tinggi");
        tabung1.t = keyboard.nextInt();
        tabung1.hitungVolume();
        tabung1.displayVolume();
    }
}
