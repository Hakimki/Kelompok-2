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
 class Laptop {

   private String merkLaptop, jenisProsessor, kodeLaptop;
   private int  tahun, harga;
   
   
//   public void setmerkLaptop(String merkLaptop){
//       this.merkLaptop = merkLaptop;
//   }
//   public void setjenisProsessor(String jenisProsessor){
//       this.jenisProsessor = jenisProsessor;
//   }
//    public void setkodeLaptop(int kodeLaptop){
//       this.kodeLaptop = kodeLaptop;
//   }
//     public void settahun(int tahun){
//       this.jenisProsessor = jenisProsessor;
//   }

    public String getMerkLaptop() {
        return merkLaptop;
    }

    public void setMerkLaptop(String merkLaptop) {
        this.merkLaptop = merkLaptop;
    }

    public String getJenisProsessor() {
        return jenisProsessor;
    }

    public void setJenisProsessor(String jenisProsessor) {
        this.jenisProsessor = jenisProsessor;
    }

    public String getKodeLaptop() {
        return kodeLaptop;
    }

    public void setKodeLaptop(String kodeLaptop) {
        this.kodeLaptop = kodeLaptop;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
   
     
     
        
    String hidupkanLaptop() {
    return "Hidupkan Laptop";
  }
  
  String matikanLaptop() {
    return "Matikan Laptop";
  }

           
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
