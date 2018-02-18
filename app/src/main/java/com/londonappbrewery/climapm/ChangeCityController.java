package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    ImageButton mBackButton;
    EditText mQueryET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);

        mBackButton = (ImageButton) findViewById(R.id.backButton);
        mQueryET = (EditText) findViewById(R.id.queryET);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mQueryET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String cityName = mQueryET.getText().toString();
                Intent cityIntent = new Intent(ChangeCityController.this, WeatherController.class);
                cityIntent.putExtra("City", cityName);
                startActivity(cityIntent);
                return true;
            }
        });

    }
}
