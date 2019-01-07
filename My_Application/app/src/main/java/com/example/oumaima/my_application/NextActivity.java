package com.example.oumaima.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity implements View.OnClickListener{

    Button next;
    EditText nom;
    EditText prenom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        nom=(EditText) findViewById(R.id.nom);

        prenom=(EditText) findViewById(R.id.prenom);
        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.next){
            Intent intent=new Intent(this,MainActivity.class);
            String n=nom.getText().toString()+prenom.getText().toString();
            if(!n.isEmpty()){
                DataManager.getInstance().addName(n);
            }
            startActivity(intent);
        }
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
