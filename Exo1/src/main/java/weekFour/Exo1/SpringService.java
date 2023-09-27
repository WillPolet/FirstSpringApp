package weekFour.Exo1;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SpringService {
    public static String Hello() {
        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            // Specify the path to your application.properties file
            inputStream = new FileInputStream("C:\\Users\\willi\\Desktop\\JavaBeCode\\FirstSpring\\demo\\src\\main\\resources\\application.properties");
            properties.load(inputStream);

            // Access the properties
            String configuredLanguage = properties.getProperty("configured_language");
            String helloMessageEN = properties.getProperty("hello.message.EN");
            String helloMessageNL = properties.getProperty("hello.message.NL");
            String helloMessageFR = properties.getProperty("hello.message.FR");
            String helloMessageGER = properties.getProperty("hello.message.GER");


            switch (configuredLanguage){
                case "EN" -> {return helloMessageEN;}
                case "NL" -> {return helloMessageNL;}
                case "FR" -> {return helloMessageFR;}
                case "GER" -> {return helloMessageGER;}

            }
            // Print the properties
//            System.out.println("Configured Language: " + configuredLanguage);
//            System.out.println("Hello Message (EN): " + helloMessageEN);
//            System.out.println("Hello Message (NL): " + helloMessageNL);
//            System.out.println("Hello Message (FR): " + helloMessageFR);
//            System.out.println("Hello Message (GER): " + helloMessageGER);

//            return "Nothing here for now";
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}


