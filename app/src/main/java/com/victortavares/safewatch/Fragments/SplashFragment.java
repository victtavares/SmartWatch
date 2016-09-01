package com.victortavares.safewatch.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.victortavares.safewatch.R;
import com.victortavares.safewatch.mActivities.MainActivity;

import butterknife.ButterKnife;


public class SplashFragment extends BaseFragment {

    private Handler myHandler = new Handler();

    public static SplashFragment newInstance() {
        SplashFragment splashFragment = new SplashFragment();
        return splashFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_splash, container, false);
        ButterKnife.bind(this, rootView);

        delay();
        return rootView;
    }

    private void delay() {
        myHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if(getActivity() == null)
                    return;

                startActivity(new Intent(getBaseActivity(), MainActivity.class));
                getBaseActivity().finish();

            }

        }, 2500);

    }
}
