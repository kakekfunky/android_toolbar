package com.sarikode.learntoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi Toolbarnya
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        //pasang toolbarnya pada activity_main
        setSupportActionBar(toolbar);

        // set logo di sebelah kiri title dan subtitle
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        // set Tittle / namaaplikasi
        getSupportActionBar().setTitle("Judul");

        // set Subtitlenya
        getSupportActionBar().setSubtitle("Contoh Subtitle");

    }
}
