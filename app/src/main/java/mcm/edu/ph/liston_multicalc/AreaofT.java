package mcm.edu.ph.liston_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaofT extends AppCompatActivity implements View.OnClickListener{

    Button Answerbtn2;
    EditText base, height;
    TextView basetxt, heighttxt, resultxt;
    Formulacodes number=new Formulacodes();
    Variablecodes variable=new Variablecodes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaof_t);
        getSupportActionBar().hide();

        Answerbtn2=findViewById(R.id.answerbtn2);
        base=findViewById(R.id.numbers6);
        height=findViewById(R.id.numbers5);
        basetxt=findViewById(R.id.basetxt);
        heighttxt=findViewById(R.id.heighttxt);
        resultxt=findViewById(R.id.answer3);

        Answerbtn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.answerbtn2:
                variable.setBase(Double.parseDouble(base.getText().toString()));
                variable.setHeight1(Double.parseDouble(height.getText().toString()));
                double solve = number.triangleArea(variable.getBase(),variable.getHeight1());
                resultxt.setText(""+solve);
                break;
        }

    }
}
