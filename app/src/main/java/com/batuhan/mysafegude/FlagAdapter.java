package com.batuhan.mysafegude;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter {
    List <FlagType> userDataInfo = new ArrayList<FlagType>();

    public FlagAdapter(@NonNull Context context,List<FlagType>userDataInfo) {
        super(context, R.layout.row, userDataInfo);
        this.userDataInfo = userDataInfo;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView,  @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
View roww=inflater.inflate(R.layout.row,parent,false);

        ImageView flagImage =roww.findViewById(R.id.icon);
        TextView tvCountry =roww.findViewById(R.id.title);


        flagImage.setImageResource(userDataInfo.get(position).getmImg());
        tvCountry.setText(userDataInfo.get(position).getmCountryName());

return roww;
    }
}
