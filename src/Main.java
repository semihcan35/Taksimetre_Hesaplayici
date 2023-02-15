import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float km;
        System.out.println("Lütfen mesafeyi km cinsinden giriniz:");
        km= input.nextFloat();
        float ucret= (float)((km*2.20)+10);
        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Ödemeniz gereken ücret:"+ ucret + " TL");

    }
}