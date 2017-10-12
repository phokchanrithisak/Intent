package com.example.phokchanrithisak.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
    }
    public void getBack(View view){
        Intent ii = new Intent(this, MainActivity.class);
        startActivity(ii);
    }
}
