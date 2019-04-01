package sergiocl.jabegapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProximasRegatas extends AppCompatActivity {

    private Button mayo,junio,julio,agosto,septiembre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximas_regatas);

        mayo=(Button)findViewById(R.id.b_mayo);
        junio=(Button)findViewById(R.id.b_junio);
        julio=(Button)findViewById(R.id.b_julio);
        agosto=(Button)findViewById(R.id.b_agosto);
        septiembre=(Button)findViewById(R.id.b_septiembre);


        mayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProximasRegatas.this, Mayo.class);
                startActivity(i);
                overridePendingTransition(R.animator.left_in, R.animator.left_out);
            }
        });

        junio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProximasRegatas.this, Junio.class);
                startActivity(i);
                overridePendingTransition(R.animator.left_in, R.animator.left_out);
            }
        });

        julio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProximasRegatas.this, Julio.class);
                startActivity(i);
                overridePendingTransition(R.animator.left_in, R.animator.left_out);
            }
        });

        agosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProximasRegatas.this, Agosto.class);
                startActivity(i);
                overridePendingTransition(R.animator.left_in, R.animator.left_out);
            }
        });

        septiembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProximasRegatas.this, Septiembre.class);
                startActivity(i);
                overridePendingTransition(R.animator.left_in, R.animator.left_out);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //    finish();
        overridePendingTransition(R.animator.down_in, R.animator.down_out);
    }
}
