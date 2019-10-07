package mx.edu.itsmt.angelus.superheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btn,btn1,btn2,btn3,btn4;
    private final int[] BOTONES ={R.id.boton1,R.id.boton2,R.id.boton3,R.id.boton4};

    public  void vincular() {

        for (int i = 0; i <BOTONES.length ; i++) {
            btn = findViewById(BOTONES[i]);
            btn.setOnClickListener(this);
        }

        /*btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincular();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.boton1:
                intent = new Intent(MainActivity.this,DetalleSuperheroe.class);
                intent.putExtra("BOTON",1);
                startActivity(intent);
                Toast.makeText(this,"bt1",Toast.LENGTH_LONG).show();
                break;
            case R.id.boton2:
                intent = new Intent(MainActivity.this,DetalleSuperheroe.class);
                intent.putExtra("BOTON",2);
                startActivity(intent);
                Toast.makeText(this,"bt2",Toast.LENGTH_LONG).show();
                break;
            case R.id.boton3:
                intent = new Intent(MainActivity.this,DetalleSuperheroe.class);
                intent.putExtra("BOTON",3);
                startActivity(intent);
                Toast.makeText(this,"bt3",Toast.LENGTH_LONG).show();
                break;
            case R.id.boton4:
                intent = new Intent(MainActivity.this,DetalleSuperheroe.class);
                intent.putExtra("BOTON",4);
                startActivity(intent);
                Toast.makeText(this,"bt4",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
