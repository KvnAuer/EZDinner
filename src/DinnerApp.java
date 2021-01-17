import java.net.HttpURLConnection;

//Testing pushing this to git with eclipse GUI

import java.net.URL;
import java.util.Scanner;

import java.io.*;

public class DinnerApp {

    public static void main(String args[]) {


        try {
            
            Scanner reader = new Scanner(System.in);

            //User inputs to build the api url. 
            
            System.out.println("Please enter cuisine type [African, American, British,"
                + "Cajun, Caribbean, Chinese, Eastern European, European, French, German,"
                + "Greek, Indian, Irish, Italian, Japanese, Jewish, Korean, Latin American,"
                + "Mediterranean, Mexican, Middle Eastern, Nordic, Southern, Spanish, Thai, Vietnamese]");
            String cuisine = reader.nextLine();
            System.out.println("main course, side dish, dessert, appetizer, breakfast, soup, beverage, sauce, marinade, finger food, snack, drink");
            String type = reader.nextLine();
            reader.close();
            String myUrl = "https://api.spoonacular.com/recipes/random?"
            + "cuisine=" + cuisine
            + "&type=" + type
            + "&number=1&apiKey=" + Config.spoonacularAPIKey;
            URL url = new URL(myUrl.replaceAll(" ", ""));

            //Connecting to api.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();
            
            //
            int status = connection.getResponseCode();
            if(status != 200) {
                throw new RuntimeException(connection.getResponseMessage());
            } else {
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                System.out.print(inline);
                scanner.close();

                //parse the string into a JSON object
                
            }

            String contentType = connection.getContentType();

        } catch (Exception e) {
            //TODO: handle exception
        }

       

        //



    }
}