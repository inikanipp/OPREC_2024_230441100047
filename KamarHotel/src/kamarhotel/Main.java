/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kamarhotel;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class Main {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayList<kamarHotel> dataKamar = new ArrayList();
       String repeat =null;
       
//       perulangan untuk memulai ulang program
       do{
           
//           display pilihan
           System.out.println("|======================================|");
        System.out.println("|               Sewa Kamar             |");
        System.out.println("|======================================|");
        System.out.println("\n|Pilih Tipe Kamar yang anda inginkan !");
        System.out.println("|1. Reguler ( Kapasitas 1 orang )\n|Harga : Rp.100.000");
        System.out.println("|2. Double Reguler ( Kapasitas 2 orang )\n|Harga : Rp.200.000");
        System.out.println("|3. Premium ( Kapasitas 2 orang )\n|Harga : Rp.250.000");
        System.out.println("|4. Deluxe ( Kapasitas 2 orang )\n|Harga : Rp.350.000");
        System.out.println("|5. Super Premium ( Kapasitas 2 orang )\n|Harga : Rp.500.000");
        
//       menginputkan data
        System.out.println("|Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();
        input.nextLine();
        System.out.println("|Masukkan Nama Anda : ");
        String nama = input.nextLine();
        System.out.println("|Masukkan Umur Anda : ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.println("|Sewa Kamar Berapa Lama (Hari) : ");
        int hari = input.nextInt();
        input.nextLine();
        System.out.println("|======================================|");
        
//        pembuatan object dari super class
        kamarHotel kamar = null;
//        seleksi kondisi umur memastikan cukup umur dan hari unutk mendapatkan diskon 10%
        if(umur >= 19){
            if(hari > 7){
                switch(pilihan){
                case 1 :
                    kamar = new kamarReguler("Reguler", nama, 100000-(100000*10/100) );
                    break;
                case 2 :
                    kamar = new doubleReguler("Double Reguler", nama, 200000-(200000*10/100) );
                    break;
                case 3 :
                    kamar = new Premium("Reguler", nama, 250000-(250000*10/100) );
                    break;
                case 4 :
                    kamar = new Deluxe("Reguler", nama, 350000-(350000*10/100) );
                    break;
                case 5 :
                    kamar = new superPremium("Reguler", nama, 500000-(500000*10/100 ));
                    break;
                default :
                    System.out.println("pilihan tidak tersedia !!");
                }             
            }
            else {
                switch(pilihan){
                case 1 :
                    kamar = new kamarReguler("Reguler", nama, 100000 );
                    break;
                case 2 :
                    kamar = new doubleReguler("Double Reguler", nama, 200000 );
                    break;
                case 3 :
                    kamar = new Premium("Reguler", nama, 250000 );
                    break;
                case 4 :
                    kamar = new Deluxe("Reguler", nama, 350000 );
                    break;
                case 5 :
                    kamar = new superPremium("Reguler", nama, 500000 );
                    break;
                default :
                    System.out.println("pilihan tidak tersedia !!");
            }             
            }
        }
        else {
            System.out.println("Tidak Cukup Umur !!");
        }
        
//        output
        System.out.println("\n|======================================|");
        if(kamar != null){
            System.out.println("| jenis kamar : " + kamar.getTipeKamar());
            System.out.println("| nama tamu : " + kamar.getNamaPenyewa());
            System.out.println("| lama menginap : " + hari);
            System.out.println("| total harga (Termasuk Diskon) :" + kamar.getHargaKamar());
             System.out.println("\n| Apakah ingin mengulang ? Y/N");
            repeat = input.nextLine();
        }
        else {
            System.out.println("Apakah ingin mengulang ? Y/N");
            repeat = input.nextLine();
        }
       }while(repeat.equalsIgnoreCase("Y"));
    }
        
        
}
    
