package com.example.dell.managemeet;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int notificationId=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set on click listener
        findViewById(R.id.setalarm).setOnClickListener(this);
        findViewById(R.id.cancelalarm).setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        EditText editText = findViewById(R.id.editText);
        TimePicker timePicker =findViewById(R.id.timePicker);
        //Set notification and text.
        Intent intent=new Intent(MainActivity.this,AlarmReceiver.class);
        intern.putExtra("NotificationId",notificationId);
        intern.putExtra("todo",editText.getText().tostring());
        //getBroadcast(content ,requestcode,intent,flags)
        PendingIntent alarmIntent = PendingIntent.getBroadcast(MainActivity.this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);

        AlarmManager alarm =(AlarmManager)getSystemService(ALARM_SERVICE);

        switch(view.getId()){
            case R.id.setalarm;
              int hour =timePicker.getCurrentHour();
              int minute=timePicker.getCurrentMinute();

              //create time
                Calandar startTime =Calender.getInstance();
                startTime.set(Calandar.HOUR_OF_DAY,hour);
                startTime.set(calander.MINUTE,minute-20);
                startTime.set(Calender.SECOND,0);
                long alarmStartTime = startTime.getTimeInMillis();


                //Set alarm
                //set(time,miliisecon,intent)
                alarm.set(AlarmManager.RTC_WAKEUP,alarmStartTime,alarmIntent);

                Toast.makeText(this,"Done!", Toast.LENGTH_SHORT).show();
                break;

                case R.id.cancelalarm;
                  alarm.cancel(alarmIntent);
                  Toast.makeText(this,"Cancelled.", Toast.LENGTH_SHORT).show();
                  break;


        }
    }
}
