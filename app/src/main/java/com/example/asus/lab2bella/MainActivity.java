package com.example.asus.lab2bella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button displayButton;
    private TextView tvMessage;
    private EditText etName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        tvMessage = (TextView) findViewById (R.id.textView);
        etName = (EditText) findViewById(R.id.editText);
    }
    public void displayText (View view) {

        //display text obtain from getText
        String text = etName.getText().toString();
        tvMessage.setText("WELCOME  "   + text);

        //show toast
        Toast toast = Toast.makeText(this, "WELCOME " + text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void ResetText(View view)
    {
        Toast toast =Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();

        etName.getText().clear();

    }
}
