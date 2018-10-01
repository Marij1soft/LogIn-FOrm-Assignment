package com.example.shadowclient.assngmnt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
Button regyourself;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regyourself=(Button)findViewById(R.id.regbtn);

        regyourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Register.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });
    }
}
