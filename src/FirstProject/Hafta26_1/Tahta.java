package FirstProject.Hafta26_1;

public class Tahta {

    public static void main(String[] args) {

        Rectangle benimRectangle = new Rectangle();

        System.out.println("benimRectangle.aciSayisi = " + benimRectangle.aciSayisi);
        System.out.println("benimRectangle.kenarSayisi = " + benimRectangle.kenarSayisi);
        System.out.println("benimRectangle.measureOfInterirorAngle = " + benimRectangle.measureOfInterirorAngle);


        benimRectangle.kenarSayisi = 4;

        System.out.println("benimRectangle.kenarSayisi = " + benimRectangle.kenarSayisi);


        EquilateralTriangle benimTriangle = new EquilateralTriangle();


        System.out.println("---------------------");

        System.out.println("benimTriangle.aciSayisi = " + benimTriangle.aciSayisi);
        System.out.println("benimRectangle.kenarSayisi = " + benimRectangle.kenarSayisi);
        benimRectangle.kenarSayisi=3;
        System.out.println("benimRectangle.measureOfInterirorAngle = " + benimRectangle.measureOfInterirorAngle);







    }
}
