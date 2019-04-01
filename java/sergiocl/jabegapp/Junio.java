package sergiocl.jabegapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Junio extends AppCompatActivity {
    private Button pedrega, mijas, fuengi,benal, cari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junio);

        pedrega=(Button)findViewById(R.id.b_pedregalejo);
        fuengi=(Button)findViewById(R.id.b_fuengi);
        mijas=(Button)findViewById(R.id.b_mijas);
        benal=(Button)findViewById(R.id.b_benal);
        cari=(Button)findViewById(R.id.b_cari);

        pedrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.720479,-4.373748/@36.7204808,-4.3746812,247m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQzJzEzLjciTiA0wrAyMicyNS41Ilc!3b1!8m2!3d36.720479!4d-4.373748");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        /*mijas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//Calle+la+Marina,+10,+29649+Mijas,+M%C3%A1laga/@36.5036162,-4.6777272,508m/data=!3m1!1e3!4m16!1m7!3m6!1s0xd731e30ee60db97:0x867342f9035f13d6!2sCalle+la+Marina,+10,+29649+Mijas,+M%C3%A1laga!3b1!8m2!3d36.5036162!4d-4.6777272!4m7!1m0!1m5!1m1!1s0xd731e30ee60db97:0x867342f9035f13d6!2m2!1d-4.6777272!2d36.5036162");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        fuengirola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.548749,-4.615011/@36.5487501,-4.6155582,156m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDMyJzU1LjUiTiA0wrAzNic1NC4wIlc!3b1!8m2!3d36.548749!4d-4.615011");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });

        benalmadena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.595063,-4.514217/@36.5950666,-4.5160649,489m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDM1JzQyLjIiTiA0wrAzMCc1MS4yIlc!3b1!8m2!3d36.595063!4d-4.514217");
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
