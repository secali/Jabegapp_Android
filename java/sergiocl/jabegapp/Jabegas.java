package sergiocl.jabegapp;

import android.app.ListActivity;
import android.database.MatrixCursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Jabegas extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] columnasBD = new String[] {"_id", "imagen", "textoSuperior", "textoInferior","otroTexto"};
        MatrixCursor cursor = new MatrixCursor(columnasBD);


        cursor.addRow(new Object[] {"0", R.drawable.almoguera, "Almoguera.", "Botadura: Mayo de 1999.",  "Peso: 858kg."});
        cursor.addRow(new Object[] {"1", R.drawable.araceli, "Araceli.", "Botadura: Mayo de 2008."," Peso: 1044kg."});
        cursor.addRow(new Object[] {"2", R.drawable.chora, "Chora.", "Botadura: Febrero de 2013."," Peso: 510kg."});
        cursor.addRow(new Object[] {"3", R.drawable.cordela, "Cordela.", "Botadura: Julio de 2004.","Peso: 800kg."});
        cursor.addRow(new Object[] {"4", R.drawable.fogonera, "Fogonera.", "Botadura: Abril de 2013."," Peso: 814kg."});
        cursor.addRow(new Object[] {"5", R.drawable.marea, "Marea.", "Botadura: Abril de 2016."," Peso: ¿?kg."});
        cursor.addRow(new Object[] {"6", R.drawable.mijena, "Mijeña.", "Botadura: Mayo de 2014."," Peso: 480kg."});
        cursor.addRow(new Object[] {"7", R.drawable.rompeola, "Rompeola.", "Botadura: Julio de 2010."," Peso: 499kg."});
        cursor.addRow(new Object[] {"8", R.drawable.sanandres, "San Andrés.", "Botadura: Agosto de 1998."," Peso: 846kg."});
        cursor.addRow(new Object[] {"9", R.drawable.traya, "Traya.", "Botadura: Mayo de 2003."," Peso: 810kg."});
        cursor.addRow(new Object[] {"10", R.drawable.vendaval, "Vendaval.", "Botadura: Julio de 2012."," Peso: 600kg."});
        cursor.addRow(new Object[] {"11", R.drawable.victoria, "Victoria.", "Botadura: Agosto de 1991."," Peso: 868kg."});
        cursor.addRow(new Object[] {"12", R.drawable.vgcarmen, "Virgen del Carmen.", "Botadura: Agosto de 1984."," Peso: 960kg."});


        //Añadimos los datos al Adapter y le indicamos donde dibujar cada dato en la fila del Layout
        String[] desdeEstasColumnas = {"imagen", "textoSuperior", "textoInferior","otroTexto"};
        int[] aEstasViews = {R.id.imageView_imagen, R.id.textView_superior, R.id.textView_inferior, R.id.textView_otro};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.entradas_jabegas, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //    finish();
        overridePendingTransition(R.animator.down_in, R.animator.down_out);
        this.finish();
    }
}
