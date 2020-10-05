package com.e.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view){
        TextView txtName =findViewById(R.id.txtName);
        EditText editName = findViewById(R.id.edtName);
        txtName.setText("Name:"+editName.getText().toString());

        TextView txtAge =findViewById(R.id.txtAge);
        EditText editAge = findViewById(R.id.edtAge);
        txtAge.setText("Age:"+editAge.getText().toString());

        TextView txtEmail =findViewById(R.id.txtEmail);
        EditText editEmail = findViewById(R.id.edtEmail);
        txtEmail.setText("Email:"+editEmail.getText().toString());
    }
}
