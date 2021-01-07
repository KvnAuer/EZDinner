import java.net.HttpURLConnection;
import java.net.URL;

public class DinnerApp {

    public void main(String args[]) {


        try {
            
            BufferedReader reader = new BufferedReader(System.in);
            System.out.println("Please enter cuisine type [African, American, British,
                Cajun, Caribbean, Chinese, Eastern European, European, French, German,
                Greek, ]")


            URL url = new URL("myURLgoesHere");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            System.out.println(status);

        } catch (Exception e) {
            //TODO: handle exception
        }

       

        //



    }
}