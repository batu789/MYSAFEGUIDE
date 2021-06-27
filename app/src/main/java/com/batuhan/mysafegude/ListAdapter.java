package com.batuhan.mysafegude;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] ana;
    private final String[] alt;
    private final Integer[] imgid;

    public CustomAdapter(Activity context, String[] ana,String[] alt, Integer[] imgid) {
        super(context, R.layout.row, ana);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.ana=ana;
        this.alt=alt;
        this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(ana[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(alt[position]);

        return rowView;


    };
}
