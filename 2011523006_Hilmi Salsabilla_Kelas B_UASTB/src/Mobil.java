// create interface Mobil
public interface Mobil {
    int MAX_SPEED = 100;
    int MIN_SPEED = 0;
    
    int max_penumpang = 7;
    int min_penumpang = 0;
    
    // create method string
    void HidupkanMesin();
    void MatikanMesin();
    void TambahKecepatan();
    void KurangiKecepatan();
    void TambahPenumpang();
    void KurangiPenumpang();
    
    // create method date
    void CekUsiaMobil();
}