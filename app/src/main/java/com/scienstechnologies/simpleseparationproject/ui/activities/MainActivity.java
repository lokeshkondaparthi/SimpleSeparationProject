package com.scienstechnologies.simpleseparationproject.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.scienstechnologies.simpleseparationproject.R;
import com.scienstechnologies.simpleseparationproject.implementations.ProfileImplementaion;
import com.scienstechnologies.simpleseparationproject.presenters.ProfilePresenters;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ProfilePresenters {
    @BindView(R.id.etUser)
    EditText mETUserName;

    @BindView(R.id.name)
    TextView mTVName;

    @BindView(R.id.location)
    TextView mTVLocation;

    @BindView(R.id.id)
    TextView mTVid;

    @BindView(R.id.followers)
    TextView mTVfollowers;

    @BindView(R.id.pb)
    ProgressBar mPB;

    private ProfileImplementaion mProfileImplementaion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mProfileImplementaion = new ProfileImplementaion(MainActivity.this);
    }

    /**
     * Submit button.
     * @param view
     */
    public void searchUser(View view) {
        mProfileImplementaion.getResponseAndCallback();
    }




    @Override
    public void setName(String name) {
        mTVName.setText(name);
    }

    @Override
    public void setLocation(String location) {
        mTVLocation.setText(location);
    }

    @Override
    public String getTextFromET() {
        return mETUserName.getText().toString();
    }

    @Override
    public void showProgressBar() {
        mPB.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        mPB.setVisibility(View.GONE);
    }
}
