package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbf, rbm;
    Button btSelecionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbf = findViewById(R.id.radioButtonFeminino);
        rbm = findViewById(R.id.radioButtonMasculino);

        btSelecionar = findViewById(R.id.buttonSelecionar);

        btSelecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rbf.isChecked())
                    Toast.makeText(getApplicationContext(), "Sexo Feminino", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Sexo Masculino", Toast.LENGTH_LONG).show();
            }
        });
    }
}
