package com.example.petstore76;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi
{

    @GET("pet/{petId}")
    Call<Pet> getPet(@Path("petId") String petId);

    @POST("pet")
    Call<Void> postPet(@Body Pet pet);

}
