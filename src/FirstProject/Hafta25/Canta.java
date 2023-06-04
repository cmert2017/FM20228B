package FirstProject.Hafta25;

public class Canta {
    //1-fields: global variable
    private String renk = "siyah";  //private demek sadece bu variable'a bu clas sicinde ulasilabilinir.
    private int genislik = 50;
    private int uzunlugu = 80;
    private String materyel = "deri";
    private String tip = "sirt";
   // private int cantaUcreti;



    public static int cantaSayisi;
    public static int cantaUcreti = 50;










    //2-methods
    //A-Constructor
    //constructor is a special method which constructs the object of the class
    public Canta(String renk, int genislik, int uzunlugu, String materyel, String tip)  {

        this.renk = renk;
        this.genislik=genislik;
        this.materyel=materyel;
        this.uzunlugu=uzunlugu;
        this.tip=tip;
        //this.cantaUcreti =

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


    //--------B-setters


    /**
     * This method sets the renk of the object
     * @param renk
     */
    public  void setRenk(String renk) {
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

    public void setTip(String tip) {
        this.tip = tip;
    }

    /*
    public void setCantaUcreti() {
        if(uzunlugu==40 && genislik ==80 && materyel=="deri" && tip=="sirt" ) {
            this.cantaUcreti=200;
        }else if(uzunlugu==40 && genislik ==80 && materyel=="deri" && tip=="omuz"){
            this.cantaUcreti=300;
        }
    }
     */



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

    public String getTip() {
        return tip;
    }






    //D-ToString
    @Override
    public String toString() {
        return "Canta{" +
                "renk='" + renk + '\'' +
                ", genislik=" + genislik +
                ", uzunlugu=" + uzunlugu +
                ", materyel='" + materyel + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }


}
