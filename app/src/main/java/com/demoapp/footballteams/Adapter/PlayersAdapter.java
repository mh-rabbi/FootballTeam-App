package com.demoapp.footballteams.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.demoapp.footballteams.MainActivity;
import com.demoapp.footballteams.R;

import java.util.ArrayList;

public class PlayersAdapter extends BaseAdapter {

     Context context;
     String[] players;

    public PlayersAdapter(Context context, String[] players) {
        this.context = context;
        this.players = players;
    }

    @Override
    public int getCount() {
        return players.length;
    }

    @Override
    public Object getItem(int position) {
        return players[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_players,viewGroup,false);
        }
        TextView txtPlayer = view.findViewById(R.id.txt_itemPlayers);
        txtPlayer.setText(players[position]);
        return view;
    }
}
