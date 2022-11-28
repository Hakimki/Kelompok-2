/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

/**
 *
 * @author Fahmi Hakim
 */
public class Asus extends Laptop {
    
     public static void main(String[] args) {
        
        Laptop hooh = new Laptop();
        hooh.merkLaptop = "Hp Pavilion Gaming 15";
        
       hooh.setMerkLaptop("Lenovo Ideapad 3");
       hooh.setJenisProsessor("AMD Ryzen 7 5000H");
       hooh.setKodeLaptop("14ALC6");
       hooh.setTahun(2020);
       
       
        System.out.println("Merk Laptop :" + hooh.getMerkLaptop());
        System.out.println("Kode Laptop :" + hooh.getKodeLaptop());
        System.out.println("Prosessor :" + hooh.getJenisProsessor());
        System.out.println("Tahun Keluar :" + hooh.getTahun());
    }
   
    
}

