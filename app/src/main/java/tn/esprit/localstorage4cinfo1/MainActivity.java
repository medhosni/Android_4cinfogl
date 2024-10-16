package tn.esprit.localstorage4cinfo1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tn.esprit.localstorage4cinfo1.database.AppDataBase;
import tn.esprit.localstorage4cinfo1.entities.User;

public class MainActivity extends AppCompatActivity {

    private EditText login,pwd ;
    private Button save ,clear ;
    private SharedPreferences sharedPreferences ;
    public static final String MY_PREFERENCES = "MyPrefs" ;
    private AppDataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login =findViewById(R.id.login);
        pwd =findViewById(R.id.pwd);
        save =findViewById(R.id.save);
        clear =findViewById(R.id.clear);
        dataBase = AppDataBase.getAppDataBase(this);
     //   sharedPreferences = getSharedPreferences(MY_PREFERENCES,MODE_PRIVATE);
      //  SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent intent = new Intent(this, MainActivity2.class);

        save.setOnClickListener(e -> {
            dataBase.UserDAO().addUSer(
                    new User(login.getText().toString(),
                            pwd.getText().toString()));

        });
        clear.setOnClickListener(e ->{
            startActivity(intent);
        });



        // ajouter login et pwd dans sp
        /*save.setOnClickListener(e -> {
            editor.putString("login",login.getText().toString());
            editor.putString("pwd",pwd.getText().toString());
            editor.apply();
            startActivity(intent);
        });

        //afficher login et pwd dans sp
        //verifier s'il existe ou pas
        if(sharedPreferences.contains("login")){
            login.setText(sharedPreferences.getString("login","def value"));
            pwd.setText(sharedPreferences.getString("pwd","def value"));
        }

        //supprimer login et pwd dans sp
        clear.setOnClickListener(e-> {
           // editor.remove("login"); supprimer un element par son key
            editor.clear();
            editor.apply();

            login.setText("");
            pwd.setText("");
        });

*/
    }
}