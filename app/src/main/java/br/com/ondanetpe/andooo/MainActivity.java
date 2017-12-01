package br.com.ondanetpe.andooo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert beer = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selectCerveja(View view){
        TextView textoExibir = (TextView) findViewById(R.id.textoAExibir);
        Spinner listaCeva = (Spinner) findViewById(R.id.listarCervejasSpinner);
        String recebeValorSpinner = String.valueOf(listaCeva.getSelectedItem());


        List<String> brandsList = beer.getTextoExibir(recebeValorSpinner);
        StringBuilder concatenarStringerMetodoJavaPuro = new StringBuilder();
        for (String brand: brandsList) {

            concatenarStringerMetodoJavaPuro.append(brand).append('\n');

        }

        textoExibir.setText(concatenarStringerMetodoJavaPuro);



    }




    }



