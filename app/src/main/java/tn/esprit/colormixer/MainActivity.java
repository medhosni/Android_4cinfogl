package tn.esprit.colormixer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button mix;
private CheckBox cbblue, cbred,cbyellow;
private EditText fullname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         //binding des view avec les objects java
         mix =findViewById(R.id.mix);
         cbblue =findViewById(R.id.cbblue);
         cbyellow = findViewById(R.id.cbyellow);
         cbred =findViewById(R.id.cbred);
         fullname =findViewById(R.id.fullname);
        Intent intent = new Intent(this,AnswerActivity.class);
        intent.putExtra("fullname",fullname.getText().toString());

         mix.setOnClickListener(e -> {
             //recuperation des donner
             //route vers la page deux
            if (cbred.isChecked() && cbyellow.isChecked() && cbblue.isChecked()){
                Toast.makeText(this,"errooooooooooooooooo",Toast.LENGTH_LONG).show();
            }else if(cbred.isChecked() && cbblue.isChecked()){
                intent.putExtra("color1","red");
                intent.putExtra("color2","blue");

                startActivity(intent);
                //action
            }else if(cbred.isChecked() && cbyellow.isChecked()){
                intent.putExtra("color1","red");
                intent.putExtra("color2","yellow");

                startActivity(intent);
                //action
            }else if(cbyellow.isChecked() && cbblue.isChecked()){
                intent.putExtra("color1","yellow");
                intent.putExtra("color2","blue");

                startActivity(intent);
                //action
            }else {
                Toast.makeText(this,"choose 2 color ",Toast.LENGTH_LONG).show();
            }

      //  startActivity(intent);
         });



    }
}