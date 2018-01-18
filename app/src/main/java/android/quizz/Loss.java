package android.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Loss extends AppCompatActivity {
    TextView text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loss);
        String na=getIntent().getStringExtra("Name");
        String a =getIntent().getStringExtra("Score");
        text5 = (TextView)findViewById(R.id.text);
        text5.setText("Your Score: "+a+" Name: "+na);

    }
}
