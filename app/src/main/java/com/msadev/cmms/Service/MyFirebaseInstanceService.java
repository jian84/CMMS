//package com.msadev.cmms.Service;
//
//import android.util.Log;
//
//import com.google.firebase.iid.FirebaseInstanceId;
//import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.messaging.FirebaseMessagingService;
//
//public class MyFirebaseInstanceService extends FirebaseMessagingService {
//
//    private static final String TAG="MyFirebaseInstanceServi";
//
//    @Override
//    public void onTokenRefresh() {
//        // Get updated InstanceID token.
//        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
//        FirebaseMessaging.getInstance().subscribeToTopic("all");
//        Log.d(TAG, "Refreshed token: " + refreshedToken);
//
//        /* If you want to send messages to this application instance or manage this apps subscriptions on the server side, send the Instance ID token to your app server.*/
//
//        sendRegistrationToServer(refreshedToken);
//    }
//
//    private void sendRegistrationToServer(String refreshedToken) {
//        Log.d("TOKEN ", refreshedToken.toString());
//    }
//
//}