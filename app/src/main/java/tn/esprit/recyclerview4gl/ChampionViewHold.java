package tn.esprit.recyclerview4gl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChampionViewHold extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView name;
    public TextView post;

    public ChampionViewHold(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imgchamp);
        name = itemView.findViewById(R.id.name);
        post = itemView.findViewById(R.id.post);


    }
}
