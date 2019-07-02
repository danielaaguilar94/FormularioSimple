package com.example.formulariosimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultado = findViewById(R.id.textViewResultado);
        resultado.setText("Aquí se verá el resultado");

        Button botonUsuario = findViewById(R.id.botonEnviar);
        botonUsuario.setOnClickListener( botonListener );
    }
    private View.OnClickListener botonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText usuario = findViewById(R.id.editTextUsuario);
            String valorUsuario = usuario.getText().toString();

            TextView resultado = findViewById(R.id.textViewResultado);
            resultado.setText(valorUsuario);

        }
    };

}
