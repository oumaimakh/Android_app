package com.example.oumaima.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView nom;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        nom= (TextView) findViewById(R.id.nom);
        Intent intent = getIntent();
        result= intent.getStringExtra("nom");
        nom.setText(result);

    }

    /*
    * @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if(requestCode ==1){
                if(resultCode == RESULT_OK && data.getExtras()!= null){
                    String name= intent.getStringExtra(nom);
                    Log.d("","");
                }else{
                    //handle errors
                }
            }
    }
    * */
}
