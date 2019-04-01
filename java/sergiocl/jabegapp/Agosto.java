package sergiocl.jabegapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Agosto extends AppCompatActivity {
    private Button malaga, diput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agosto);

        malaga=(Button)findViewById(R.id.b_malaga);
        diput=(Button)findViewById(R.id.b_diputacion);

        malaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.718138,-4.415054/@36.7181406,-4.4163561,344m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQzJzA1LjMiTiA0wrAyNCc1NC4yIlc!3b1!8m2!3d36.718138!4d-4.415054");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        diput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.688002,-4.44277/@36.6880033,-4.443415,171m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQxJzE2LjgiTiA0wrAyNiczNC4wIlc!3b1!8m2!3d36.688002!4d-4.44277");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        /*cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.503764,-4.677031/@36.5037658,-4.6779539,245m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDMwJzEzLjYiTiA0wrA0MCczNy4zIlc!3b1!8m2!3d36.503764!4d-4.677031");
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
