package ni.edu.uca.acceso_a_datos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaActivity.this,FormActivity.class);
                startActivityForResult(intent, FormActivity.FORM_KEY);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case FormActivity.FORM_KEY:
                if (resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    String name = bundle.getString(FormActivity.FORM_KEY_NOMBRE);
                   int age = bundle.getInt(FormActivity.FORM_KEY_EDAD);
                    guardar(name,age);
                }
                }
        }

    private void guardar(String name, int age) {
        Toast.makeText(this, String.format("%s %s",name,String.valueOf(age)),Toast.LENGTH_LONG).show();
    //TODO: guardar en la base de datos.
    }
}

