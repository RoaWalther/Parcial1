package com.example.walther.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    private TextView ver;
    String ver_pantalla = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.mostrar_pantalla ();
    }

    public void mostrar_pantalla (){

        Bundle pantalla = getIntent().getExtras();// llama al resultado de otra Activity
        ver_pantalla = pantalla.getString("dato1");//toma el resultado de otra Activity y lo envia a nueb¿va variable "ver_pantalla"
        char viejo_caracter = 32; //32 es vacio un espacio vacio que encuentre en el resultado
       String viejo ="";
        String reemplazar_aString = String.valueOf(viejo_caracter);//reemplaza un caracter y lo transforma a String
        String nueva_caracter = "\n";
        String nueva_cadena = ver_pantalla.replace(viejo, nueva_caracter);
        System.out.println("por aca---------------------------"+nueva_cadena);
        ver = findViewById(R.id.pantalla);
        ver.setText(nueva_cadena);
    }

    
}
