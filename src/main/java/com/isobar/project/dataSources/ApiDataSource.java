package com.isobar.project.dataSources;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.isobar.project.interfaces.DataSource;

public class ApiDataSource implements DataSource {
    private final String apiEndpoint = "https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full\n"; //this would usually go in a config file but I'm not sure of the most efficient way of creating one in a Java project
    private String data;

    private void connect() {

        try {
            URL url = new URL(apiEndpoint);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                data = "";
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    data += scanner.nextLine();
                }

                scanner.close();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public String getData() {
            this.connect();

            if(data == null || data.isEmpty() || data.trim().isEmpty())
                return null;

            return data;
    }
}
