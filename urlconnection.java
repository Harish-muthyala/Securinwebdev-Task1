import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


   
public class urlconnection {

    public static void main(String[] args) {
        try {
            // Create a URL object with the target URL
            URL url = new URL("https://www.shodan.io/host/2.56.9.89");

            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // Open a connection to the URL

           
            connection.setRequestMethod("GET");   // Set the request method to GET

          
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);   // Get the response code

           
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));   // Read the response from the input stream
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Print the response
            System.out.println("Response: " + response.toString());

            // Disconnect the connection
            connection.disconnect();
        } catch (IOException e) {}
    }
}
    

