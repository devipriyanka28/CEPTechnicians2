package com.devipriyanka28gmail.ceptechnicians;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button b1,b2;
    EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1= (Button)findViewById(R.id.b1);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        b2 = (Button)findViewById(R.id.b2);
        b1.setOnClickListener((View.OnClickListener) this);
        b2.setOnClickListener((View.OnClickListener) this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("admin") &&
                        et2.getText().toString().equals("admin")) {
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(), "Username and password are not matching",Toast.LENGTH_SHORT).show();
                    finish();

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
