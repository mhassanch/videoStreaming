package com.example.videostreaming;

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


public class ListAdapter extends ArrayAdapter<video_component> {
    public ListAdapter(Context context, ArrayList<video_component> videoArray) {
        super(context, R.layout.video_component,videoArray);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        video_component v  = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.video_component,parent,false);
        }
        ImageView thumbnail = convertView.findViewById(R.id.thumbnail);
        TextView title = convertView.findViewById(R.id.video_title);
        TextView vInfo = convertView.findViewById(R.id.video_info);
        ImageView channelLogo = convertView.findViewById(R.id.channel_logo);

        thumbnail.setImageResource(v.getThumbnail());
        title.setText(v.getTitle());
        vInfo.setText(v.getVideoInfo());
        channelLogo.setImageResource(v.getChannelName());
        
        return super.getView(position, convertView, parent);
    }
}
