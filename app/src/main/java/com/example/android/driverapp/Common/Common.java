package com.example.android.driverapp.Common;

import android.location.Location;

import com.example.android.driverapp.Remote.FCMClient;
import com.example.android.driverapp.Remote.IFCMService;
import com.example.android.driverapp.Remote.IGoogleAPI;
import com.example.android.driverapp.Remote.RetrofitClient;

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_rider_tbl = "Users";
    public static final String user_driver_tbl = "UsersDrivers";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com";
    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
