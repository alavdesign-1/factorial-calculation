
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hangi sayinin faktoriyelini ogrenmek istersiniz? ");
        int faktoriyel = scanner.nextInt();
        int sonuc=1;
        for(int i=1;i<=faktoriyel;i++){
            sonuc*=i;
        }
        System.out.println("sonuc: " + sonuc);
        System.out.println();
    }
}
