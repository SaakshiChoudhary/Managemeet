package com.example.dell.managemeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    String sgpi;
    String sgpii;
    String sgpiii;
    String sgpiv;
    String sgpv;
    String sgpvi;
      private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1=findViewById(R.id.textView10);
        tv2=findViewById(R.id.textView13);
        tv3=findViewById(R.id.textView14);
        tv4=findViewById(R.id.textView15);
        tv5=findViewById(R.id.textView12);
        tv5=findViewById(R.id.textView11);


        sgpi=getIntent().getExtras().getString("Value1");
        tv1.setText(sgpi);

        sgpii=getIntent().getExtras().getString("Value2");
        tv2.setText(sgpii);

        sgpiii=getIntent().getExtras().getString("Value3");
        tv3.setText(sgpiii);

        sgpiv=getIntent().getExtras().getString("Value4");
        tv4.setText(sgpiv);

        sgpv=getIntent().getExtras().getString("Value5");
        tv5.setText(sgpv);

        sgpvi=getIntent().getExtras().getString("Value6");
        tv6.setText(sgpvi);

        button=(Button) findViewById(R.id.grpbton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMain2Activity();
            }

        });

    }
    public void openMain2Activity(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
