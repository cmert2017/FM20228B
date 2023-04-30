package FirstProject.Hafta25;

public class Shop {


    public static void main(String[] args) {
       // int x = 3; //primitive data types
       // String name= new String("Ahmet");  //non primitive data type

       Canta canta1 = new Canta("kirmizi", 30, 40, "polymer", "omuz");

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


        //odev: defter, kalem, ve silgi class larini olusturunuz.







    }

}
