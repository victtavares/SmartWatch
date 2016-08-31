package com.victortavares.safewatch.Fragments;
import android.support.v4.app.Fragment;
import com.victortavares.safewatch.mActivities.BaseActivity;

/**
 * Created by gishome on 8/31/16.
 */
public class BaseFragment extends Fragment {

    public BaseActivity getBaseActivity(){
            return ((BaseActivity)getActivity());
        }
}
