/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakteki;

/**
 *
 * @author Asus A456UR
 */
public class BajuAksi {
    public static void main(String[] args) {
        Baju Muslim = new Baju();
        Baju Piama = new Baju();
        Baju Kemeja = new Baju();
        
        Muslim.Merk ="Dannis";
        Muslim.Ukuran ="XL";
        Muslim.Warna ="Pink";
        Muslim.Model ="Gamis";
        Muslim.Jenis_kain ="Katun";
                
        Piama.Merk = "Carter super";
        Piama.Ukuran = "L";  
        Piama.Warna = "Ungu";  
        Piama.Model = "Karakter";  
        Piama.Jenis_kain = "Sipon";
        
        Kemeja.Merk = "Logo";
        Kemeja.Ukuran = "XXL";
        Kemeja.Warna = "Putih";
        Kemeja.Model = "Polos";
        Kemeja.Jenis_kain = "Sutra";
    }
    
}
