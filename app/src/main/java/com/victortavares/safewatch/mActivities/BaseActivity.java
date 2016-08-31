package com.victortavares.safewatch.mActivities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.victortavares.safewatch.R;

public class BaseActivity extends AppCompatActivity {

    public Fragment currentFragment;

    public void changeFragment(Fragment fragmentToChange) {

        currentFragment = fragmentToChange;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentToChange, fragmentToChange.getClass().toString())
                .addToBackStack(null)
                .commit();

        getSupportFragmentManager().executePendingTransactions();
    }

}
