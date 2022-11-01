import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {

    String Kendaraan;
    int jam = 0;
    int bayar = 0;
    int totalbiaya = 0;
    int parkir = 0;

    Scanner myObj = new Scanner(System.in);

    // Kendaraan parkir mobil

    System.out.println("Nama Kendaraan anda : ");   
    Kendaraan = myObj.nextLine(); 

    System.out.println("Sudah berapa lama parkir? : ");
    parkir  = myObj.nextInt();
    
    if(Kendaraan.equals("mobil")){
        bayar = 5000; 
        jam = 3000;
    } else if(Kendaraan.equals("motor")) {
        bayar = 3000;
        jam = 2000;
    } else if(Kendaraan.equals("truk")) {
        bayar = 4000;
        jam  = 4000;
    } else {
        System.out.println("kendaraan kmu tidak termasuk");
    }

    if(parkir <= 10) {
        totalbiaya = bayar + ( parkir - 1 ) * jam ;
    } else {
        totalbiaya = bayar + 9 * jam; 
    }

    System.out.println("Total biaya adalah : "+ totalbiaya);
    System.out.println("Silahkan melakukan pembayaran");
    System.out.println("Terimakasih");
    }
}
