package Presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import net.dboyce.kestrel.R;

import java.util.ArrayList;

import Model.DataBaseInteractor;

/**
 * Created by Dylan on 9/6/2017.
 */

public class PresenterClass {

    private ArrayList<String> RecentlyUsedPairs;
    private ArrayList<String> PairsOnHand;
    private Context context;
    private Activity activity;
    private DataBaseInteractor dbInteractor;
    private String nextImages;
    private String correct;

    public PresenterClass(Context cont, Activity acti, DataBaseInteractor dbi){
        this.context = cont;
        this.activity = acti;
        RecentlyUsedPairs = new ArrayList<String>();
        PairsOnHand = new ArrayList<String>();
        dbInteractor = dbi;
        Log.d("DEBUG", "Presenter Contstructed");

        //// TODO: 9/22/2017 load up pairs on hand
    }

    public void updatePresenter(String clicked){
        //if correct, display good/bad sign for .5 seconds
        //turn off display
        //parse next string
        //display next images
        //fetch more from db if needed

        if(clicked.equals(correct)){
            final Toast toast = Toast.makeText(context, "Woo you got it right!!", Toast.LENGTH_SHORT);
            toast.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            }, 1000);
        }



        Log.d("DEBUG", "SetNewImagesCalled by: "+clicked);
        TextView txtview = (TextView) activity.findViewById(R.id.Text1);

        String[] neo = dbInteractor.getNextImages();


        setnewImages(neo[1], neo[2]);
        txtview.setText("Which picture is "+neo[0]+" ?");
        if(neo[3].equals("0")){
            correct = "top";

        }else{
            correct = "bot";
        }
    }


    private void setnewImages(String topStr, String botStr){

        int id = context.getResources().getIdentifier(topStr, "drawable", context.getPackageName());
        ImageButton imgview = (ImageButton)activity.findViewById(R.id.topleft);
        imgview.setImageResource(id);
        Log.d("DEBUG", "Top Id: "+id);
        id = context.getResources().getIdentifier(botStr, "drawable", context.getPackageName());
        imgview = (ImageButton) activity.findViewById(R.id.botright);
        imgview.setImageResource(id);
        Log.d("DEBUG", "Bot Id: "+id);

        RecentlyUsedPairs.add(topStr+botStr);
    }


}
