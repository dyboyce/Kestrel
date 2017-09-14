package net.dboyce.kestrel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView myImageView = (ImageView)findViewById(R.id.botright);
        myImageView.setImageResource(R.drawable.reda);

        ImageView topleftimgview = (ImageView)findViewById(R.id.topleft);
        topleftimgview.setImageResource(R.drawable.blue);


    }


}
