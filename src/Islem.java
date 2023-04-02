import java.util.ArrayList;
import java.util.Scanner;

public class Islem {

    static ArrayList<Kisi>Hostes=new ArrayList<>();
    static ArrayList<Kisi>Pilot=new ArrayList<>();
    static ArrayList<Kisi>Temizlikci=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
   static  String kisisecim="";

    public static void menu(){
        System.out.println("istediginiz islemi seciniz:\nHostes icin->Hostes\nPilot icin->Pilot\nTemizlikci icin->Temizlikci \nSeciniz");

        String secim=sc.next();
        switch (secim){
            case "Hostes":
              kisisecim="Hostes";
              islemsecimi();
              break;
            case "Pilot":
                kisisecim="Pilot";
                islemsecimi();
                break;
            case "Temizlikci":
                kisisecim="Temizlikci";
                islemsecimi();
                break;
            default:
                System.out.println("secim yanlistir,yeniden deneyiniz");
                menu();




        }
    }
    public static void islemsecimi(){
        System.out.println("Istediginiz islemi seciniz: 1->Ekle,2->Listeleme,3->Ara,4->Silme");

        int islemsecimi=sc.nextInt();

        switch (islemsecimi){
            case 1:
                Ekle();
                break;
            case 2:
                Listeleme();
                break;
            case 3:
                Ara();
                break;
            case 4:
                Silme();
                break;
            default:
                System.out.println("yanlis secim yaptiniz ,yeniden deneyin");
                islemsecimi();
        }
    }

    public  static void Ara() {
        if (kisisecim.equalsIgnoreCase("Hostes")){
            System.out.println("Aradiginiz Tc numarasini giriniz");String tchos=sc.next();
            for (Kisi H:Hostes) {
                if (H.getKimlikno().equalsIgnoreCase(tchos)){
                    System.out.println(Hostes);
                    islemsecimi();
                }else System.out.println("aradiginiz kisi ekli degil");


            }
        }else if (kisisecim.equalsIgnoreCase("Pilot")){
            System.out.println("Pilotun Tc nosunu giriniz");String pilottc=sc.next();
            for (Kisi p:Pilot) {
                if (p.getKimlikno().equalsIgnoreCase(pilottc)){
                    System.out.println(Pilot);
                    islemsecimi();
                }else System.out.println("Girilen numarada kisi kaydi yoktur");


            }

        }else if  (kisisecim.equalsIgnoreCase("Temizlikci")){
            System.out.println("Temizlikci Tc nosunu giriniz");String temizliktc=sc.next();
            for (Kisi T:Temizlikci) {
                if (T.getKimlikno().equalsIgnoreCase(temizliktc)){
                    System.out.println(Temizlikci);
                    islemsecimi();
                }else System.out.println("Girilen numarada kisi kaydi yoktur");


            }
        }
    }

    public  static void Listeleme(){
        if (kisisecim.equalsIgnoreCase("Hostes")){
            System.out.println(Hostes);
            islemsecimi();
        }else if((kisisecim.equalsIgnoreCase("Pilot"))) {
            System.out.println(Pilot);
            islemsecimi();

        }else if (kisisecim.equalsIgnoreCase("Temizlikci")){
            System.out.println(Temizlikci);
            islemsecimi();
        }
    }


    public  static void Ekle() {
        if(kisisecim=="Hostes"){
            System.out.println("isim giriniz");String isimhos=sc.next();
            System.out.println("soyisim giriniz");String soyisimhos=sc.next();
            System.out.println("KimlikNo giriniz");String kimlikhos=sc.next();
            System.out.println("maas giriniz");Double maashos=sc.nextDouble();
            System.out.println("Yas giriniz");int yashos=sc.nextInt();
            Hostess hostlist=new Hostess(isimhos,soyisimhos,maashos,kimlikhos,yashos);
            Hostes.add(hostlist);
            islemsecimi();

        }else if (kisisecim=="Pilot"){
            System.out.println("isim giriniz");String isimpil=sc.next();
            System.out.println("soyisim giriniz");String soyispil=sc.next();
            System.out.println("KimlikNo giriniz");String kimlikpil=sc.next();
            System.out.println("maas giriniz");Double maaspil=sc.nextDouble();
            System.out.println("Yas giriniz");int yaspil=sc.nextInt();
            Pilot pilotlist =new Pilot(isimpil,soyispil,maaspil,kimlikpil,yaspil);
            Pilot.add(pilotlist);
            islemsecimi();

        }else if (kisisecim=="Temizlikci"){
            System.out.println("isim giriniz");String isimtem=sc.next();
            System.out.println("soyisim giriniz");String soyisimtem=sc.next();
            System.out.println("KimlikNo giriniz");String kimliktem=sc.next();
            System.out.println("maas giriniz");Double maastem=sc.nextDouble();
            System.out.println("Yas giriniz");int yastem=sc.nextInt();
            Temizlikci temizliklist =new Temizlikci(isimtem,soyisimtem,maastem,kimliktem,yastem);
            Hostes.add(temizliklist);
            islemsecimi();

        }

    }





    private static void Silme() {
        if (kisisecim.equalsIgnoreCase("Hostes")){
            System.out.println("Tc verin");String tci=sc.next();
            for (Kisi o:Hostes) {
                if(o.getKimlikno().equalsIgnoreCase(tci)){
                    Hostes.remove(o);
                    System.out.println("Kisi silinmistir");
                    menu();
                }else System.out.println("kisi yoktur yeniden secim yapiniz");
                Silme();

            }
        }else if ((kisisecim.equalsIgnoreCase("Pilot"))){
            System.out.println("Kimlik no giriniz");String kto=sc.next();
            for (Kisi k:Pilot) {
                if(k.getKimlikno().equalsIgnoreCase(kto)){
                    Pilot.remove(k);
                    System.out.println("basariyla silindi");
                    islemsecimi();
                }else System.out.println("kisi yok ");

            }
        }else if ((kisisecim.equalsIgnoreCase("Temizlikci"))){
            System.out.println("Kimlik no giriniz");String ktl=sc.next();
            for (Kisi j:Temizlikci) {
                if(j.getKimlikno().equalsIgnoreCase(ktl)){
                    Pilot.remove(j);
                    System.out.println("basariyla silindi");
                    islemsecimi();
                }else System.out.println("kisi yok ");

            }
        }
    }
    }





