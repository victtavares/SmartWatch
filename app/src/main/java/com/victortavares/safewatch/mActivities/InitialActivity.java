package com.victortavares.safewatch.mActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.victortavares.safewatch.Fragments.SplashFragment;
import com.victortavares.safewatch.R;

public class InitialActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_initial);

        changeFragment(SplashFragment.newInstance());
    }
}
