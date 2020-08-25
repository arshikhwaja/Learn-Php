package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Questions extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        intent = getIntent();
        WebView wv=findViewById(R.id.showPage);
        String str = intent.getStringExtra("item_id");
        int id = Integer.parseInt(str);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        if(id==0)
            wv.loadUrl("file:///android_asset/interview1.html");
        else if(id==1)
            wv.loadUrl("file:///android_asset/interview2.html");
        else if(id==2)
            wv.loadUrl("file:///android_asset/interview3.html");
        else if(id==3)
            wv.loadUrl("file:///android_asset/interview4.html");
        else if(id==4)
            wv.loadUrl("file:///android_asset/interview5.html");
        else if(id==5)
            wv.loadUrl("file:///android_asset/interview6.html");
        else if(id==6)
            wv.loadUrl("file:///android_asset/interview7.html");
        else if(id==7)
            wv.loadUrl("file:///android_asset/interview8.html");
        else if(id==8)
            wv.loadUrl("file:///android_asset/interview9.html");
        else if(id==9)
            wv.loadUrl("file:///android_asset/interview10.html");
        else if(id==10)
            wv.loadUrl("file:///android_asset/interview11.html");
        else if(id==11)
            wv.loadUrl("file:///android_asset/interview12.html");
        else if(id==12)
            wv.loadUrl("file:///android_asset/interview14.html");
        else if(id==13)
            wv.loadUrl("file:///android_asset/interview15.html");
        else if(id==14)
            wv.loadUrl("file:///android_asset/interview16.html");
        else if(id==15)
            wv.loadUrl("file:///android_asset/interview17.html");
        else if(id==16)
            wv.loadUrl("file:///android_asset/interview18.html");
        else if(id==17)
            wv.loadUrl("file:///android_asset/interview19.html");
        else if(id==18)
            wv.loadUrl("file:///android_asset/interview20.html");
        else if(id==19)
            wv.loadUrl("file:///android_asset/interview21.html");
        else if(id==20)
            wv.loadUrl("file:///android_asset/interview22.html");
        else if(id==21)
            wv.loadUrl("file:///android_asset/interview23.html");
        else if(id==22)
            wv.loadUrl("file:///android_asset/interview24.html");
        else if(id==23)
            wv.loadUrl("file:///android_asset/interview25.html");
        else if(id==24)
            wv.loadUrl("file:///android_asset/interview26.html");
        else if(id==25)
            wv.loadUrl("file:///android_asset/interview27.html");
        else if(id==26)
            wv.loadUrl("file:///android_asset/interview28.html");
        else if(id==27)
            wv.loadUrl("file:///android_asset/interview29.html");
        else if(id==28)
            wv.loadUrl("file:///android_asset/interview30.html");
        else if(id==29)
            wv.loadUrl("file:///android_asset/interview31.html");
    }
}
