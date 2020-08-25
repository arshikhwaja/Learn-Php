package com.microproject.learnphp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Programs extends AppCompatActivity {
    Intent intent;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        wv = (WebView) findViewById(R.id.web) ;
        intent = getIntent();
        String str = intent.getStringExtra("id");
        int id = Integer.parseInt(str);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        if(id==0)
            wv.loadUrl("file:///android_asset/HelloWorld.html");
        else if(id==1)
            wv.loadUrl("file:///android_asset/BasicOperations.html");
        else if(id==2)
            wv.loadUrl("file:///android_asset/EvenOdd.html");
        else if(id==3)
            wv.loadUrl("file:///android_asset/LeapYear.html");
        else if(id==4)
            wv.loadUrl("file:///android_asset/PrimeNumber.html");
        else if(id==5)
            wv.loadUrl("file:///android_asset/Table.html");
        else if(id==6)
            wv.loadUrl("file:///android_asset/ReverseNumber.html");
        else if(id==7)
            wv.loadUrl("file:///android_asset/ReverseString.html");
        else if(id==8)
            wv.loadUrl("file:///android_asset/ArmstrongNumber.html");
        else if(id==9)
            wv.loadUrl("file:///android_asset/Factorial.html");
        else if(id==10)
            wv.loadUrl("file:///android_asset/PalindromeNumber.html");
        else if(id==11)
            wv.loadUrl("file:///android_asset/PalindromeString.html");
        else if(id==12)
            wv.loadUrl("file:///android_asset/LargestNumber.html");
        else if(id==13)
            wv.loadUrl("file:///android_asset/FibonacciSeries.html");
        else if(id==14)
            wv.loadUrl("file:///android_asset/PrimeSeries.html");
        else if(id==15)
            wv.loadUrl("file:///android_asset/SwappingTwoNumber.html");
        else if(id==16)
            wv.loadUrl("file:///android_asset/Left1Pyramid.html");
        else if(id==17)
            wv.loadUrl("file:///android_asset/Left2Pyramid.html");
        else if(id==18)
            wv.loadUrl("file:///android_asset/MiddlePyramid.html");
        else if(id==19)
            wv.loadUrl("file:///android_asset/DiamondPyramid.html");

    }
}
