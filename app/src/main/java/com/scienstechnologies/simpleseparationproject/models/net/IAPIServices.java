package com.scienstechnologies.simpleseparationproject.models.net;

import com.scienstechnologies.simpleseparationproject.models.model.LoginRootModel;
import com.scienstechnologies.simpleseparationproject.models.model.RootModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IAPIServices {

    @GET("users/{hai}")
    Call<RootModel> getUserInfo(@Path("hai") String name);



    @FormUrlEncoded
    @POST("login")
    Call<LoginRootModel> loginUser(@Field("email_id") String emailId, @Field("password") String password,
                                   @Field("user_type") String newP);


}