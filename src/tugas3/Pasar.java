package tugas3;
import java.util.Scanner;
public class Pasar {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Pasar Buah dan Sayur ");
            System.out.println("1.Sayur");
            System.out.println("2.Buah");
            System.out.println("3.Exit");
            System.out.print("Silahkan pilih belanjaan anda  : ");
            int pilih = input.nextInt();

            if(pilih == 1 ){
                Sayur sayur = new Sayur();
                sayur.sayHello();
                sayur.pilihSayur();
            }else if(pilih == 2){
                Buah buah = new Buah();
                buah.sayHello();
                buah.pilihBuah();
            }else if(pilih == 3){
                System.out.println("Terimakasih");
            }else{
                System.out.println("Silahkan pilih antara no 1-3 !!");
            }
        }
    }

