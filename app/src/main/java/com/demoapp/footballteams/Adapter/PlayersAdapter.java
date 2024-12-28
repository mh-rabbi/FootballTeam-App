package com.demoapp.footballteams;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayersAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> players;

    public PlayersAdapter(Context context, ArrayList<String> players) {
        this.context = context;
        this.players = players;
    }

    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int position) {
        return players.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list1,viewGroup,false);
        }
        TextView txtPlayer = view.findViewById(R.id.lst_players);
        txtPlayer.setText(players.get(position));
        return view;
    }
}
