package com.example.joanna.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by joanna on 11/06/16.
 */
public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONObject forecastobject = new JSONObject(weatherJsonStr);
        JSONArray list = forecastobject.getJSONArray("list");
        JSONObject day = list.getJSONObject(dayIndex);
        Double MaxTemperatureForDay = day.getJSONObject("temp").getDouble("max");
        return MaxTemperatureForDay;
    }
}
