package ru.sg_team.matchingdoc;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.gson.annotations.SerializedName;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import retrofit2.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class Auth extends AppCompatActivity {

    //public static String AccessToken = "";
    public static String EMAIL = "";
    public static String PASSWORD = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

    }

    public void authUser(View view) {

        SendLoginData sld = new SendLoginData();
        sld.doInBackground();

    }




    class SendLoginData extends AsyncTask<Void, Void, Void> {

        String resultString = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost http = new HttpPost("http://37.194.132.165:7878");
                List nameValuePairs = new ArrayList(2);
                nameValuePairs.add(new BasicNameValuePair("id", "1"));
                nameValuePairs.add(new BasicNameValuePair("value2", "2"));
                http.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                //получаем ответ от сервера
                String response = (String) httpclient.execute(http, new BasicResponseHandler());

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);


        }
    }


}
