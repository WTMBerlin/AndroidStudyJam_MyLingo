package wtmberlinstudyjam.mylingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String SOLUTION = "Wir lieben codieren";

    private EditText input;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    public void onButton1Click(View view) {
        input.append(button1.getText() + " ");
    }

    public void onButton2Click(View view) {
        input.append(button2.getText() + " ");
    }

    public void onButton3Click(View view) {
        input.append(button3.getText() + " ");
    }

    public void onCheckButtonClicked(View view) {
        if (!input.getText().toString().trim().equals(SOLUTION)) {
            input.setText("");
            Toast.makeText(this, R.string.try_again, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.success, Toast.LENGTH_SHORT).show();
        }
    }

}
