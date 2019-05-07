package com.example.abhilash.bonappetitserver;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {
    public static String parseNews(String JSONString){
        StringBuilder returnValue = null;
        try{
            JSONObject jsonObject=new JSONObject(JSONString);
            JSONArray jsonArray=jsonObject.getJSONArray("Order");
            for (int i=0;i<jsonArray.length();i++){
                JSONObject article=jsonArray.getJSONObject(i);
                returnValue=returnValue.append(article.getString("Order"));
            }
        }
        catch (JSONException ex){
            ex.printStackTrace();

        }
        return String.valueOf(returnValue);
    }
}
