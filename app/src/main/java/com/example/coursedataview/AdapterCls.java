package com.example.coursedataview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterCls extends ArrayAdapter<Model> {

    Activity context;
    List<Model> list;

    public AdapterCls(Activity context, List<Model> list) {
        super(context, R.layout.courselayout, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.courselayout, null, true);

        TextView catname_ = (TextView) convertView.findViewById(R.id.txt_catname);
        TextView author_ = (TextView) convertView.findViewById(R.id.txt_author);
        TextView subject_ = (TextView) convertView.findViewById(R.id.txt_subject);
        TextView tutor_ = (TextView) convertView.findViewById(R.id.txt_tutor);
        TextView institute_ = (TextView) convertView.findViewById(R.id.txt_institute);

        Model model = list.get(position);

        catname_.setText(model.getCategory());
        author_.setText(model.getAuthor());
        subject_.setText(model.getSubject());
        tutor_.setText(model.getTutor());
        institute_.setText(model.getInstitue());

        return convertView;
    }
}
