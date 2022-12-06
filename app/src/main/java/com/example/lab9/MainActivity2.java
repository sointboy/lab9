package com.example.lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void buttonClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Неправильно!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClicked3(View view) {
        Intent intent;
        intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }public void buttonClicked4(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Неправильно", Toast.LENGTH_LONG);
        myToast.show();
    }

}