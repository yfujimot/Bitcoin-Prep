package com.ThinkFuji.slidersample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yoshi on 7/2/2014.
 */
public class BuySell extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buy_sell,
                container, false);
        return view;
    }

    public void fetchPrices() {

    }
}
