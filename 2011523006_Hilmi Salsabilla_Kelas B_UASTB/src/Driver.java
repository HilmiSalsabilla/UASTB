// Create a class Driver
public class Driver {
    
    private Mobil mobil;

    // Create a class constructor Driver
    public Driver(Mobil mobil) {
        this.mobil = mobil;
    }
    
    
    void HidupkanMesin(){
        this.mobil.HidupkanMesin();
    }
    
    void MatikanMesin(){
        this.mobil.MatikanMesin();
    }
    
    void TambahKecepatan(){
        this.mobil.TambahKecepatan();
    }
    
    void KurangiKecepatan(){
        this.mobil.KurangiKecepatan();
    }
    
     void TambahPenumpang(){
        this.mobil.TambahPenumpang();
    }
    
    void KurangiPenumpang(){
        this.mobil.KurangiPenumpang();
    }
    
    void CekUsiaMobil(){
        this.mobil.CekUsiaMobil();
    }
    
}