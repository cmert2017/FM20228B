package Animals;

public class Shop {


    public static void main(String[] args) {


        Dogs dog1 = new Dogs("mydog",3, "blue", "yellow", 50, 60, "kafkas") ;
        Dogs dog2 = new Dogs("komsunumkopegi", 2, "yesil", "mavi", 30, 60, "kediyebenzeyen");

        System.out.println("dog1.name = " + dog1.name);

        dog1.changeName("mybluedog");

        dog2.changeName("komsunundegilartikbenimdog");

        System.out.println("dog1.name = " + dog1.name);




    }
}
