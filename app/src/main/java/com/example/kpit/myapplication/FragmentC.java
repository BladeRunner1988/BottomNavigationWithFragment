package com.example.kpit.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by kpit on 5/22/17.
 */

public class FragmentC extends Fragment {
    private View view;
    private Context context;
    private LayoutInflater inflater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.context = getContext();
        this.inflater = inflater;
        this.view = inflater.inflate(R.layout.fragment_c, null);

        Toast.makeText(context, "Fragment C", Toast.LENGTH_SHORT).show();

        return this.view;
    }

    public static FragmentC newInstance() {
        FragmentC fragment = new FragmentC();
        return fragment;
    }
}
