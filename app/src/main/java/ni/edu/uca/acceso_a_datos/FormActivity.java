package ni.edu.uca.acceso_a_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

public static final int FORM_KEY =1;
    public static final String FORM_KEY_EDAD = "Edad";
    public static final  String FORM_KEY_NOMBRE= "Nombre";

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        button=(Button) findViewById(R.id.btnAceptar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarYterminar();
            }
        });
    }

    private void validarYterminar() {
        EditText editText = (EditText) findViewById(R.id.editTextNombre);
        EditText editTextEdad = (EditText) findViewById(R.id.editEdad);
        String nombre = editText.getText().toString();
        String edad = editTextEdad.getText().toString();
        int valedad = Integer.valueOf(edad);
        if(nombre.length()>2 &&  valedad>0){
            Intent intent = new Intent();
            intent.putExtra(FORM_KEY_NOMBRE,nombre);
            intent.putExtra(FORM_KEY_EDAD,edad);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
    //TODO: finalizar actividad y pasar parametros.
}
