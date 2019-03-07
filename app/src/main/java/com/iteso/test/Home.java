package com.iteso.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

import beans.Item_Product;

public class Home extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public Home() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.fragment_tab);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<Item_Product> dataSet = new ArrayList<>();
        dataSet.add(new Item_Product(getResources().getString(R.string.home_1),
                                    getResources().getString(R.string.store_1),
                                    getResources().getString(R.string.phone_1),
                                    getResources().getString(R.string.city_1),
                                    ResourcesCompat.getDrawable(getResources(),R.drawable.comedor, null),
                                    ResourcesCompat.getDrawable(getResources(), R.drawable.bestbuy, null)));

        dataSet.add(new Item_Product(getResources().getString(R.string.home_2),
                                    getResources().getString(R.string.store_1),
                                    getResources().getString(R.string.phone_1),
                                    getResources().getString(R.string.city_2),
                                    ResourcesCompat.getDrawable(getResources(), R.drawable.cama, null),
                                    ResourcesCompat.getDrawable(getResources(), R.drawable.bestbuy, null)));

        AdapterProduct adapterProduct = new AdapterProduct(dataSet);
        recyclerView.setAdapter(adapterProduct);
        return v;
    }
}