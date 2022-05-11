package com.example.s10203953;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
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
                final int random = new Random().nextInt(1000+1) ;
                goNext.putExtra("rInte",random);
                startActivity(goNext);
            }
        }).show();
    }
}