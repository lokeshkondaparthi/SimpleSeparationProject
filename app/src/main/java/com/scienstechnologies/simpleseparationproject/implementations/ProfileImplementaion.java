package com.scienstechnologies.simpleseparationproject.implementations;

import android.app.Activity;
import android.content.Context;

import com.scienstechnologies.simpleseparationproject.models.IAppConstants;
import com.scienstechnologies.simpleseparationproject.models.model.RootModel;
import com.scienstechnologies.simpleseparationproject.models.net.RetrofitAdapterCreator;
import com.scienstechnologies.simpleseparationproject.presenters.ProfilePresenters;
import com.scienstechnologies.simpleseparationproject.ui.activities.MainActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileImplementaion {
    private Context mContext;

    public ProfileImplementaion(Context mContext) {
        this.mContext = mContext;
    }

    public void getResponseAndCallback() {
        getActivity().showProgressBar();
        Call<RootModel> rootModelCall =  RetrofitAdapterCreator.getAPIServiceInstance(IAppConstants.BASE_URL)
                .getUserInfo(getActivity().getTextFromET());
        rootModelCall.enqueue(new Callback<RootModel>() {
            @Override
            public void onResponse(Call<RootModel> call, Response<RootModel> response) {
                RootModel model = response.body();
                getActivity().setLocation(model.getLocation());
                getActivity().setName(model.getLoginName());
                getActivity().hideProgressBar();
            }

            @Override
            public void onFailure(Call<RootModel> call, Throwable t) {
                getActivity().hideProgressBar();
            }
        });

    }

    private MainActivity getActivity() {
        return (MainActivity) mContext;
    }
}
