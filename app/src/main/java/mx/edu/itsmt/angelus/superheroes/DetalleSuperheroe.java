package mx.edu.itsmt.angelus.superheroes;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleSuperheroe extends AppCompatActivity {

    Fragment misFragmetos[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_superheroe);

        misFragmetos = new Fragment[4];
        misFragmetos[0]=new SupermanFragment();
        misFragmetos[1]=new WonderFragment();
        misFragmetos[2]=new BatmanFragment();
        misFragmetos[3]=new FlashFragment();

        Bundle intent = getIntent().getExtras();
        int boton = intent.getInt("BOTON");

        FragmentManager miManejador = getFragmentManager();
        FragmentTransaction miTransaction = miManejador.beginTransaction();
        switch (boton){
            case 1:
                miTransaction.replace(R.id.contenedorDetalle,misFragmetos[0]);
                miTransaction.commit();
                break;
            case 2:
                miTransaction.replace(R.id.contenedorDetalle,misFragmetos[1]);
                miTransaction.commit();
                break;
            case 3:
                miTransaction.replace(R.id.contenedorDetalle,misFragmetos[2]);
                miTransaction.commit();
                break;
            case 4:
                miTransaction.replace(R.id.contenedorDetalle,misFragmetos[3]);
                miTransaction.commit();
                break;
        }

    }
}
