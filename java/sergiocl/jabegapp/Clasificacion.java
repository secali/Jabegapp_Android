package sergiocl.jabegapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Clasificacion extends AppCompatActivity {
    private Button enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);
        /*enviar=(Button)findViewById(R.id.button);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822") ;
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"jabegapp@outlook.es"});
                i.putExtra(Intent.EXTRA_SUBJECT,"JabegApp: Aportación de clasificación");
                i.putExtra(Intent.EXTRA_TEXT,"");
                startActivity(Intent.createChooser(i, "Seleccionar aplicación."));
            }
        });*/


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.down_in, R.animator.down_out);
        this.finish();
    }
}
