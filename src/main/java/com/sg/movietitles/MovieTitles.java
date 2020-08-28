/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.movietitles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jeff
 */
public class MovieTitles {
    
    final static String BASE_URL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
    
    public static void main(String[] args) {
        String[] movies = getMovieTitles("spiderman");
        displayArray(movies);
        
        String[] moreMovies = getMovieTitles("batman");
        displayArray(moreMovies);
        
        String[] evenMoreMovies = getMovieTitles("romance");
        displayArray(evenMoreMovies);
    }
    
    /* Get all movie titles matching value substr as an alphabetized Array. */
    public static String[] getMovieTitles(String substr) {
        String urlString = BASE_URL + substr;
        JSONObject jsonResponse = getJsonResponse(urlString);
        int pagesCount = jsonResponse.getInt("total_pages");
        int totalTitles = jsonResponse.getInt("total");
        
        String[] titles = new String[totalTitles];
        
        int index = 0;
        for (int i = 1; i <= pagesCount; i++) {
            jsonResponse = getJsonResponse(BASE_URL + substr + "&page=" + i);
            JSONArray data = jsonResponse.getJSONArray("data");
            for (int j = 0; j < data.length(); j++) {
                String title = data.getJSONObject(j).getString("Title");
                titles[index] = title;
                index++;
            }
        }
        
        return alphabetizeArray(titles);
    }
    
    /* Establish connection at URL parameter and return the responded JSON. */
    public static JSONObject getJsonResponse(String urlString) {
        JSONObject json = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection dataSource = (HttpURLConnection) url.openConnection();
            String fromSource = dataSource.getResponseMessage();
            switch (fromSource) {
                case "OK":
                    BufferedReader reader = new BufferedReader(new InputStreamReader(dataSource.getInputStream()));
                    StringBuilder jsonText = new StringBuilder();
                    String currLine;
                    while((currLine = reader.readLine()) != null) {
                        jsonText.append(currLine + "\n");
                    }
                    reader.close();
                    json = new JSONObject(jsonText.toString());
            }
        } catch (MalformedURLException e) {
            System.out.println("Cannot create connection");
        } catch (ProtocolException e) {
            System.out.println("Cannot create connection");
        } catch (IOException e) {
            System.out.println("Cannot create connection");
        }
        
        return json;
    }
    
    /* Take a String array and return it alphabetized. */
    public static String[] alphabetizeArray(String[] arr) {
        boolean swapOccurred = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareToIgnoreCase(arr[i + 1]) > 0) {
                String placeholder = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = placeholder;
                swapOccurred = true;
            }
            if (!swapOccurred) {
                break;
            }
        }
        return arr;
    }
    
    /* Print each object in a String array. */
    public static void displayArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
