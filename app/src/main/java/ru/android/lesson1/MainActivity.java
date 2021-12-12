package ru.android.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameTV;
    private Button changeNameButton;
    private Button changeNameButtonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_next);

/*        nameTV = findViewById(R.id.name_text_view);
        changeNameButton = findViewById(R.id.change_name_button);
        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameTV.setText("Hello Sergio!");
                Toast.makeText(
                        MainActivity.this,
                        "Hello Sergio!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        changeNameButtonTwo = findViewById(R.id.change_name_button_two);
        changeNameButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameTV.setText("Goodbye Sergio!");
                Toast.makeText(
                        MainActivity.this,
                        "Goodbye Sergio!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });*/
    }
}