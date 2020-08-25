package com.microproject.learnphp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;


public class advance_tutorial extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advance_tutorial);
        NavigationView navigationView;
        WebView w1;
        mdrawerlayout=(DrawerLayout)findViewById(R.id.drawlayout);
        mToggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);
        mdrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();

        w1 = findViewById(R.id.wbv);
        w1.setWebViewClient(new WebViewClient());
        navigationView = findViewById(R.id.navbar);
        navigationView.setNavigationItemSelectedListener(this);
        w1.loadUrl("file:///android_asset/php_Function.html");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        WebView w1=(WebView)findViewById(R.id.wbv);
        int id= menuItem.getItemId();
        switch (id) {
            case R.id.func:
                w1.loadUrl("file:///android_asset/php_Function.html");
                break;
            case R.id.para:
                w1.loadUrl("file:///android_asset/php_ParameterizedFunction.html");
                break;
            case R.id.cbv:
                w1.loadUrl("file:///android_asset/php_CallByValue.html");
                break;
            case R.id.cbr:
                w1.loadUrl("file:///android_asset/php_CallByRefernce.html");
                break;
            case R.id.davf:
                w1.loadUrl("file:///android_asset/php_DefaultArgumentValueFunction.html");
                break;
            case R.id.recursivef:
                w1.loadUrl("file:///android_asset/php_Recursive.html");
                break;
            case R.id.arr:
                w1.loadUrl("file:///android_asset/php_arrays.html");
                break;
            case R.id.indexarr:
                w1.loadUrl("file:///android_asset/php_indexedarrays.html");
                break;
            case R.id.assvarr:
                w1.loadUrl("file:///android_asset/php_associativearray.html");
                break;
            case R.id.mularr:
                w1.loadUrl("file:///android_asset/php_multiarray.html");
                break;
            case R.id.arrfunctions:
                w1.loadUrl("file:///android_asset/php_arrayfunctions.html");
                break;
        }
        mdrawerlayout.closeDrawer(GravityCompat.START);
            return true;
    }
}
