package com.example.viewpager2_example_1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager2_example_1.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeliveredOrdersFragment extends Fragment {

    public DeliveredOrdersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivered_orders, container, false);
    }
}