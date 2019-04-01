package sergiocl.jabegapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class cal_Septiembre extends AppCompatActivity {
    private Button b_anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal__sept);

        b_anterior=(Button)findViewById(R.id.b_ant);

        b_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cal_Septiembre.this, cal_Agosto.class);
                startActivity(i);
                overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
            }
        });
    }
}
