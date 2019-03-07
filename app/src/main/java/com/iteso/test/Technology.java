package com.iteso.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import beans.Item_Product;

public class Technology extends Fragment {
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    public Technology() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.fragment_tab);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<Item_Product> dataSet = new ArrayList<>();
        dataSet.add(new Item_Product(getResources().getString(R.string.tech_1),
                                        getResources().getString(R.string.store_1),
                                        getResources().getString(R.string.phone_1),
                                        getResources().getString(R.string.city_1),
                                        ResourcesCompat.getDrawable(getResources(),R.drawable.mac, null),
                                        ResourcesCompat.getDrawable(getResources(),R.drawable.bestbuy, null)));

        dataSet.add(new Item_Product(getResources().getString(R.string.tech_2),
                                        getResources().getString(R.string.store_1),
                                        getResources().getString(R.string.phone_1),
                                        getResources().getString(R.string.city_2),
                                        ResourcesCompat.getDrawable(getResources(),R.drawable.alienware, null),
                                        ResourcesCompat.getDrawable(getResources(),R.drawable.bestbuy, null)));

        AdapterProduct adapterProduct = new AdapterProduct(dataSet);
        recyclerView.setAdapter(adapterProduct);
        return v;
    }
}
