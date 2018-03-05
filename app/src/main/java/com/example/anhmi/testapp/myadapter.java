package com.example.anhmi.testapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.anhmi.testapp.Model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anhmi on 2/26/2018.
 */

public class myadapter extends ArrayAdapter<Person> {
    private Context context;
    private int resource;
    private ArrayList<Person> objects;



    public myadapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent,false);

        TextView tvName;
        TextView tvAddress;

        tvName = (TextView) convertView.findViewById(R.id.tvName);
        tvAddress = (TextView) convertView.findViewById(R.id.tvAddress);

        Person p = objects.get(position);
        tvName.setText(p.getHoTen());
        tvAddress.setText(p.getDiaChi());
        return convertView;
    }
}
