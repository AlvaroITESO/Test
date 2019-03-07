package com.iteso.test;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;


import beans.Item_Product;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolder>{

    ArrayList<Item_Product> dataSet;
    private Context context;



    public AdapterProduct(ArrayList<Item_Product> dataSet){
        this.dataSet = dataSet;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public Button mDetail;
        public TextView mProductTitle;
        public TextView mProductStore;
        public TextView mProductLocation;
        public TextView mProductPhone;
        public ImageView mProductImage;
        public ImageView mProductThumbnail;
        public RelativeLayout mEventLayout;


        public ViewHolder(View v){
            super(v);
            mEventLayout = (RelativeLayout) v.findViewById(R.id.item_product_layout);
            mDetail = (Button) v.findViewById(R.id.item_product_detail);
            mProductTitle = (TextView) v.findViewById(R.id.item_product_title);
            mProductStore = (TextView) v.findViewById(R.id.item_product_store);
            mProductLocation = (TextView) v.findViewById(R.id.item_product_location);
            mProductPhone = (TextView) v.findViewById(R.id.item_product_phone);
            mProductImage = (ImageView) v.findViewById(R.id.item_product_image);
            mProductThumbnail = (ImageView) v.findViewById(R.id.item_product_thumbnail);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_product,
                viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder,final int i) {
        viewHolder.mProductTitle.setText(dataSet.get(i).getNombreP());
        viewHolder.mProductTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), dataSet.get(i).toString(), Toast.LENGTH_LONG).show();
            }
        });

        viewHolder.mProductStore.setText(dataSet.get(i).getNombreV());
        viewHolder.mProductStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), dataSet.get(i).toString(), Toast.LENGTH_LONG).show();  }
        });

        viewHolder.mProductLocation.setText(dataSet.get(i).getNombreP());
        viewHolder.mProductLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), dataSet.get(i).toString(), Toast.LENGTH_LONG).show();}
        });

        viewHolder.mDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), dataSet.get(i).toString(), Toast.LENGTH_LONG).show(); }
        });

        viewHolder.mProductPhone.setText(dataSet.get(i).getTelefono());
        viewHolder.mProductPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+dataSet.get(i).getTelefono()));
                v.getContext().startActivity(intent);
            }
        });

        viewHolder.mProductImage.setImageDrawable(dataSet.get(i).getImagenP());
        viewHolder.mProductThumbnail.setImageDrawable(dataSet.get(i).getImagenV());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
