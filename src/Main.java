import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height;
        int weight;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
        height=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight=inp.nextInt();

        double index= weight/(height*height);
        System.out.println("Vücut kitle indeksiniz: "+ index);
    }
}