package com.example.oumaima.my_application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oumaima on 19/12/2018.
 */

public class DataManager {

    private static DataManager Instance;
    private List<String> nameList;
    private DataManager(){
        nameList = new ArrayList<>();
    }
    static public DataManager getInstance(){
        if(Instance == null){
            Instance = new DataManager();
        }
        return Instance;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void addName(String name) {
        nameList.add(name);
    }
}
