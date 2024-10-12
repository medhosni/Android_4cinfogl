package tn.esprit.recyclerview4gl;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private RecyclerView rc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.recyclerView);
        List<Champion> champions = new ArrayList();
        champions.add(new Champion("Ashe","ADC",R.drawable.ic_ashe));
        champions.add(new Champion("AHRI","MID",R.drawable.ic_ahri));
        champions.add(new Champion("ANNIE","MID",R.drawable.ic_annie));
        champions.add(new Champion("EKKO","TOP",R.drawable.ic_ekko));
        champions.add(new Champion("BLITZ","SUPPORT",R.drawable.ic_blitzcrank));
        champions.add(new Champion("LEE SIN","JUNGLER",R.drawable.ic_leesin));
        champions.add(new Champion("MF","ADC",R.drawable.ic_missfortune));
        champions.add(new Champion("QUIN ","TOP",R.drawable.ic_quinn));
        champions.add(new Champion("NASUS","TOP",R.drawable.ic_nasus));


        ChampionAdaptor adapter = new ChampionAdaptor(champions,this);
        rc.setAdapter(adapter);
        LinearLayoutManager mLayoutManager =new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true);
        rc.setLayoutManager(mLayoutManager);
    }
}