package com.example.lab1;

import static android.app.ProgressDialog.show;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

TextView txt;
EditText et1;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.textview1);
        et1 = (EditText) findViewById(R.id.edt1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userinfo = et1.getText().toString();
                Toast.makeText(getApplicationContext(),
                         "hello "+ userinfo,Toast.LENGTH_LONG).show();
            }
        });



    }
}
