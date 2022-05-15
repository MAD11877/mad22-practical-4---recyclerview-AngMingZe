package com.example.s10203953;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<MainActivity.User> users = new ArrayList<>();

        int random;
        for (int i = 0;i < 20;i++){
            String name = "Name";
            String des = "Description ";
            boolean fol = false;
            int id = 0;
            random = 0;
            //name
            random = new Random().nextInt(99999);
            name = name + random;
            //description
            random = new Random().nextInt(99999);
            des = des + random;
            //id
            random = new Random().nextInt(99999);
            id = random;
            //follow status
            random = new Random().nextInt(2);
            if (random == 0){
                fol = true;
            }
            else{
                fol = false;
            }
            MainActivity.User temp = new MainActivity.User(name,des,id,fol);
            users.add(temp);
        }

        RecyclerView rv = findViewById(R.id.rv);
        vAdapt adapt = new vAdapt(users);
        LinearLayoutManager layout = new LinearLayoutManager(this);

        rv.setLayoutManager(layout);
        rv.setAdapter(adapt);
    }

    public void alertDia(View v){
        //Alert
        AlertDialog.Builder alertn = new AlertDialog.Builder(this);
        alertn.setTitle("Profile")
        .setMessage("MADness")
        .setPositiveButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ListActivity.this, "You closed the thingy", Toast.LENGTH_SHORT).show();
            }
        })
        .setNegativeButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent goNext = new Intent(ListActivity.this,MainActivity.class);
                //MainActivity.User wenty = new MainActivity.User();
                //goNext.putExtra("rInte",wenty);
                startActivity(goNext);
            }
        }).show();
    }
}