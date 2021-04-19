
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Api {

     HttpURLConnection con;

    public int getMethodStatus(String url) throws IOException {
             StringBuilder content;

        try {
            var myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");
            //System.out.println(con.getResponseCode());
            if(con.getResponseCode()==404){
                return con.getResponseCode();
            }else

            //System.out.println(con.getResponseCode());
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {

                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            System.out.println(content.toString());
       } finally {

            con.disconnect();
        }
        return con.getResponseCode();
    }
    public String getMethodText(String url) throws IOException {
        StringBuilder content;

        try {
            var myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

                //System.out.println(con.getResponseCode());
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {

                    String line;
                    content = new StringBuilder();

                    while ((line = in.readLine()) != null) {

                        content.append(line);
                        content.append(System.lineSeparator());
                    }
                }


        } finally {

            con.disconnect();
        }
        return content.toString();
    }


    public static void main(String[] args) throws IOException{
        Api api = new Api();
        api.getMethodStatus("https://covid-api.mmediagroup.fr/v1/cases?country=Poland");

    }


}
