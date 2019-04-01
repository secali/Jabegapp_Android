package sergiocl.jabegapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Julio extends AppCompatActivity {
    private Button cala, palo,rincon, arana, torredelmar,torremol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_julio);

        cala=(Button)findViewById(R.id.b_cala);
        palo=(Button)findViewById(R.id.b_palo);
        rincon=(Button)findViewById(R.id.b_cala);
        arana=(Button)findViewById(R.id.b_arana);
        torredelmar=(Button)findViewById(R.id.b_torredel);
        torremol=(Button)findViewById(R.id.b_torremol);

        cala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.713517,-4.312256/@36.7135206,-4.314102,488m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQyJzQ4LjciTiA0wrAxOCc0NC4xIlc!3b1!8m2!3d36.713517!4d-4.312256");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        palo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.718278,-4.359246/@36.7182816,-4.3610905,488m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQzJzA1LjgiTiA0wrAyMSczMy4zIlc!3b1!8m2!3d36.718278!4d-4.359246");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        rincon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.7147778,-4.2881111/@36.714776,-4.3056207,5876m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQyJzUzLjIiTiA0wrAxNycxNy4yIlc!3b1!8m2!3d36.714774!4d-4.288099");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });


        arana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.712627,-4.324733/@36.7126292,-4.3258587,298m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQyJzQ1LjUiTiA0wrAxOScyOS4wIlc!3b1!8m2!3d36.712627!4d-4.324733");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        torredelmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.732924,-4.097357/@36.7329251,-4.0979042,145m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQzJzU4LjUiTiA0wrAwNSc1MC41Ilc!3b1!8m2!3d36.732924!4d-4.097357");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });


        /*torremol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.626779,-4.491769/@36.6267804,-4.4925006,194m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDM3JzM2LjQiTiA0wrAyOSczMC40Ilc!3b1!8m2!3d36.626779!4d-4.491769");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.animator.right_in, R.animator.right_out);
        this.finish();
    }
}
