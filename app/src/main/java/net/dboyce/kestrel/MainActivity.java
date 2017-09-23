package net.dboyce.kestrel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import Model.DataBaseInteractor;
import Presenter.PresenterClass;


public class MainActivity extends AppCompatActivity {

    private PresenterClass Presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView myImageView = (ImageView)findViewById(R.id.botright);
        myImageView.setImageResource(R.drawable.reda);

        ImageView topleftimgview = (ImageButton)findViewById(R.id.topleft);
        topleftimgview.setImageResource(R.drawable.blue);

        DataBaseInteractor dbinteractor = new DataBaseInteractor();
        //Possibly move into presenter?
        Presenter = new PresenterClass(this, this, dbinteractor);

    }

    public void buttoninput(View v){


        Presenter.updatePresenter("tested");

    }


}
