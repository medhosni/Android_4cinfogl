package tn.esprit.colormixer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {
private RelativeLayout resultRL;
private ImageView imageView;
private TextView success,fullnameTXT;
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultRL = findViewById(R.id.resultRL);
        imageView = findViewById(R.id.imageView);
        success = findViewById(R.id.success);
        fullnameTXT = findViewById(R.id.fullnameTXT);
        button = findViewById(R.id.button);
        boolean result =getIntent().getBooleanExtra("result",false);
        Toast.makeText(this,getIntent().getStringExtra("fullname"),Toast.LENGTH_LONG)
                        .show();
        fullnameTXT.setText("Congratulations "+getIntent().getStringExtra("fullname"));
        if(!result){
            resultRL.setBackgroundColor(getResources().getColor(R.color.red));
            imageView.setImageResource(R.drawable.baseline_cancel_24);
            success.setText("WRONG");
            fullnameTXT.setText("SORRY "+getIntent().getStringExtra("fullname"));
            button.setBackgroundColor(getResources().getColor(R.color.red));


        }



    }
}