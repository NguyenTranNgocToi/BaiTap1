package com.example.baitap1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private ArrayList<Clothes> arrayList;

    public CustomAdapter(Context ctx, int layout, ArrayList<Clothes> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(ctx).inflate(layout, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.img =  convertView.findViewById(R.id.imageView);
            viewHolder.tvTen =  convertView.findViewById(R.id.textView);
            viewHolder.tvGia =  convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.img.setImageResource(arrayList.get(position).getIma());
        viewHolder.tvTen.setText(arrayList.get(position).getTen());
        viewHolder.tvGia.setText(String.valueOf(arrayList.get(position).getGia()) +"$");

        return convertView;

    }
    private class ViewHolder{
        ImageView img;
        TextView tvTen;
        TextView tvGia;

    }
}
