package Presenter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.ImageButton;

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
    private String correct;
    private DataBaseInteractor dbInteractor;

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
        //print clicked
        Log.d("DEBUG", "SetNewImagesCalled");
        setnewImages("frnk","tcpl");
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
