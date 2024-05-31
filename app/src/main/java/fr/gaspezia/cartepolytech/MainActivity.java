package fr.gaspezia.cartepolytech;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        findViewById(R.id.polytech_orleans).setOnClickListener(v -> textView.setText("Polytech Orléans"));
        findViewById(R.id.polytech_nantes).setOnClickListener(v -> textView.setText("Polytech Nantes"));
        findViewById(R.id.polytech_nancy).setOnClickListener(v -> textView.setText("Polytech Nancy"));
        findViewById(R.id.polytech_lille).setOnClickListener(v -> textView.setText("Polytech Lille"));
    }
}