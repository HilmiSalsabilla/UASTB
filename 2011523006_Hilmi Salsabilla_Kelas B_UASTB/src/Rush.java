
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

// inheritance , implements
public class Rush implements Mobil {

    private int kecepatan;
    private int penumpang;
    private boolean isPowerOn;

    public Rush() {
        // set kecepatan awal
        this.kecepatan = 50;
        this.penumpang = 1;
    }

    public void HidupkanMesin() {
        isPowerOn = true;
        System.out.println("Mobil sudah menyala...");
        System.out.println("Selamat datang di Toyota Rush");
        System.out.println("Tipe : Rush 2015 G");
    }

    public void MatikanMesin() {
        isPowerOn = false;
        System.out.println("Mobil sudah dimatikan");
    }

    public void TambahKecepatan() {
        // logika percabangan
        if (isPowerOn) {
            if (this.kecepatan == MAX_SPEED) {
                System.out.println("Kecepatan FULL!!");
                System.out.println("sudah " + this.getSpeed() + "%");                
            } else {
                this.kecepatan += 10;
                System.out.println("Kecepatan sekarang: " + this.getSpeed());
            }
        } else {
            System.out.println("Nyalakan dulu mobil anda!!");
        }
    }


    public void KurangiKecepatan() {
        // logika percabangan
        if (isPowerOn) {
            if (this.kecepatan == MIN_SPEED) {
                System.out.println("Kecepatan = 0%");
            } else {
                this.kecepatan -= 10;
                System.out.println("Kecepatan sekarang: " + this.getSpeed());
            }
        } else {
            System.out.println("Nyalakan dulu mobilnya!!");
        }
    }
    
    public void TambahPenumpang() {
        // logika percabangan
        
            if (this.penumpang == max_penumpang) {
                System.out.println("Penumpang FULL!!");
                System.out.println("Sudah " + this.getPenumpang() + " Orang");
                System.out.println("=======================================");
                int jumlah = this.getPenumpang();
                // perulangan
                for(int x = 1; x <= jumlah; x++){
                  System.out.println("Penumpang Ke = " + x + "");  
                }
            } else {
                this.penumpang += 1;
                System.out.println("Penumpang sekarang: " + this.getPenumpang());
            }
        
    }
    
    public void KurangiPenumpang() {
        // logika percabangan       
        if (this.penumpang == min_penumpang) {
            System.out.println("Penumpang Tidak Ada");
        } else {
               this.penumpang -= 1;
            System.out.println("Penumpang sekarang: " + this.getPenumpang());
        }
        
    }
    
    
    public void CekUsiaMobil() {
        Calendar c = Calendar.getInstance();
        int tahun = c.get(Calendar.YEAR);
        int usia = tahun - 2015;
        System.out.println("Mobil Sekarang Sudah Berusia = "+usia+" Tahun");
    }

    public int getSpeed() {
        return this.kecepatan;
    }
    
    public int getPenumpang() {
        return this.penumpang;
    }
    
    // deklarasi variabel
    private Connection conn;
    private Statement stat;
    
    // buat method koneksi database
    public void koneksi_database() {
        try{
            String username = "root";
            String password = "";
            String database = "db_mobil";
            String url = "jdbc:mysql://localhost:3306/"+database;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }catch (SQLException e) {
            System.out.println(e);
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}