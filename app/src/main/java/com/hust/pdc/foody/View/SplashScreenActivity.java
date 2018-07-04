package com.hust.pdc.foody.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hust.pdc.foody.BuildConfig;
import com.hust.pdc.foody.R;

public class SplashScreenActivity extends AppCompatActivity {

    TextView txtPhienban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splashscreen);

        txtPhienban = findViewById(R.id.txtPhienban);
        txtPhienban.setText(String.format("%s %s", getString(R.string.phienban), BuildConfig.VERSION_NAME));
    }
}