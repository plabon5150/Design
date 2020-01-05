package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jgabrielfreitas.core.BlurImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
public class MainActivity extends AppCompatActivity {
    BlurImageView imageView;
    RadioButton radioButtonthu,radioButtonfri,radioButtonsat,radioButtonsun,radioButtonmon,radioButtontue,radioButtontoday;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radios);
        radioButtontoday = findViewById(R.id.todayRadioBtn);
        radioButtonfri = findViewById(R.id.friRadioBtn);
        radioButtonsat = findViewById(R.id.satRadioBtn);
        radioButtonsun = findViewById(R.id.sunRadioBtn);
        radioButtonmon = findViewById(R.id.monRadioBtn);
        radioButtonthu = findViewById(R.id.thuRadioBtn);
        radioButtontue = findViewById(R.id.tueRadioBtn);



        RadioButton radioButton = new RadioButton(this);



        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });












    }
}
