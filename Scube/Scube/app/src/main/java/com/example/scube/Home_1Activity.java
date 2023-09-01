package com.example.scube;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;
import java.util.Objects;

public class Home_1Activity extends Fragment implements View.OnClickListener {

    private ArrayList<Item> items = new ArrayList<>();

    public Home_1Activity() {
        //Empty Constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_home_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView1);
       /* LayoutAnimationController animationController= AnimationUtils.loadLayoutAnimation(getActivity(),R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(animationController);*/
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(new RecyclerAdapter(items,getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        items.add(new Item(R.drawable.card_1,R.mipmap.icon_daily_quote,getString(R.string.quote)));
        items.add(new Item(R.drawable.card_3,R.mipmap.icon_up_event,getString(R.string.upevent)));
        items.add(new Item(R.drawable.card_4,R.mipmap.icon_notice_board,getString(R.string.notice)));
        items.add(new Item(R.drawable.card_2,R.mipmap.icon_meetings,getString(R.string.meetings)));

    }
    private void runLayoutAnimation(RecyclerView recyclerView){
        Context context=recyclerView.getContext();
        LayoutAnimationController animationController= AnimationUtils.loadLayoutAnimation(context,R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(animationController);
        Objects.requireNonNull(recyclerView.getAdapter()).notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    @Override
    public void onClick(View v) {

    }
}
