package com.teamtreehouse.datastorageapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ListAdapter extends RecyclerView.Adapter {

    Context mContext;

    public ListAdapter (Context context) {
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.country_list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ListViewHolder listViewHolder = (ListViewHolder) holder;
        ((ListViewHolder) holder).bindViewHolder(position);
    }

    @Override
    public int getItemCount() {
        return MainActivity.COUNTRY_LIST.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView mCountryText;
        private TextView mContinentText;
        private TextView mPopulationText;

        public ListViewHolder(View itemView) {
            super(itemView);
            mCountryText = (TextView) itemView.findViewById(R.id.nameCountry);
            mContinentText = (TextView) itemView.findViewById(R.id.nameContinent);
            mPopulationText = (TextView) itemView.findViewById(R.id.countPopulation);
        }

        public void bindViewHolder (int position) {
            Country country = MainActivity.COUNTRY_LIST.get(position);
            mCountryText.setText(country.getCountryName());
            mContinentText.setText(country.getContinent());
            String population = country.getPopulation() + "";
            mPopulationText.setText(population);
        }
    }
}
