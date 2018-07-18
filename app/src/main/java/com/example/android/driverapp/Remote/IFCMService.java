package com.example.android.driverapp.Remote;


import com.example.android.driverapp.Model.FCMResponse;
import com.example.android.driverapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAZrApJWM:APA91bGAGbg8uFYw7hxFFK67iusGoHOJfY4bWEWfBbrtFIQEyvZ8wUIoYFdED-ohLU7rhc8BiVHjvoHnARtA9MrdMo8e-wVyDqslBA2CJ8_KnmD7JGZPgUPF8JYqKu8XR5wSqX-NEeLkIw1Gg608rbLqFRYk1QMBcQ"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
