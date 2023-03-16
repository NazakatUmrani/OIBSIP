package com.nazakatumrani.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public TextView textView;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.convertButton);
        textView = findViewById(R.id.resultText);
        editText = findViewById(R.id.inputField);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();
        textView.setText("Assalam u alaikum");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Integer.toString(100 * Integer.parseInt(editText.getText().toString())));
            }
        });
    }
}