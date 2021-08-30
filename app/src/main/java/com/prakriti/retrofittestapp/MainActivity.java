package com.prakriti.retrofittestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiCaller.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> listNames = new ArrayList<>();

        String TAG = "RETROFIT";

        ApiCaller apiCaller = retrofit.create(ApiCaller.class);
        Call<List<EmployeeData>> employeeData = apiCaller.getData();
            // Call is an interface that sends request to server & gets a response

        employeeData.enqueue(new Callback<List<EmployeeData>>() {
            // using enqueue() executes calls asynchronously
            // execute() executes them synchronously
            @Override
            public void onResponse(Call<List<EmployeeData>> call, Response<List<EmployeeData>> response) {
                for(EmployeeData one : response.body()) {
                    Log.i(TAG, "onResponse: " + one.getCharacter());
                    listNames.add(one.getCharacter());
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listNames);
                myListView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<List<EmployeeData>> call, Throwable t) {
                Log.e(TAG, "onFailure: "+ t.getMessage());
            }
        });

    }
}