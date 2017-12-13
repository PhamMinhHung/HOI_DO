package lightofhope.hoido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    public void addControl(){
        btnStart = (Button) findViewById(R.id.btnStart);

    }

    public void addEvent() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(this, "", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(MainActivity.this, DangNhapDangKy.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}

