package sergiocl.jabegapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.MatrixCursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Clubs extends ListActivity {

    private String sitios [] ={"000","https://goo.gl/Lzdw3N","000","https://goo.gl/K2OJhJ","http://www.laespailla.es/","https://goo.gl/uwMCjQ",
            "https://goo.gl/VMGRWU","https://goo.gl/xnn5jT","https://goo.gl/Tvygqq","https://goo.gl/m3DJC5","https://goo.gl/s73j4x",
            "https://goo.gl/XxN7zf","https://goo.gl/MUPEz3","https://goo.gl/cE8k7l"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] columnasBD = new String[] {"_id", "imagen", "textoSuperior"/*, "textoInferior"*/};
        MatrixCursor cursor = new MatrixCursor(columnasBD);

        cursor.addRow(new Object[] {"0", R.drawable.pedregalejo, "Asociación de Remo y Pala Pedregalejo."/*, "..."*/});
        cursor.addRow(new Object[] {"1", R.drawable.rincon, "Club de Bogadores."/*, "..."*/});
        cursor.addRow(new Object[] {"2", R.drawable.barcaza, "La Barcaza."/*, "..."*/});
        cursor.addRow(new Object[] {"3", R.drawable.cala, "Club de Remo La Cala del Moral."/*, "..."*/});
        cursor.addRow(new Object[] {"4", R.drawable.espailla, " Club Deportivo La Espaílla."/*, "..."*/});
        cursor.addRow(new Object[] {"5", R.drawable.huelin, "Club de Remo Huelin."/*, "..."*/});
        cursor.addRow(new Object[] {"6", R.drawable.medit, "Real Club Mediterráneo."/*, "..."*/});
        cursor.addRow(new Object[] {"7", R.drawable.rebalaje, "Club Deportivo Rebalaje." /*,"..."*/});
        cursor.addRow(new Object[] {"8", R.drawable.andres, "Club Deportivo Remo San Andrés."/*, "..."*/});
        cursor.addRow(new Object[] {"9", R.drawable.torre, "Asociación de Remo Faro de Torre del Mar."/*, "..."*/});
        cursor.addRow(new Object[] {"10", R.drawable.carihuela, "Club de Remo y Pala Tradicional - La Carihuela."/*, "..."*/});
        cursor.addRow(new Object[] {"11", R.drawable.torremolinos, "Asociación de Remo y Pala tradicional Torremolinos."/*, "..."*/});
        cursor.addRow(new Object[] {"12", R.drawable.arana, "Club Deportivo Remo La Araña."/*, "..."*/});
        cursor.addRow(new Object[] {"13", R.drawable.calaburra, "Asociación Remo Faro de Calaburras.",/* "..."*/});


        //Añadimos los datos al Adapter y le indicamos donde dibujar cada dato en la fila del Layout
        String[] desdeEstasColumnas = {"imagen", "textoSuperior"/*, "textoInferior"*/};
        int[] aEstasViews = {R.id.imageView_imagen_c, R.id.textView_superior_c/*, R.id.textView_inferior_c*/};
        SimpleCursorAdapter adapter_c = new SimpleCursorAdapter(this, R.layout.entradas_clubs, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado_c = getListView();
        listado_c.setAdapter(adapter_c);
    }

    @Override
    public void onListItemClick(ListView lista, View view, int posicion, long id) {
        if (isOnline()) {
            String url = sitios[(int) id];
            if (url != "000") {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            } else
                Toast.makeText(getApplicationContext(), "ESTE CLUB NO TIENE INFORMACIÓN", Toast.LENGTH_SHORT).show();
        }else Toast.makeText(getApplicationContext(), "SIN CONEXION A INTERNET", Toast.LENGTH_SHORT).show();
    }




    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }

        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.down_in, R.animator.down_out);
        this.finish();
    }
}
