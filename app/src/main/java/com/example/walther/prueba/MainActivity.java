package com.example.walther.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText et_contenido, et_caracter;
    String contenido = "", caracter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutar(View v) {
        try {

            et_contenido = findViewById(R.id.contenido);
            et_caracter = findViewById(R.id.caracter);
            contenido = et_contenido.getText().toString().toLowerCase();
            caracter = et_caracter.getText().toString().toLowerCase();

            if (contenido.length() < 10 && caracter.length() >=0) {
                Toast.makeText(this, "El valor del contedido debe ser mayor a 10 caracteres ", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ingrese un valor ", Toast.LENGTH_SHORT).show();
            }
            else if (contenido.length() > 30  ) {
                Toast.makeText(this, "el contenido no debe ser mayor a 30 caracteres", Toast.LENGTH_SHORT).show();
            }

            else if (!contenido.isEmpty() && !caracter.isEmpty()) {
                String nueva_caracter = "";
                String nueva_cadena = contenido.replace(caracter, nueva_caracter);
                Intent intent= new Intent(MainActivity.this,Menu.class);
                intent.putExtra("dato1",nueva_cadena);
                startActivity(intent);

            } else {
                Toast.makeText(this,"error ingrese un valor",Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

/*if (contenido.length() < 10) {
                Toast.makeText(this, "El valor del contedido debe ser mayor a 10 caracteres", Toast.LENGTH_SHORT).show();
            }
            if (contenido.length() > 30) {
                Toast.makeText(this, "el contenido no debe ser mayor a 50 caracteres", Toast.LENGTH_SHORT).show();
            }
        }*/

