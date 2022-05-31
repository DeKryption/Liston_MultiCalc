package mcm.edu.ph.liston_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ohmslaw extends AppCompatActivity implements View.OnClickListener{

    Button answerbtn2, nextBtn3;
    EditText current, resistance;
    TextView resulttxt, currenttxt, resistancetxt;

    Formulacodes number=new Formulacodes();
    Variablecodes variable=new Variablecodes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohmslaw);
        getSupportActionBar().hide();

        answerbtn2=findViewById(R.id.answerbtn);
        nextBtn3=findViewById(R.id.nextpage3);
        current=findViewById(R.id.numbers4);
        resistance=findViewById(R.id.numbers3);
        resulttxt=findViewById(R.id.answer2);
        currenttxt=findViewById(R.id.Ecurrent);
        resistancetxt=findViewById(R.id.Resist);

        answerbtn2.setOnClickListener(this);
        nextBtn3.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.answerbtn:
                variable.setCurrent(Double.parseDouble(current.getText().toString()));
                variable.setResistance(Double.parseDouble(resistance.getText().toString()));
                double solve = number.ohms(variable.getCurrent(), variable.getResistance());
                resulttxt.setText(""+solve);
                break;
            case R.id.nextpage3:
                Intent i2 = new Intent(Ohmslaw.this,AreaofT.class);
                startActivity(i2);
                break;

        }
    }

}

