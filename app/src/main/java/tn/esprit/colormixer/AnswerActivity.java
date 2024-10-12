package tn.esprit.colormixer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnswerActivity extends AppCompatActivity {
private TextView colorsmixed;
private Button bnt ;
private RadioButton rbPuple,rbgreen,rborange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        colorsmixed = findViewById(R.id.cheesedcolors);
        rbPuple =findViewById(R.id.rbPuple);
        rbgreen =findViewById(R.id.rbgreen);
        rborange =findViewById(R.id.rborange);
        bnt =findViewById(R.id.submit);
        String color1 =getIntent().getStringExtra("color1");
        String color2 =getIntent().getStringExtra("color2");

        colorsmixed.setText("you choose "+color1+"&"
                +color2);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("fullname",getIntent().getStringExtra("fullname"));
        Toast.makeText(this,getIntent().getStringExtra("fullname"),Toast.LENGTH_LONG)
                .show();
        bnt.setOnClickListener(e ->{
        if(rbgreen.isChecked()&& color1.equals("yellow") && color2.equals("blue") ){
            intent.putExtra("result",true);
            startActivity(intent);

        }
        if(rbPuple.isChecked()&& color1.equals("red") && color2.equals("blue") ){
            intent.putExtra("result",true);
            startActivity(intent);

        }
        if(rborange.isChecked()&& color1.equals("red") && color2.equals("yellow") ){
            intent.putExtra("result",true);
            startActivity(intent);

        }else {
            intent.putExtra("result", false);
            startActivity(intent);
        }
        });




    }
}