package com.sharkBytesLab.goCalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sharkBytesLab.goCalculator.databinding.ActivityMainBinding;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "0");

            }
        });

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "1");

            }
        });

        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "2");

            }
        });

        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "3");

            }
        });

        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "4");

            }
        });

        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "5");

            }
        });

        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "6");

            }
        });

        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "7");

            }
        });

        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "8");

            }
        });

        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "9");

            }
        });

        binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + ".");

            }
        });

        binding.btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                binding.inputText.setText("");
                binding.outputText.setText("");

            }
        });

        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "-");

            }
        });

        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "+");

            }
        });

        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "x");

            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();
                binding.inputText.setText(data + "/");

            }
        });

        binding.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = binding.inputText.getText().toString();

                data = data.replaceAll("x","*");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalresult = "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalresult=rhino.evaluateString(scriptable, data, "Javascript",1, null).toString();

                binding.outputText.setText(finalresult);


            }
        });

    }
}