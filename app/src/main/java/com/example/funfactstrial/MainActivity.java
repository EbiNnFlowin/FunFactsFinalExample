package com.example.funfactstrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    private TextView factTextView;
    private Button showFactButton;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        constraintLayout= findViewById(R.id.funFactLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = colorWheel.getColor();

                factTextView.setText(factBook.getFact());
                constraintLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        });
    }
}
