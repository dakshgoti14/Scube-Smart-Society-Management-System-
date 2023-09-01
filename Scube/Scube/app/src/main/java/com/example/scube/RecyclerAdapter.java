package com.example.scube;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Item> items;
    private Context context;


    public RecyclerAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        final Item item = items.get(position);
        holder.image1.setImageResource(item.getImageResource1());
        holder.image2.setImageResource(item.getImageResource2());
        holder.txt.setText(item.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getTitle() + " clicked", Toast.LENGTH_SHORT).show();
                switch (item.getTitle()) {
                    case "Upcoming Events": {
                        Intent intent = new Intent(v.getContext(), UpcomingEvents.class);
                        context.startActivity(intent);
                        break;
                    }
                    case "Upcoming Meetings": {
                        Intent intent = new Intent(v.getContext(), UpcomingMeetings.class);
                        context.startActivity(intent);
                        break;
                    }
                    case "Bulletin Board": {
                        Intent intent = new Intent(v.getContext(), BulletinBoard.class);
                        context.startActivity(intent);
                        break;
                    }
                    case "Daily Golden Quotes": {
                        Intent intent = new Intent(v.getContext(), DailyQuoteActivity.class);
                        context.startActivity(intent);
                        break;
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1, image2;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = (ImageView) itemView.findViewById(R.id.bg_img);
            image2 = (ImageView) itemView.findViewById(R.id.icon_img);
            txt = (TextView) itemView.findViewById(R.id.txt);
        }
    }
}