package com.scienstechnologies.simpleseparationproject.models.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapterCreator {
    //Here implement the IAPIService class useing retrofit so we are fllowing this code

    public static IAPIServices getAPIServiceInstance(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //here when u r use create that time add the baseurl nd endurl
        IAPIServices iapiServices = retrofit.create(IAPIServices.class);

        return iapiServices;
    }
}