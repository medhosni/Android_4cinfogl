package tn.esprit.fragment4cinfogl;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button frag1,frag2,frag3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1 = findViewById(R.id.frag1);
        frag2 = findViewById(R.id.frag2);
        frag3 = findViewById(R.id.frag3);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame,new FragmentOne())
                .commit();

        frag1.setOnClickListener(e->{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame,new FragmentOne())
                    .commit();

        });
        frag2.setOnClickListener(e->{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame,new FragmentTwo())
                    .commit();

        });
        frag3.setOnClickListener(e->{
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame,new FragmentThree())
                    .commit();

        });


    }
}