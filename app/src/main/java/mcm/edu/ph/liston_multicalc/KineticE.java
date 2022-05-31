package mcm.edu.ph.liston_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KineticE extends AppCompatActivity implements View.OnClickListener {
    EditText velocity, speed;
    Button calculateBtn2, NextBtn2;
    TextView speedN, velocityN, answer;

    Formulacodes numbers = new Formulacodes();
    Variablecodes variable = new Variablecodes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic_e);
        getSupportActionBar().hide();

        speed = findViewById(R.id.numbers1);
        velocity = findViewById(R.id.numbers2);
        calculateBtn2 = findViewById(R.id.Answerbtn);
        NextBtn2 = findViewById(R.id.nextpage2);
        speedN = findViewById(R.id.speed1);
        velocityN = findViewById(R.id.velocity1);
        answer = findViewById(R.id.answer);

        calculateBtn2.setOnClickListener(this);
        NextBtn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Answerbtn:
                variable.setSpeed(Double.parseDouble(speed.getText().toString()));
                variable.setVelocity1(Double.parseDouble(velocity.getText().toString()));
                double solve = numbers.kinetic(variable.getSpeed(), variable.getVelocity1());
                answer.setText("" + solve);
                break;
            case R.id.nextpage2:
                Intent i2 = new Intent(KineticE.this, Ohmslaw.class);
                startActivity(i2);
                break;
        }

    }
}