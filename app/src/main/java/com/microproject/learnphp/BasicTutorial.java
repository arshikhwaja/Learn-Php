package com.microproject.learnphp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView;

public class BasicTutorial extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout MyDrawerLayout;
    private ActionBarDrawerToggle MyToggle;
    WebView webView;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_tutorial);
        MyDrawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        MyToggle=new ActionBarDrawerToggle(this,MyDrawerLayout,R.string.open,R.string.close);

        MyDrawerLayout.addDrawerListener(MyToggle);
        MyToggle.syncState();

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        navigationView = findViewById(R.id.nav_bar);
        navigationView.setNavigationItemSelectedListener(this);

        webView.loadUrl("file:///android_asset/introduction.html");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(MyToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id= menuItem.getItemId();
        switch (id) {
            case R.id.intro:
                webView.loadUrl("file:///android_asset/tutorial.html");
                break;
            case R.id.introphp:
                webView.loadUrl("file:///android_asset/introduction.html");
                break;
            case R.id.install:
                webView.loadUrl("file:///android_asset/install.html");
                break;
            case R.id.eg:
                webView.loadUrl("file:///android_asset/example.html");
                break;
            case R.id.echo:
                webView.loadUrl("file:///android_asset/echo.html");
                break;
            case R.id.print:
                webView.loadUrl("file:///android_asset/print.html");
                break;
            case R.id.var:
                webView.loadUrl("file:///android_asset/variable.html");
                break;
            case R.id.var2:
                webView.loadUrl("file:///android_asset/variable2.html");
                break;
            case R.id.constant:
                webView.loadUrl("file:///android_asset/constant.html");
                break;
            case R.id.magic_const:
                webView.loadUrl("file:///android_asset/magic_const.html");
                break;
            case R.id.comment:
                webView.loadUrl("file:///android_asset/comment.html");
                break;
            case R.id.pboolean:
                webView.loadUrl("file:///android_asset/boolean.html");
                break;
            case R.id.isbool:
                webView.loadUrl("file:///android_asset/isbool.html");
                break;
            case R.id.inint:
                webView.loadUrl("file:///android_asset/isint.html");
                break;
            case R.id.pfloat:
                webView.loadUrl("file:///android_asset/float.html");
                break;
            case R.id.isfloat:
                webView.loadUrl("file:///android_asset/isfloat.html");
                break;
            case R.id.ifelse:
                webView.loadUrl("file:///android_asset/ifelse.html");
                break;
            case R.id.pswitch:
                webView.loadUrl("file:///android_asset/switch.html");
                break;
            case R.id.forloop:
                webView.loadUrl("file:///android_asset/for_loop.html");
                break;
            case R.id.whileloop:
                webView.loadUrl("file:///android_asset/while.html");
                break;
            case R.id.dowhile:
                webView.loadUrl("file:///android_asset/dowhile.html");
                break;


        }
        MyDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

