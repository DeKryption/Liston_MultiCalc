package mcm.edu.ph.liston_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Start = findViewById(R.id.startbtn);

            Start.setOnClickListener(new View.OnClickListener() {

                @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mass.class);
                startActivity(intent);
            }
        });

        }

    {

    }
}
