package francis.com.contador;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

  contador=0;
         tv=(TextView)findViewById(R.id.tv_resultado);

    }
    //guardar estado
    protected void onSaveInstanceState(Bundle estado){
        super.onSaveInstanceState(estado);
        estado.putInt("posicion", contador);

    }
    //Recuperar estado
    protected void onRestoreInstanceState(Bundle estado){
        super.onRestoreInstanceState(estado);
        contador=estado.getInt("posicion");
        tv.setText(String.valueOf(contador));
    }


    public void incrementar(View vista){

        contador++;
        contar();
    }

    public void decrementar(View vista){

        contador--;
        contar();
    }

    public void resetear(View vista){

        contador=0;
        contar();
    }

    public void contar(){

        tv.setText("" + contador);
    }
}
