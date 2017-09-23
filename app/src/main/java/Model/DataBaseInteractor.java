package Model;

import java.util.ArrayList;

/**
 * Created by Dylan on 9/22/2017.
 */

public class DataBaseInteractor {

    private ArrayList<String>  TempStorage;
    private ArrayList<String>  AjdsTemp;
    private int TmpStoSize;
    private int AjdsTempSize;

    public DataBaseInteractor(){
        TempStorage = new ArrayList<String>();
        AjdsTemp = new ArrayList<String>();
        TempStorage.add("boba");
        TempStorage.add("capl");
        TempStorage.add("down");
        TempStorage.add("drki");
        TempStorage.add("edbo");
        TempStorage.add("evil");
        TempStorage.add("feel");
        TempStorage.add("fidy");
        TempStorage.add("fngs");
        TempStorage.add("frnk");
        TempStorage.add("gast");
        TempStorage.add("helo");
        TempStorage.add("puns");
        TempStorage.add("spin");
        TempStorage.add("stvr");
        TempStorage.add("stvw");
        TempStorage.add("tcpl");
        TempStorage.add("wend");
        TempStorage.add("wrpc");

        AjdsTemp.add("blue");
        AjdsTemp.add("fancy");
        AjdsTemp.add("fast");
        AjdsTemp.add("sad");
        AjdsTemp.add("soft");
        AjdsTemp.add("broken");
        AjdsTemp.add("red");
        AjdsTemp.add("hard");
        AjdsTemp.add("mushy");
        AjdsTemp.add("big");

        AjdsTempSize = AjdsTemp.size();
        TmpStoSize = TempStorage.size();

    }

    public String[] getNextImages(){
        String[] retval = new String[4];
        
        retval[0] = AjdsTemp.get(3);


        return retval;
    }



}
