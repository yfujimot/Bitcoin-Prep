package com.ThinkFuji.slidersample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
/**
 * Created by Yoshi on 7/2/2014.
 */
public class what_is extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.what_is,
                container, false);
        return view;
    }

}
