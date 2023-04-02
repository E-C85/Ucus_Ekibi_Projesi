public class Kisi { //pojo

    //fields
   private  String isim;
   private  String soyisim;
   private double maas;
   private String kimlikno;
   private int yas;



   @Override
   public String toString() {
      return
              "isim='" + isim + '\'' +
              ", soyisim='" + soyisim + '\'' +
              ", maas=" + maas +
              ", kimlikno='" + kimlikno + '\'' +
              ", yas=" + yas;

   }



   public String getIsim() {
      return isim;
   }

   public void setIsim(String isim) {
      this.isim = isim;
   }

   public String getSoyisim() {
      return soyisim;
   }

   public void setSoyisim(String soyisim) {
      this.soyisim = soyisim;
   }

   public double getMaas() {
      return maas;
   }

   public void setMaas(double maas) {
      this.maas = maas;
   }

   public String getKimlikno() {
      return kimlikno;
   }

   public void setKimlikno(String kimlikno) {
      this.kimlikno = kimlikno;
   }

   public int getYas() {
      return yas;
   }

   public void setYas(int yas) {
      this.yas = yas;
   }

   public Kisi(String isim, String soyisim, double maas, String kimlikno, int yas) {
      this.isim = isim;
      this.soyisim = soyisim;
      this.maas = maas;
      this.kimlikno = kimlikno;
      this.yas = Math.abs(yas);
   }
}
