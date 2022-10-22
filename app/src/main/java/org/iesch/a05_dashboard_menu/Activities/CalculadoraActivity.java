package org.iesch.a05_dashboard_menu.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.iesch.a05_dashboard_menu.databinding.ActivityCalculadoraBinding;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActivityCalculadoraBinding binding = ActivityCalculadoraBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Button addBtn = binding.addButton;
        Button subBtn = binding.substractButton;
        Button mulBtn = binding.multiplyButton;
        Button divBtn = binding.divideButton;

        TextView result = binding.result;
        EditText firstNum = binding.firstNumberEt;
        EditText secondNum = binding.secondNumberEt;

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 + numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT).show();
                }
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 - numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 * numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT).show();
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 / numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}