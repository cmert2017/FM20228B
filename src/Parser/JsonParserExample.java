package Parser;
/*
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.File;
import java.io.IOException;


public class JsonParserExample {

    public static void main(String[] args) {

        // Create a new JSON factory and parser
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(new File("data.json"));

        // Loop through the tokens in the JSON data
        while (!parser.isClosed()) {
            JsonToken token = parser.nextToken();

            // If we've reached the end of the file, exit the loop
            if (token == null) {
                break;
            }

            // If we've found the start of an object, parse it
            if (JsonToken.START_OBJECT.equals(token)) {
                while (!JsonToken.END_OBJECT.equals(parser.nextToken())) {
                    String fieldName = parser.getCurrentName();
                    JsonToken token2 = parser.nextToken();
                    System.out.println(fieldName + " : " + parser.getValueAsString());
                }
            }
        }

        // Close the parser when we're done
        parser.close();
    }

}
}


 */