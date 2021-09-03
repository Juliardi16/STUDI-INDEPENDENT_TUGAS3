package tugas3;
import java.util.Scanner;
public class BuahDanSayur {
    void sayHello(){
        System.out.println("==================");
        System.out.println("Selamat Berbelanja");
    }
}
class Buah extends BuahDanSayur{
    String buah[] = {"","Apel","jeruk"};
    int harga[] ={0,1000,2000};
    String namaBuah[] = new String[100];
    int hargaBuah[] = new int[100];
    int jml,pilih;
    int totalHarga = 0;
    int k = 0;
    boolean ulang = true;

    void sayHello(){
        super.sayHello();
        System.out.println("Aneka Macam Buah");
    }

    void pilihBuah(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Apel  Rp 1000/kg");
        System.out.println("2.Jeruk Rp 2000/kg");
        System.out.println("3.Ceck Out");
        while(ulang){
            System.out.print("Pilih buah : ");
            pilih = input.nextInt();
            if(pilih ==1 ){
                System.out.print("Jumlah yang di beli @kg :");
                jml=input.nextInt();
                hargaBuah[k] = jml*harga[pilih];
                totalHarga = totalHarga + hargaBuah[k];
                namaBuah[k] = buah[pilih] + " "+jml+"kg";
                k++;
            }else if(pilih==2){
                System.out.print("Jumlah yang di beli @kg :");
                jml=input.nextInt();
                hargaBuah[k] = jml*harga[pilih];
                totalHarga= totalHarga + hargaBuah[k];
                namaBuah[k] = buah[pilih] + " " +jml+ "kg";
                k++;
            }else if (pilih == 3){
                System.out.println("Terimakasih");
                ulang=false;
            }else{
                System.out.println("Pilih antara 1-3 !!");
            }

        }
        System.out.println();
        strukBlanja();
    }
    void strukBlanja(){
        System.out.println("     Struk Belanja   ");
        System.out.println("=====================");
        System.out.println("No   NamaBuah   Harga");
        System.out.println("=====================");
        for(int i=0; i < k;i++){
            System.out.println(i+1+ "."+namaBuah[i] + " Rp" + hargaBuah[i]);
        }
        System.out.println("======================");
        System.out.println("Total Harga Rp" +totalHarga);
        System.out.println();
        System.out.println("     Terimakasih    ");
    }
}

class Sayur extends BuahDanSayur{
    String sayur[] = {"","Kol","Sawi"};
    int harga[] ={0,10000,15000};
    String namaSayur[] = new String[100];
    int hargaSayur[] = new int[100];
    int jml,pilih;
    int totalHarga = 0;
    int k = 0;
    boolean ulang = true;

    void sayHello(){
        super.sayHello();
        System.out.println("Sayur Segar ");
    }
    void pilihSayur(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kol  Rp 10000/kg");
        System.out.println("2.Sawi Rp 150000/kg");
        System.out.println("3.Ceck Out");
        while(ulang){
            System.out.print("Pilih Sayur : ");
            pilih = input.nextInt();
            if(pilih ==1 ){
                System.out.print("Jumlah yang di beli @kg :");
                jml=input.nextInt();
                hargaSayur[k] = jml*harga[pilih];
                totalHarga = totalHarga + hargaSayur[k];
                namaSayur[k] = sayur[pilih] + " "+jml+"kg";
                k++;
            }else if(pilih==2){
                System.out.print("Jumlah yang di beli @kg :");
                jml=input.nextInt();
                hargaSayur[k] = jml*harga[pilih];
                totalHarga= totalHarga + hargaSayur[k];
                namaSayur[k] = sayur[pilih] + " " +jml+ "kg";
                k++;
            }else if (pilih == 3){
                System.out.println("Terimakasih");
                ulang=false;
            }else{
                System.out.println("Pilih antara 1-3 !!");
            }

        }
        System.out.println();
        strukBlanja();
    }
    void strukBlanja(){
        System.out.println("     Struk Belanja   ");
        System.out.println("=====================");
        System.out.println("No   NamaSayur   Harga");
        System.out.println("=====================");
        for(int i=0; i < k;i++){
            System.out.println(i+1+ "."+namaSayur[i] + " Rp" + hargaSayur[i]);
        }
        System.out.println("======================");
        System.out.println("Total Harga Rp" +totalHarga);
        System.out.println();
        System.out.println("     Terimakasih    ");
    }

}
