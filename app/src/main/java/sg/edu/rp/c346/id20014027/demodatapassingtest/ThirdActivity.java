package sg.edu.rp.c346.id20014027.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswerQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswerQ2 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("char", 'a');
        tvAnswerQ2.setText("Character value received is: " + character);

    }
}