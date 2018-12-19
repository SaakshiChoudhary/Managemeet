package com.example.dell.managemeet;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Get msg & Id from intent
        int notificationId=intent.getIntExtra("notificationId",0);
        String message =intent.getStringExtra("todo");

        //When notification is tapped call the MainActivity.
        Intent mainIntent=new Intent(context.MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context,0,mainIntent,0);

        NotificationManager myNotificationManager=
                (NotificationManager) context.getSystemService(Content.NOTIFICATION_SERVICE);

        //prepare notification.
        Notification.Builder builder= new Notification.Builder(context);
        builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("20 minutes to go!")
                .setContentText(message)
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .setPriority(Notification.PRIORITY_MAX)
                .setDefaults(Notification.DEFAULT_ALL);

         //Notify
        myNotificationManager.notify(notificationId,builder.build());

    }
}
