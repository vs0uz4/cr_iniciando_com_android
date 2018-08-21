package virtualsystems.com.br.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNum1;
    private EditText txtNum2;
    private Button btnSum;
    private Button btnSubtract;
    private Button btnMultiplication;
    private Button btnDivision;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);
        btnSum = (Button)findViewById(R.id.btnSum);
        btnSubtract = (Button)findViewById(R.id.btnSubtract);
        btnMultiplication = (Button)findViewById(R.id.btnMultiplication);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        lblResult = (TextView)findViewById(R.id.lblResult);

        btnSum.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Double num1R = 0.0;
        Double num2R = 0.0;
        Double result = 0.0;

        num1R = Double.parseDouble(txtNum1.getText().toString());
        num2R = Double.parseDouble(txtNum2.getText().toString());

        switch(view.getId()) {
            case R.id.btnSum:
                result = num1R + num2R;
                break;
            case R.id.btnSubtract:
                result = num1R - num2R;
                break;
            case R.id.btnMultiplication:
                result = num1R * num2R;
                break;
            case R.id.btnDivision:
                result = num1R / num2R;
                break;
        }

        lblResult.setText(result.toString());
    }
}
