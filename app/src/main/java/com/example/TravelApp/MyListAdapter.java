package com.example.TravelApp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.TravelApp.Travel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<com.example.TravelApp.MyListAdapter.ViewHolder> {
    private Context mcontext;
    private List<Travel> listdata;


    public MyListAdapter(Context mcontext, List<Travel> listdata) {
        this.mcontext = mcontext;
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.listitemlayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Travel myListData = listdata.get(position);
        holder.img.setImageResource(listdata.get(position).getimag());
        holder.namecountry.setText(listdata.get(position).getNameCountry());
        holder.namecity.setText(listdata.get(position).getNamecity());
        holder.days.setText(listdata.get(position).getdays());
        holder.pay.setText(listdata.get(position).getpay());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (holder.getAdapterPosition() == 0) {

                    Intent intent = new Intent(mcontext, Jordan_Activity.class);

                    mcontext.startActivity(intent);
                }

                if (holder.getAdapterPosition() == 1) {

                    Intent intent = new Intent(mcontext, PalestineActivity.class);

                    mcontext.startActivity(intent);
                }

                if (holder.getAdapterPosition() == 2) {

                    Intent intent = new Intent(mcontext, QatarActivity.class);

                    mcontext.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 3) {

                    Intent intent = new Intent(mcontext, SpainActivity.class);

                    mcontext.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 4) {

                    Intent intent = new Intent(mcontext, GermanyActivity.class);

                    mcontext.startActivity(intent);
                }
                if (holder.getAdapterPosition() == 5) {

                    Intent intent = new Intent(mcontext, ItalyActivity.class);

                    mcontext.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView namecountry;
        public TextView namecity;
        public TextView days;
        public TextView pay;
        public ImageView img;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.item_country_imageView);
            this.namecountry = itemView.findViewById(R.id.item_country_name_tv);
            this.namecity = itemView.findViewById(R.id.item_country_city_tv);
            this.days = itemView.findViewById(R.id.item_country_numberOfDays_tv);
            this.pay = itemView.findViewById(R.id.item_country_price_tv);

        }
    }
}
