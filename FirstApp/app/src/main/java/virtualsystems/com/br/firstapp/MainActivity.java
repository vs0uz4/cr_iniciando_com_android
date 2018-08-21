package virtualsystems.com.br.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String msg = "C Android -> ";
    private EditText txtName;
    private TextView lblMessage;
    private Button btnDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText)findViewById(R.id.txtName);
        lblMessage = (TextView)findViewById(R.id.lblMessage);
        btnDo = (Button)findViewById(R.id.btnDo);

        /* Java 8 */
        btnDo.setOnClickListener((View view) -> {
            if (txtName.getText().toString().matches("")){
                txtName.setError("The Name Field Cannot be Empty!");
                return;
            }

            if (!txtName.getText().toString().matches("")){
                lblMessage.setText("Hello, " + txtName.getText());
                Toast.makeText(this, "bntDo Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        /* Java 7 */
        /*
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "Clicked from Listener event");
            }
        });
        */
    }
}
