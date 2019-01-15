package com.gharseldin.planttdd.dao;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Amr Gharseldin on 1/11/19.
 */
public class NetworkDAO {

    public String fetch(String uri) throws IOException {

        StringBuilder sb = new StringBuilder();

        // open the connection to this URL
        URL url = new URL(uri);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try{
            // we're reading in stuff
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));

            // the line we're reading
            String inputLine;

            // keep reading, until we run out of lines to read
            while ((inputLine = bin.readLine()) != null) {
                sb.append(inputLine);
            }
        } finally {
            urlConnection.disconnect();
        }
        return sb.toString();

    }
}
