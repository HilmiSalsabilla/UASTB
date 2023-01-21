import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // membuat objek Rush
        Mobil rush = new Rush();

        // membuat objek sopir
        Driver sopir = new Driver(rush);

        // kita coba nyalakan mobil
        sopir.HidupkanMesin();
        
        // menyimpan input aksi user
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE KENDARAAN ===");
            System.out.println("[1] Nyalakan Mobil");
            System.out.println("[2] Matikan Mobil");
            System.out.println("[3] Tambah Kecepatan");
            System.out.println("[4] Kurangi Kecepatan");
            System.out.println("[5] Tambah Penumpang");
            System.out.println("[6] Kurangi Penumpang");
            System.out.println("[7] Cek Usia Mobil");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih Aksi > : ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                sopir.HidupkanMesin();
            } else if (aksi.equalsIgnoreCase("2")){
                sopir.MatikanMesin();
            } else if (aksi.equalsIgnoreCase("3")){
                sopir.TambahKecepatan();
            } else if (aksi.equalsIgnoreCase("4")){
                sopir.KurangiKecepatan();
            }else if (aksi.equalsIgnoreCase("5")){
                sopir.TambahPenumpang();
            }else if (aksi.equalsIgnoreCase("6")){
                sopir.KurangiPenumpang();
            }else if (aksi.equalsIgnoreCase("7")){
                sopir.CekUsiaMobil();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}