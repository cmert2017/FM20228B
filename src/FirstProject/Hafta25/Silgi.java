package FirstProject.Hafta25;

public class Silgi {
    //1-fields
    //neden private? cevap: encapsulation.
    private String renk = "siyah";  //private demek sadece bu variable'a bu clas sicinde ulasilabilinir.
    private int genislik = 50;
    private int uzunlugu = 80;
    private String materyel = "kaucuk";
    private String sekli = "dikdortgen";
    private String fiyati = "5";
    private int silgiSayisi = 40;


    //2-methods
    //A-Constructor
    //constructor is a special method which constructs the object of the class
    public Silgi(String renk, int genislik, int uzunlugu, String materyel, String sekli){

        this.renk = renk;
        this.genislik=genislik;
        this.materyel=materyel;
        this.uzunlugu=uzunlugu;
        this.sekli=sekli;
    }

    /*
    //default toString methodunu override yapiyor.
    public String toString(){
        return  "renk"+ renk + "\n"+
                "genislik= "+ genislik + "\n"+
                "materyel= "+materyel + "\n"+
                "uzunluk= "+ uzunlugu + "\n"+
                "tip= "+ tip;
    }

     */


    //B-setters
    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    public void setUzunlugu(int uzunlugu) {
        this.uzunlugu = uzunlugu;
    }

    public void setMateryel(String materyel) {
        this.materyel = materyel;
    }

    public void setSekli(String sekli) {
        this.sekli = sekli;
    }

    public void setFiyat(String fiyat) {
        this.fiyati = fiyat;
    }

    public void setSilgiSayisi(int silgiSayisi) {
        this.silgiSayisi = silgiSayisi;
    }



        //C-getters
    public String getRenk() {
        return renk;
    }

    public int getGenislik() {
        return genislik;
    }

    public int getUzunlugu() {
        return uzunlugu;
    }

    public String getMateryel() {
        return materyel;
    }

    public String getSekli() {
        return sekli;
    }


    public String getFiyat() {
        return fiyati;
    }


    public int getSilgiSayisi() {
        return silgiSayisi;
    }



    //D-ToString
    @Override
    public String toString() {
        return "Canta{" +
                "renk='" + renk + '\'' +
                ", genislik=" + genislik +
                ", uzunlugu=" + uzunlugu +
                ", materyel='" + materyel + '\'' +
                ", sekli='" + sekli + '\'' +
                '}';
    }


}
