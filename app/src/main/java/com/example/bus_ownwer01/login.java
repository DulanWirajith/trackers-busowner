package com.example.bus_ownwer01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bus_ownwer01.model.BackgroundTask;
import com.example.bus_ownwer01.model.LoginRequest;
import com.example.bus_ownwer01.model.LoginResponse;
import com.example.bus_ownwer01.remote_connection.API;
import com.example.bus_ownwer01.remote_connection.RetrofitClient;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {

    Button button;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.logbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void openNewActivity() {
        Toast.makeText(login.this, "login clicked!!!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    private void loginUser(){
        //        create API object
        API service = RetrofitClient.createService(API.class);

        //        create LoginRequest object
        LoginRequest loginRequest = new LoginRequest();
        email = (EditText) findViewById(R.id.ownerEmail);
        password = (EditText) findViewById(R.id.ownerPassword);

        loginRequest.setOwner_mail(email.getText().toString());
        loginRequest.setPassword(password.getText().toString());

        //        request and get response
        final Call<LoginResponse> isLogginSuccessful = service.loginUser(loginRequest);

        isLogginSuccessful.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body().isUserRight()) {
                        String ownerID = response.body().getOwnerID();
                        String ownerfirstName = response.body().getOwnerfirstName();
                        String ownerlastName = response.body().getOwnerlastName();
                        String ownerMail = response.body().getOwnerMail();
                        int ownerContact = response.body().getOwnerContact();
                        boolean ownerVirtify = response.body().isOwnerVirtify();

                        BackgroundTask backgroundTask = BackgroundTask.setBackgroundTask(ownerID, ownerfirstName, ownerlastName, ownerMail, ownerContact, ownerVirtify);
//                        System.out.println("hey!!! "+backgroundTask.getBackgroundTask().getPassengerId());
//                        goto another fragment
                        openNewActivity();

                        Toast.makeText(login.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                    }
                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        String message = jObjError.getString("message");
                        Toast.makeText(login.this, message, Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(login.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Context context = getApplicationContext();
                CharSequence text = "Failed to connect with the server...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }
}
