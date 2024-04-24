package com.app.livesync;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class LiveAdapter extends RecyclerView.Adapter<LiveAdapter.LiveViewHolder> {

    private List<Live> liveList;
    private Context context;

    public LiveAdapter(List<Live> liveList, Context context) {
        this.liveList = liveList;
        this.context = context;
    }

    public static class LiveViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView descriptionTextView;

        public LiveViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }

    @NonNull
    @Override
    public LiveAdapter.LiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_live, parent, false);
        return new LiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LiveAdapter.LiveViewHolder holder, int position) {
        Live live = liveList.get(position);
    }

    @Override
    public int getItemCount() {
       return liveList.size();
    }
}
