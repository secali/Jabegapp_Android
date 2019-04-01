package sergiocl.jabegapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Calendario_new extends AppCompatActivity {
    private Button cal_mayo, cal_junio, cal_julio, cal_agosto, cal_sept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_new);

        cal_mayo=(Button)findViewById(R.id.cal_m);
        cal_junio=(Button)findViewById(R.id.cal_j);
        cal_julio=(Button)findViewById(R.id.cal_j2);
        cal_agosto=(Button)findViewById(R.id.cal_a);
        cal_sept=(Button)findViewById(R.id.cal_se);


        cal_mayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calendario_new.this, cal_Mayo.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        cal_junio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calendario_new.this, cal_Junio.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });


        cal_julio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calendario_new.this, cal_Junio.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        cal_agosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calendario_new.this, cal_Agosto.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });

        cal_sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Calendario_new.this, cal_Septiembre.class);
                startActivity(i);
                overridePendingTransition(R.animator.up_in, R.animator.up_out);
            }
        });
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.down_in, R.animator.down_out);
        this.finish();
    }


}
