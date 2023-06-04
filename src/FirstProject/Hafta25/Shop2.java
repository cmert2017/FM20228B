package FirstProject.Hafta25;

public class Shop2 {


    public static void main(String[] args) {
       // int x = 3; //primitive data types
       // String name= new String("Ahmet");  //non primitive data type

       Canta canta1 = new Canta("kirmizi", 30, 40, "polymer", "omuz");
       canta1.setRenk("kirmizi");


        /*
        System.out.println(canta1.renk);
        System.out.println(canta1.materyel);
        System.out.println(canta1.genislik);
        System.out.println(canta1.tip);
        System.out.println(canta1.uzunlugu);
         */

        System.out.println(canta1.toString());

        System.out.println("-----------------------------");

        //System.out.println("oncesi= "+canta1.renk);
        System.out.println("oncesi= "+canta1.getRenk());

        canta1.setRenk("Mavi");
        System.out.println("renk degisikligi talebiniz alindi");
        System.out.println("Cantanizin rengi degistiriliyor........");
        //System.out.println("sonrasi= "+ canta1.renk);
        System.out.println("sonrasi= "+ canta1.getRenk());


        //odev: defter, kalem, canta, ve silgi ve shop class larini olusturunuz.


        System.out.println("-----------------------------");

        String name = new String("john");

        Silgi benimSilgim = new Silgi("mavi",5, 10, "POLY", "Kare");

       // Canta benimCamtam = new Canta("kirmizi", 40, 50, "Deri", "el cantasi");


        System.out.println("benimSilgim.toString() = " + benimSilgim.toString());

       // System.out.println(benimSilgim.toString());


        System.out.println("benimSilgim.getRenk() = " + benimSilgim.getRenk());
        benimSilgim.setRenk("kirmizi");
        System.out.println("su anda silginizin rengi degistiriliyor.....");
        System.out.println("Renk degistirdikten sonraki benimSilgim.getRenk() = " + benimSilgim.getRenk());

        //multi tasking?

        System.out.println("-----------------------------");
        System.out.println("Oncesindeki benimSilgim.getFiyat() = " + benimSilgim.getFiyat());
        benimSilgim.setFiyat("10");
        System.out.println("su anda silginin fiyati arttiriliyor");
        System.out.println("Sonrasi benimSilgim.getFiyat() = " + benimSilgim.getFiyat());


        System.out.println("-----------------------------");
        //encapsulation: saklama

        //System.out.println("benimSilgim.silgiSayisi = " + benimSilgim.silgiSayisi);
        //benimSilgim.silgiSayisi = 50;

       System.out.println("Oncesi benimSilgim.getSilgiSayisi() = " + benimSilgim.getSilgiSayisi());
       benimSilgim.setSilgiSayisi(50);
       System.out.println("Sonrasi benimSilgim.getSilgiSayisi() = " + benimSilgim.getSilgiSayisi());


    }

}
