package sergiocl.jabegapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cal_Mayo extends AppCompatActivity {
    private Button b_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal__mayo);

        b_siguiente=(Button)findViewById(R.id.b_sig);

        b_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cal_Mayo.this, cal_Junio.class);
                startActivity(i);
                overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
            }
        });

        }
    }



