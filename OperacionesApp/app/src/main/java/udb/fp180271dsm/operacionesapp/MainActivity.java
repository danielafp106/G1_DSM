package udb.fp180271dsm.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de componentes para enlazarlos en onCreate
    private EditText txt1;
    private EditText txt2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazando con finViewbyId
        txt1= findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        tv1= findViewById(R.id.tv1);
    }

    //Este método se ejecutará cuando se presione el botón sumar
    public void sumar(View view) {
        String valor1=txt1.getText().toString();
        String valor2=txt2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int suma = n1+n2;

        String resu = String.valueOf(suma);
        tv1.setText(resu);
    }

    //Este método se ejecutará cuando se presione el botón restar
    public void restar(View view) {
        String valor1=txt1.getText().toString();
        String valor2=txt2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int resta = n1-n2;

        String resu = String.valueOf(resta);
        tv1.setText(resu);
    }

    //Este método se ejecutará cuando se presione el botón multiplicar
    public void multiplicar(View view) {
        String valor1=txt1.getText().toString();
        String valor2=txt2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int multi = n1*n2;

        String resu = String.valueOf(multi);
        tv1.setText(resu);
    }

    //Este método se ejecutará cuando se presione el botón dividir
    public void dividir(View view) {
        String valor1=txt1.getText().toString();
        String valor2=txt2.getText().toString();

        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);

        int division = n1/n2;

        String resu = String.valueOf(division);
        tv1.setText(resu);
    }
}