import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, maks=0,min=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n=input.nextInt();

        for (int i =1 ; i<=n;i++){

            System.out.print(i+". Sayıyı Giriniz: ");
            int sayi=input.nextInt();

            if(i==1){
                maks=sayi;
                min=sayi;
            }else if(sayi>maks){
                maks=sayi;
            }else if(sayi<min) {
                min=sayi;
            }
        }
        System.out.println("En Büyük Sayı: "+maks);
        System.out.println("En Küçük Sayı: "+min);

    }
}
