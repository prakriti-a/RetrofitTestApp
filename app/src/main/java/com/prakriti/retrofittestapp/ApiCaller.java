package com.prakriti.retrofittestapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCaller {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
    // "https://dummy.restapiexample.com/api/v1/";

    @GET("marvel")
    Call<List<EmployeeData>> getData();

}
