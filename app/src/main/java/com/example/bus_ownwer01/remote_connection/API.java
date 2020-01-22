package com.example.bus_ownwer01.remote_connection;



import com.example.bus_ownwer01.model.LoginRequest;
import com.example.bus_ownwer01.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    //    method for call registration route in node server
//    @POST("/api/v1.0.0/registration")
//    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

    @POST("/api/v1.0.0/ownerlogin")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

//    @POST("/api/v1.0.0/savereviews")
//    Call<PassengerReviewResponse> passengerReview(@Body PassengerReviewRequest passengerReviewRequest);


}
