package tn.esprit.recyclerview4gl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChampionAdaptor extends RecyclerView.Adapter<ChampionViewHold> {
    private List<Champion> champions ;
    private Context context;
    public ChampionAdaptor(List<Champion> championList, Context context){
        this.champions = championList;
        this.context = context;
    }
    @NonNull
    @Override
    public ChampionViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(this.context)
                .inflate(R.layout.single_item_view,parent,false);
        return new ChampionViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChampionViewHold holder, int position) {
        holder.name.setText(champions.get(position).nom);
        holder.post.setText(champions.get(position).post);

        holder.img.setImageResource(champions.get(position).img);


    }

    @Override
    public int getItemCount() {
        return this.champions.size();
    }
}
