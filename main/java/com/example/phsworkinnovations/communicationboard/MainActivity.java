package com.example.phsworkinnovations.communicationboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button yes = (Button) findViewById(R.id.button_id);
        yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Hello");
            }
        });
    }
}
