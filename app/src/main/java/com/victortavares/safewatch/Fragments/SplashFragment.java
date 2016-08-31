package com.victortavares.safewatch.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.victortavares.safewatch.R;


public class SplashFragment extends BaseFragment {

    public static SplashFragment newInstance() {
        SplashFragment splashFragment = new SplashFragment();
        return splashFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }
}
