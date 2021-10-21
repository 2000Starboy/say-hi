package youness.tp_sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSayHi = findViewById(R.id.buttonSayHi);
        TextView textViewdisplay = findViewById(R.id.textViewdisplay);
        EditText editTextName = findViewById(R.id.editTextName);

        buttonSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                if (name.isEmpty())
                    textViewdisplay.setText("Please Provide A Name!");
                    else
                textViewdisplay.setText("hello " + name);
                editTextName.setText("");
            }
        });

    }
}