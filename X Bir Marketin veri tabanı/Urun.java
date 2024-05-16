

public class Urun extends Siparis_Bilgisi
{
    private int urunID;
    private String barkod;
    private String urun_adi;
    private String urun_grubu;
    private String urun;
    private String uretici_markasi;
    private String Tedarikci;
    private String Satis_Birimi;
    private int birim_fiyati;
    private int stok_miktari;
    private int sube_kodu;


    public Urun()
    {

    }
    
    public void yazdir(){
        System.out.println("Urun Bilgileri = " +urunID +barkod +urun_adi);

    }



}
