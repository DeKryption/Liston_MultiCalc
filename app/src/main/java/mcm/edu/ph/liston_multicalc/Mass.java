package mcm.edu.ph.liston_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mass extends AppCompatActivity implements View.OnClickListener {
    EditText force, density;
    Button calculate, next;
    TextView forcetv, densitytv, resulttv;
    double solutionkey;
    Variablecodes variable = new Variablecodes();
    Formulacodes formula = new Formulacodes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        getSupportActionBar().hide();

        force = findViewById(R.id.volumetxt);
        density = findViewById(R.id.densitytxt);
        calculate = findViewById(R.id.calculatebtn);
        next = findViewById(R.id.nextpage);
        forcetv = findViewById(R.id.volume);
        densitytv = findViewById(R.id.density);
        resulttv = findViewById(R.id.Result);

        calculate.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calculatebtn:
                variable.setVolume1(Double.parseDouble(force.getText().toString()));
                variable.setDensity(Double.parseDouble(density.getText().toString()));
                solutionkey=formula.mass(variable.getVolume1(),variable.getDensity());
                resulttv.setText(""+solutionkey);
                break;
            case  R.id.nextpage:
                Intent intent = new Intent(Mass.this,KineticE.class);
                startActivity(intent);
                break;

        }
    }
}