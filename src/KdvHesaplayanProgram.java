import java.util.Scanner;
public class KdvHesaplayanProgram {
    public static void main (String[] args) {
        double fiyat,fiyat2;
       Scanner input = new Scanner(System.in);
        System.out.print("Ürnün fiyatını giriniz : ");
        fiyat= input.nextDouble();
        fiyat2 =  (fiyat+(fiyat*0.18)) ;
         String str = fiyat >= 1001 ? "KDV'li Fiyat = " + (fiyat+(fiyat*0.08)) +"TL"+" KDV Tutarı = " + fiyat*0.08 +"TL" : "KDV'li Fiyat = " +  fiyat2 +"TL"+ " KDV Tutarı = " + fiyat*0.18+"TL" ;
        System.out.print(str);
    }
}
