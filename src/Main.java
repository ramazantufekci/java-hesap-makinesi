import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner girdi = new Scanner(System.in);
        System.out.print("ilk Sayıyı Giriniz : ");
        n1 = girdi.nextInt();
        System.out.print("ikinci Sayıyı Giriniz : ");
        n2 = girdi.nextInt();

        System.out.println("1-Toplam\n2-çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz : ");
        select = girdi.nextInt();
        switch (select){
            case 1:
                System.out.print(n1+" + "+n2+" Toplamı : "+(n1+n2));
                break;
            case 2:
                System.out.print(n1+" - "+n2+" Sonuç : "+(n1-n2));
                break;
            case 3:
                System.out.print(n1+" * "+n2+" Sonuç : "+(n1*n2));
                break;
            case 4:
                if(n2 != 0)
                {
                    System.out.print(n1+" / "+n2+" Sonuç : "+(n1/n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez");
                }

                break;
            default:
                System.out.println("Hata");
                break;
        }
    }


}
