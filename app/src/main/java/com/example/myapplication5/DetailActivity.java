package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView vegDescription;
    ImageView vegImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        vegDescription = (TextView)findViewById(R.id.txtDescription);
        vegImage = (ImageView)findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){

            vegDescription.setText(mBundle.getString("Description"));
            vegImage.setImageResource(mBundle.getInt("Image"));
        }
    }
}