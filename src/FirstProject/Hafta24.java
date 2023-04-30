package FirstProject;

import java.io.FileWriter;
import java.io.IOException;

public class Hafta24 {


    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("inventory.txt");
        writer.append("oyuncak sayisi.\n");
        writer.append('4');
        writer.close();



        //introduction() olusturup online shop iniz icin kullanicaksiniz.


    }
}
