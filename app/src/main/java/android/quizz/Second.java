package android.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    public void onBackPressed(){
        Intent i = new Intent(getApplicationContext(),Main.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final String sc="20";
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Loss.class);
                String etname=getIntent().getStringExtra("Name");
                i.putExtra("Name", etname);
                i.putExtra("Score",sc);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Loss.class);
                String etname=getIntent().getStringExtra("Name");
                i.putExtra("Name", etname);
                i.putExtra("Score",sc);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Loss.class);
                String etname=getIntent().getStringExtra("Name");
                i.putExtra("Name", etname);
                i.putExtra("Score",sc);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Second.class);
                String etname=getIntent().getStringExtra("Name");
                i.putExtra("Name", etname);
                startActivity(i);
            }
        });
    }
}
