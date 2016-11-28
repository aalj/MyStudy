package com.wdsunday.szpublictransport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.socks.library.KLog;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Document doc = null;
                    try {
                        doc = Jsoup.connect("http://www.szjt.gov.cn/apts/APTSLine.aspx").get();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    KLog.e(doc.title());

                }
            }).start();




    }
}
