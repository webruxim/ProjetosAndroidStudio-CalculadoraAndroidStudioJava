package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    String str1, str2 = "0";
    int strInt = 0;
    double strDouble = 0;
    String tipoOperacao = "";
    Boolean operacao = false;

    TextView expressao;

    Button
            buttonIgual, buttonBack, buttonZero, buttonPonto,
            buttonSubtrair, buttonTres,buttonDois, buttonUm,
            buttonSomar, buttonSeis, buttonCinco, buttonQuatro,
            buttonMultiplicar, buttonNove, buttonOito, buttonSete,
            buttonDividir, buttonCE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expressao = (TextView) findViewById(R.id.expressao);

        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonPonto = (Button) findViewById(R.id.buttonPonto);
        buttonSubtrair = (Button) findViewById(R.id.buttonSubtrair);
        buttonDois = (Button) findViewById(R.id.buttonDois);
        buttonTres = (Button) findViewById(R.id.buttonTres);
        buttonUm = (Button) findViewById(R.id.buttonUm);
        buttonSomar = (Button) findViewById(R.id.buttonSomar);
        buttonSeis = (Button) findViewById(R.id.buttonSeis);
        buttonCinco = (Button) findViewById(R.id.buttonCinco);
        buttonQuatro = (Button) findViewById(R.id.buttonQuatro);
        buttonMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        buttonNove = (Button) findViewById(R.id.buttonNove);
        buttonOito = (Button) findViewById(R.id.buttonOito);
        buttonSete = (Button) findViewById(R.id.buttonSete);
        buttonDividir = (Button) findViewById(R.id.buttonDividir);
        buttonCE = (Button) findViewById(R.id.buttonCE);

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = "0";
                str2 = "0";
                operacao = false;
                tipoOperacao = "";
                expressao.setText("0");
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonZero.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")){
                            str1 = buttonZero.getText().toString();
                            expressao.setText(str1);
                        }else {
                            str1 = str1 + buttonZero.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")){
                        str2 = buttonZero.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonZero.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }

                }
            }
        });

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonUm.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonUm.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonUm.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonUm.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonUm.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonDois.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonDois.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonDois.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonDois.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonDois.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonTres.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonTres.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonTres.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonTres.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonTres.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonQuatro.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonQuatro.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonQuatro.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonQuatro.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonQuatro.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonCinco.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonCinco.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonCinco.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonCinco.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonCinco.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonSeis.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonSeis.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonSeis.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonSeis.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonSeis.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonSete.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonSete.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonSete.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonSete.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonSete.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonOito.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonOito.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonOito.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonOito.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonOito.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(expressao.getText().equals("0")){
                        str1 = buttonNove.getText().toString();
                        expressao.setText(str1);
                    } else {
                        if(str1.equals("0")) {
                            str1 = buttonNove.getText().toString();
                            expressao.setText(str1);
                        } else {
                            str1 = str1 + buttonNove.getText().toString();
                            expressao.setText(str1);
                        }
                    }
                } else {
                    if(str2.equals("0")) {
                        str2 = buttonNove.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    } else {
                        str2 = str2 + buttonNove.getText().toString();
                        expressao.setText(str1 + tipoOperacao + str2);
                    }
                }
            }
        });

        buttonPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao == false) {
                    if(str1.contains(".")){

                    } else {
                        if (expressao.getText().equals("0")) {
                            str1 = buttonPonto.getText().toString();
                            expressao.setText(str1);
                        } else {
                            if (str1.equals("0")) {
                                str1 = buttonPonto.getText().toString();
                                expressao.setText(str1);
                            } else {
                                str1 = str1 + buttonPonto.getText().toString();
                                expressao.setText(str1);
                            }
                        }
                    }
                } else {
                    if(str2.contains(".")){

                    } else {
                        if (str2.equals("0")) {
                            str2 = buttonPonto.getText().toString();
                            expressao.setText(str1 + tipoOperacao + str2);
                        } else {
                            str2 = str2 + buttonPonto.getText().toString();
                            expressao.setText(str1 + tipoOperacao + str2);
                        }
                    }
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao == false){
                    if(str1.length() > 0) {
                        String str_sub = str1.substring(0, str1.length() - 1);
                        expressao.setText(str_sub);
                    } else {
                        expressao.setText("0");
                    }
                } else {
                    if(str2.length() > 0) {
                        String str_sub = str2.substring(0, str2.length() - 1);
                        expressao.setText(str_sub);
                    } else {
                        expressao.setText("0");
                    }
                }
            }
        });

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = true;
                if(str2.equals("0")){
                    tipoOperacao = buttonDividir.getText().toString();
                }
                fazerOperacao(buttonDividir.getText().toString());
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = true;
                if(str2.equals("0")){
                    tipoOperacao = buttonMultiplicar.getText().toString();
                }
                fazerOperacao(buttonMultiplicar.getText().toString());
            }
        });

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = true;
                if(str2.equals("0")){
                    tipoOperacao = buttonSomar.getText().toString();
                }
                fazerOperacao(buttonSomar.getText().toString());
            }
        });

        buttonSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = true;
                if(str2.equals("0")){
                    tipoOperacao = buttonSubtrair.getText().toString();
                }
                fazerOperacao(buttonSubtrair.getText().toString());
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str2.equals("0")){
                    operacao = false;
                    tipoOperacao = "";
                }
                fazerOperacao(buttonIgual.getText().toString());
                operacao = false;

            }
        });
    }

    public void fazerOperacao(String pTipoOperacao){
        if (tipoOperacao.equals("")) {
            tipoOperacao = pTipoOperacao;
            if(str2.equals("0") && tipoOperacao.equals("=")){
                expressao.setText(str1);
                tipoOperacao = "";
            } else {
                expressao.setText(str1 + tipoOperacao);
            }
        } else {
            if (str2.equals("0")) {
                expressao.setText(str1 + tipoOperacao);
            } else {
                switch (tipoOperacao) {
                    case "/":
                        tipoOperacao = "/";
                        if((str1.equals("0")) || (str2.equals("0"))){
                            Toast.makeText(MainActivity.this, "Não existe divisão por zero (0)", LENGTH_LONG).show();
                            expressao.setText("0");
                            operacao = false;
                            tipoOperacao = "";
                            str1 = "0";
                            str2 = "0";
                        } else {
                            str1 = String.valueOf(Double.parseDouble(str1) / Double.parseDouble(str2));

                            try {
                                strDouble = Double.parseDouble(str1);
                            }catch (NumberFormatException e){

                            }
                            try {
                                strInt = (int) strDouble;
                            }catch (NumberFormatException e){

                            }

                            if(strInt == strDouble){
                                str1 = String.valueOf(strInt);
                            }

                            str2 = "0";
                            if(pTipoOperacao.equals("=")){
                                expressao.setText(str1);
                            } else {
                                expressao.setText(str1 + pTipoOperacao);
                                tipoOperacao = pTipoOperacao;
                            }
                        }
                        break;
                    case "*":
                        str1 = String.valueOf(Double.parseDouble(str1) * Double.parseDouble(str2));

                        try {
                            strDouble = Double.parseDouble(str1);
                        }catch (NumberFormatException e){

                        }
                        try {
                            strInt = (int) strDouble;
                        }catch (NumberFormatException e){

                        }

                        if(strInt == strDouble){
                            str1 = String.valueOf(strInt);
                        }

                        str2 = "0";
                        if(pTipoOperacao.equals("=")){
                            expressao.setText(str1);
                        } else {
                            expressao.setText(str1 + pTipoOperacao);
                            tipoOperacao = pTipoOperacao;
                        }
                        break;
                    case "+":
                        str1 = String.valueOf(Double.parseDouble(str1) + Double.parseDouble(str2));

                        try {
                            strDouble = Double.parseDouble(str1);
                        }catch (NumberFormatException e){

                        }
                        try {
                            strInt = (int) strDouble;
                        }catch (NumberFormatException e){

                        }

                        if(strInt == strDouble){
                            str1 = String.valueOf(strInt);
                        }

                        str2 = "0";
                        if(pTipoOperacao.equals("=")){
                            expressao.setText(str1);
                        } else {
                            expressao.setText(str1 + pTipoOperacao);
                            tipoOperacao = pTipoOperacao;
                        }
                        break;
                    case "-":
                        str1 = String.valueOf(Double.parseDouble(str1) - Double.parseDouble(str2));

                        try {
                            strDouble = Double.parseDouble(str1);
                        }catch (NumberFormatException e){

                        }
                        try {
                            strInt = (int) strDouble;
                        }catch (NumberFormatException e){

                        }

                        if(strInt == strDouble){
                            str1 = String.valueOf(strInt);
                        }

                        str2 = "0";
                        if(pTipoOperacao.equals("=")){
                            expressao.setText(str1);
                        } else {
                            expressao.setText(str1 + pTipoOperacao);
                            tipoOperacao = pTipoOperacao;
                        }
                        break;
                    case "=":
                        switch (tipoOperacao) {
                            case "/":
                                if((str1.equals("0")) || (str2.equals("0"))){
                                    Toast.makeText(MainActivity.this, "Não existe divisão por zero (0)", LENGTH_LONG).show();
                                    expressao.setText("0");
                                    operacao = false;
                                    tipoOperacao = "";
                                    str1 = "0";
                                    str2 = "0";
                                } else {
                                    str1 = String.valueOf(Double.parseDouble(str1) / Double.parseDouble(str2));

                                    try {
                                        strDouble = Double.parseDouble(str1);
                                    }catch (NumberFormatException e){

                                    }
                                    try {
                                        strInt = (int) strDouble;
                                    }catch (NumberFormatException e){

                                    }

                                    if(strInt == strDouble){
                                        str1 = String.valueOf(strInt);
                                    }

                                    str2 = "0";
                                    strInt = 0;
                                    strDouble = 0;
                                    expressao.setText(str1);
                                    tipoOperacao = "";
                                    operacao = false;
                                }
                                break;
                            case "*":
                                str1 = String.valueOf(Double.parseDouble(str1) * Double.parseDouble(str2));

                                try {
                                    strDouble = Double.parseDouble(str1);
                                }catch (NumberFormatException e){

                                }
                                try {
                                    strInt = (int) strDouble;
                                }catch (NumberFormatException e){

                                }

                                if(strInt == strDouble){
                                    str1 = String.valueOf(strInt);
                                }

                                str2 = "0";
                                expressao.setText(str1);
                                tipoOperacao = "";
                                operacao = false;
                                break;
                            case "+":
                                str1 = String.valueOf(Double.parseDouble(str1) + Double.parseDouble(str2));

                                try {
                                    strDouble = Double.parseDouble(str1);
                                }catch (NumberFormatException e){

                                }
                                try {
                                    strInt = (int) strDouble;
                                }catch (NumberFormatException e){

                                }

                                if(strInt == strDouble){
                                    str1 = String.valueOf(strInt);
                                }

                                str2 = "0";
                                expressao.setText(str1);
                                tipoOperacao = "";
                                operacao = false;
                                break;
                            case "-":
                                str1 = String.valueOf(Double.parseDouble(str1) - Double.parseDouble(str2));

                                try {
                                    strDouble = Double.parseDouble(str1);
                                }catch (NumberFormatException e){

                                }
                                try {
                                    strInt = (int) strDouble;
                                }catch (NumberFormatException e){

                                }

                                if(strInt == strDouble){
                                    str1 = String.valueOf(strInt);
                                }

                                str2 = "0";
                                expressao.setText(str1);
                                tipoOperacao = "-";
                                operacao = false;
                                break;
                        }
                        break;
                }

            }
        }
    }
}