package com.wdsunday.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.socks.library.KLog;
import com.wdsunday.szpublictransport.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private final OkHttpClient client = new OkHttpClient();
    private void init() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    myRun();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }).start();
    }



        public void myRun() throws Exception {
        RequestBody formBody = new FormBody.Builder()
                .add("__EVENTVALIDATION", "/wEWAwL5m9CTDgL88Oh8AqX89aoKFjHWxIvicIW2NoJRKPFu7zDvdWiw74UWlUePz1dAXk4=")
                .add("__VIEWSTATE", "/wEPDwUJNDk3MjU2MjgyD2QWAmYPZBYCAgMPZBYCAgEPZBYCAgYPDxYCHgdWaXNpYmxlaGRkZArYd9NZeb6lYhNOScqHVvOmnKWk\n" +
                        "IejcJ7J2157Nz6l1")
                .add("__VIEWSTATEGENERATOR", "964EC381")
                .add("ctl00$MainContent$LineName", "228")
                .add("ctl00$MainContent$SearchLine", "搜索")
                .build();

            /*














             */

            Request request = new Request.Builder()
                    .url("http://www.szjt.gov.cn/apts/APTSLine.aspx")
                    .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .addHeader("Accept-Encoding","gzip, deflate")
                    .addHeader("Accept-Language","en-US,en;q=0.5")
                    .addHeader("Connection","keep-alive")
                    .addHeader("Host","www.szjt.gov.cn")
                    .addHeader("Referer","http://www.szjt.gov.cn/apts/APTSLine.aspx")
                    .addHeader("Upgrade-Insecure-Requests","1")
                    .addHeader("User-Agent","Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:50.0) Gecko/20100101 Firefox/50.0")
                    .addHeader("Content-Type","application/x-www-form-urlencoded")
                    .post(formBody)
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            KLog.e(response.body().string());
        }






}
