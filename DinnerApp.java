import java.net.HttpURLConnection;
import java.net.URL;



import java.io.*;

public class DinnerApp {

    public static void main(String args[]) {


        try {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter cuisine type [African, American, British,"
                + "Cajun, Caribbean, Chinese, Eastern European, European, French, German,"
                + "Greek, Indian, Irish, Italian, Japanese, Jewish, Korean, Latin American,"
                + "Mediterranean, Mexican, Middle Eastern, Nordic, Southern, Spanish, Thai, Vietnamese]");

            String cuisine = reader.readLine();

            System.out.println("main course, side dish, dessert, appetizer, breakfast, soup, beverage, sauce, marinade, finger food, snack, drink");

            String type = reader.readLine();

            String myUrl = "https://api.spoonacular.com/recipes/random?"
            + "cuisine=" + cuisine
            + "&type=" + type
            + "&number=1&apiKey=" + Config.spoonacularAPIKey;

            System.out.println(myUrl.replaceAll(" ", ""));

            URL url = new URL(myUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            String contentType = connection.getContentType();

            System.out.println(contentType);

            //connection.getContent();

            System.out.println(status);

        } catch (Exception e) {
            //TODO: handle exception
        }

       

        //



    }
}