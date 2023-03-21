package Parser;

/*
import java.io.File;

public class JsonParserExample2 {

    public static void main(String[] args) {

        File file = new File("example.json");
        JsonParser parser = new JsonFactory().createParser(file);

        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

            if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                String fieldName = parser.getCurrentName();
                jsonToken = parser.nextToken();

                if ("name".equals(fieldName)) {
                    String name = parser.getText();
                    System.out.println("Name: " + name);
                } else if ("age".equals(fieldName)) {
                    int age = parser.getIntValue();
                    System.out.println("Age: " + age);
                } else if ("email".equals(fieldName)) {
                    String email = parser.getText();
                    System.out.println("Email: " + email);
                }
            }
        }


    }
}


 */