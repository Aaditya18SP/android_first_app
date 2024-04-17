package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitdetails(View view) {
        EditText etItemname = findViewById(R.id.etItemname);
        EditText etItemlostdate = findViewById(R.id.etItemlostdate);
        EditText etItemdesc = findViewById(R.id.etItemdesc);
        ImageView imageView = findViewById(R.id.imageView);
        TextView tvItemnameanddate = findViewById(R.id.tvItemnameanddate);
        TextView tvItemdesc = findViewById(R.id.tvItemdesc);

        tvItemnameanddate.setText("Item lost is: " + etItemname.getText().toString() + " on " + etItemlostdate.getText().toString());
        tvItemdesc.setText("Item details are :" + etItemdesc.getText().toString());

    }

}
