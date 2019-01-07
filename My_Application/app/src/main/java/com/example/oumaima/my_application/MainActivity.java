package com.example.oumaima.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NameItemListener{

    TextView nom;
    ListNameAdapter listNameAdapter;
    Button buttonedition;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listNameAdapter = new ListNameAdapter(this);
        buttonedition=(Button)findViewById(R.id.next);
        recyclerView = findViewById(R.id.recyclerview);
        buttonedition.setOnClickListener(this);

        initViews();
        initList();
    }

    private void initViews() {
        buttonedition = findViewById(R.id.next);

    }
    private void initList() {
        final LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);

        recyclerView.setAdapter(listNameAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List nameList = DataManager.getInstance().getNameList();
        listNameAdapter.updateData(nameList);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,NextActivity.class);
        startActivity(intent);
    }

    @Override
    public void clickOnItem(String name) {
        Toast.makeText(this, "vous avez cliquer"+name, Toast.LENGTH_LONG).show();
    }

    //objet regles metiers du projet: si la liste est instancié : transformer les donnees avant les afficher
    //datamanager--->couche-->..
}
