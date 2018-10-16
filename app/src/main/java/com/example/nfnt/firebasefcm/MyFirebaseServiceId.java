package com.example.nfnt.firebasefcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by NFNT on 10/16/2018.
 */

public class MyFirebaseServiceId extends FirebaseMessagingService {

    private static final String TAG = "NFNT Aplication" ;


    public void newToken()
    {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(TAG,"Pengirim :" + remoteMessage.getFrom());

        if ( remoteMessage . getData (). size () > 0 ) {
            Log . d ( TAG , "Pesennya Cuy: " + remoteMessage . getData (). get ( "body" ));
        }

        DisplayNotification.getMyInstance(this).displayNotif(remoteMessage.getData().get("title"),remoteMessage.getData().get("body"));



    }
}
