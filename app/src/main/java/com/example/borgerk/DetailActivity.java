package com.example.borgerk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {

    TextView foodTitle;
    TextView foodDescription;
    //TextView foodPrice;
    ImageView foodImage;
    //CollapsingToolbarLayout collapsingToolbarLayout;
    FloatingActionButton btnCart;
    ElegantNumberButton numberButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        FloatingActionButton floatingActionButton = findViewById(R.id.btnCart);
        ElegantNumberButton numberButton =(ElegantNumberButton)findViewById(R.id.number_button);

        foodTitle = (TextView)findViewById(R.id.tvTitle);
        foodDescription = (TextView)findViewById(R.id.tvDescription);
        //foodPrice = (TextView)findViewById(R.id.tvPrice);
        foodImage = (ImageView)findViewById(R.id.ivImage2);


        //btnCart = (FloatingActionButton)findViewById(R.id.btnCart);

        //collapsingToolbarLayout =(CollapsingToolbarLayout) findViewById(R.id.collapsing);
        //collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppbar);
        //collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);


        Bundle mBundle = getIntent().getExtras();

        if(mBundle !=null){

            //collapsingToolbarLayout.setTitle(mBundle.getString("Title"));
            foodTitle.setText(mBundle.getString("Title"));
            foodDescription.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));



        }
    }

}
