package sergiocl.jabegapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    private Button calendario, clasificacion, regatas, clubs, jabegas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        calendario=(Button)findViewById(R.id.b_calendario);
        clasificacion=(Button)findViewById(R.id.b_clasificacion);
        regatas=(Button)findViewById(R.id.b_proximas);
        clubs=(Button)findViewById(R.id.b_clubs);
        jabegas=(Button)findViewById(R.id.b_jabegas);

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Calendario_new.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        clasificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "NO DISPONIBLE", Toast.LENGTH_SHORT).show();
                /*if(isOnline()) {
                    Intent i = new Intent(Menu.this, Clasificacion.class);
                    startActivity(i);
                    overridePendingTransition(R.animator.up_in, R.animator.up_out);
                }else Toast.makeText(getApplicationContext(), "SIN CONEXION A INTERNET", Toast.LENGTH_SHORT).show();*/
            }
        });

        regatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, ProximasRegatas.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Clubs.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        jabegas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Jabegas.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);

            }
        });
    }


    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }

        return false;
    }

}
