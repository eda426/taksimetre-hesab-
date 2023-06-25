import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double başKm=2.20,total=10;

        Scanner input=new Scanner(System.in);
        System.out.println("gidile mesafeyi km cinsinden giriniz");
        km=input.nextInt() ;
        total+= (km*başKm);

        total=(total<15) ? 20 : total;
        System.out.println("toplam tutar:"+total);
        }
    }
