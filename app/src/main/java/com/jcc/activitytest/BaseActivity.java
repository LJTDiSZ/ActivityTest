package com.jcc.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by juyuan on 1/20/2016.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
    }
}
