
public class Musteri extends Siparis_Bilgisi
{
    private int musteriID;
    private String adi;
    private String soyadi;
    private int KrediKartNumarasi;
    private char cinsiyet;
    private int cep_telefonu;
    private String eposta;
    private String adres;
    private String musteri_Kriptolu_Sifre;

 
    public Musteri()
    {
       
    }
    
    public Musteri (int p_musteriID){
        musteriID = p_musteriID;
    }

    public Musteri (int p_musteriID, String p_adi){
        musteriID = p_musteriID;
        adi = p_adi;
    }
    
    public int getMusteriID(){
        return musteriID;
    }
    
    public int getMusteriID(String p_adi){
        
        if (p_adi == adi){
            return musteriID;
        }
        return 0;
        
        
    }
    
    public void yazdir(){
        
        System.out.println("Musteri Bilgileri = " +musteriID +adi +soyadi);
        
    }
    
    
    

  

}
