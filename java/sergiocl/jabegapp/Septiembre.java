package sergiocl.jabegapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Septiembre extends AppCompatActivity {
    private Button milla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septiembre);

        milla=(Button)findViewById(R.id.b_millas);

        /*dip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.es/maps/dir//36.688002,-4.44277/@36.6880033,-4.443415,171m/data=!3m1!1e3!4m8!1m7!3m6!1s0x0:0x0!2zMzbCsDQxJzE2LjgiTiA0wrAyNiczNC4wIlc!3b1!8m2!3d36.688002!4d-4.44277");
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
