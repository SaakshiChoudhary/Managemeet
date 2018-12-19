package com.example.dell.managemeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
       Button btn;
       EditText gpi;
       EditText gpii;
       EditText gpiii;
       EditText gpiv;
       EditText gpv;
       EditText gpvi;
       EditText cbi;
       EditText cbii;
       EditText cbiii;
       EditText cbiv;

    String sgpi;
    String sgpii;
    String sgpiii;
    String sgpiv;
    String sgpv;
    String sgpvi;
    String scbi;
    String scbii;
    String scbiii;
    String scbiv;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.button);
        gpi=findViewById(R.id.grp1);
        gpii=findViewById(R.id.grp2);
        gpiii=findViewById(R.id.grp3);
        gpiv=findViewById(R.id.grp4);
        gpv=findViewById(R.id.grp5);
        gpvi=findViewById(R.id.grp6);
        gpvii=findViewById(R.id.grp7);
        gpviii=findViewById(R.id.grp8);
        gpix=findViewById(R.id.grp9);
        gpx=findViewById(R.id.grp10);
        cbi=findViewById(R.id.clb1);
        cbii=findViewById(R.id.clb2);
        cbiii=findViewById(R.id.clb3);
        cbiv=findViewById(R.id.clb4);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(view v){
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                sgpi=gpi.getText().toString();
                i.putExtra("Value1",sgpi);
                startActivity(i);

                Intent j=new Intent(Main2Activity.this,Main3Activity.class);
                sgpii=gpii.getText().toString();
                j.putExtra("Value2",sgpii);
                startActivity(j);

                Intent k=new Intent(Main2Activity.this,Main3Activity.class);
                sgpiii=gpiii.getText().toString();
                k.putExtra("Value3",sgpiii);
                startActivity(k);

                Intent l=new Intent(Main2Activity.this,Main3Activity.class);
                sgpiv=gpiv.getText().toString();
                l.putExtra("Value4",sgpiv);
                startActivity(l);

                Intent m=new Intent(Main2Activity.this,Main3Activity.class);
                sgpv=gpv.getText().toString();
                m.putExtra("Value5",sgpv);
                startActivity(m);

                Intent n=new Intent(Main2Activity.this,Main3Activity.class);
                sgpvi=gpvi.getText().toString();
                n.putExtra("Value6",sgpvi);
                startActivity(n);


                Intent a=new Intent(Main2Activity.this,Main4Activity.class);
                scbi=cbi.getText().toString();
                a.putExtra("Value7",cbi);
                startActivity(a);

                Intent b=new Intent(Main2Activity.this,Main4Activity.class);
                scbii=cbii.getText().toString();
                b.putExtra("Value8",scbi);
                startActivity(b);

                Intent c=new Intent(Main2Activity.this,Main4Activity.class);
                scbiii=cbiii.getText().toString();
                c.putExtra("Value9",scbiii);
                startActivity(c);

                Intent d=new Intent(Main2Activity.this,Main4Activity.class);
                scbiv=cbiv.getText().toString();
                d.putExtra("Value10",scbiv);
                startActivity(d);

                finish();



            }
        });



    }
}
