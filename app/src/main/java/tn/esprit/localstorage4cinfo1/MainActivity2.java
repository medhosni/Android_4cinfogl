package tn.esprit.localstorage4cinfo1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tn.esprit.localstorage4cinfo1.database.AppDataBase;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView ;
    private SharedPreferences sp ;
    private AppDataBase dataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        //sp = getSharedPreferences(MainActivity.MY_PREFERENCES,MODE_PRIVATE);
        textView =findViewById(R.id.textView);
        dataBase= AppDataBase.getAppDataBase(this);
        textView.setText(dataBase.UserDAO().getAll().toString());
    }
}