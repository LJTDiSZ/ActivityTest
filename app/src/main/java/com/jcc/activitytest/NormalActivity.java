package com.jcc.activitytest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by juyuan on 1/20/2016.
 */
public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
