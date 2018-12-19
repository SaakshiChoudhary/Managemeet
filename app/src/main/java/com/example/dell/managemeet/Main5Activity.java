package com.example.dell.managemeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button3=(Button) findViewById(R.id.wsbton);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                openMain2Activity();
            }
        });
    }public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
}
