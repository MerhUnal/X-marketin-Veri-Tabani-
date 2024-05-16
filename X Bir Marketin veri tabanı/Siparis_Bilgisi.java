


public class Siparis_Bilgisi
{
    protected int urunID;
    protected int musteriID;
    private int siparisID;
    protected int siparis_miktari;
    protected String siparis_Tarihi;
    protected String siparis_Durumu;
    protected String teslim_Adresi;
    private Urun m_urun;
    private Musteri m_musteri;

 
    public Siparis_Bilgisi()
    {
  
    }
    
    protected void yazdir(){
    
    System.out.println("Siparis ile ilgili Tum Bilgiler = " +urunID +musteriID +siparisID +siparis_miktari);
    }

 

}
