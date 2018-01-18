package android.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    Button str;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str=(Button)findViewById(R.id.str);
        name=(EditText)findViewById(R.id.name);
        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fi = new Intent(getApplicationContext(),First.class);
                fi.putExtra("Name",name.toString());
                startActivity(fi);
            }
        });
    }
}
