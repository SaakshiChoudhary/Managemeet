package com.example.dell.managemeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    String scbi;
    String scbii;
    String scbiii;
    String scbiv;

    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv7 = findViewById(R.id.textView8);
        tv8 = findViewById(R.id.textView9);
        tv9 = findViewById(R.id.textView16);
        tv10 = findViewById(R.id.textView17);

        scbi = getIntent().getExtras().getString("Value7");
        tv7.setText(scbi);

        scbii = getIntent().getExtras().getString("Value8");
        tv8.setText(scbii);

        scbiii = getIntent().getExtras().getString("Value9");
        tv9.setText(scbiii);

        scbiv = getIntent().getExtras().getString("Value10");
        tv10.setText(scbiv);

        button2 = (Button) findViewById(R.id.clbbton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity();


            }
        });

    }public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}