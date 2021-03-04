package com.example.botonint2; //aqui muestra a que paquete pertenece esta actividad

import androidx.appcompat.app.AppCompatActivity;//desde aqui se toman las librerias que extenderemos en
//la actividad principal
import android.os.Bundle;//se importa ya que es la que permite conjunto de pares de valores nombre-valor
import android.view.View; //importa la clase View que utilice en el metodo pulsarBoton
import android.widget.Button; //importa las librerias para poder usar botones
import android.widget.ImageView; //importa las librerias para poder usar visualizar imagenes
import java.util.Random; //importa las librerias para utilizar el random

public class MainActivity extends AppCompatActivity { //metodo principal
    Button botonAle; //declaramos la creacion de un objeto de tipo Button (boton aleatorio)
    ImageView imagenAle;//declaramos la creacion de un objeto de tipo ImageView (imagen aleatoria)
    Random random = new Random();//declaramos la creacion de un objeto con las propiedades del metodo random
    @Override
    protected void onCreate(Bundle savedInstanceState) { //metodo que permite crear el activity
        super.onCreate(savedInstanceState); //aqui lo que esta pasando es que al heredad necesitamos ejecutar el super
        //para que se pueda ejecutar lo que nosotros introducimos dentro de este metodo
        setContentView(R.layout.activity_main);//con esto mostramos las cosas que esten contenidas en el activiad principal

        imagenAle = findViewById(R.id.imagenAle);//debemos especificar la relacion entre el boton de la interface y el de aqui
        // por ello llame botonAle en ambos lados para mayor facilidad
        //use el finViewById para buscar por la ID
        //R. es por que esta en la carpeta resources (res) y el id para identificarla
        imagenAle.setImageResource(R.drawable.rr); //aqui mando la imagen "random" como imagen inicial
        //aqui la imagen predeterminada esta en la carpetas res y en la carpeta drawable
        botonAle = findViewById(R.id.botonAle); // asignamos la relacion entre ambas entidades
        //use el finViewById para buscar por la ID

    }
    public void pulsarBoton (View v){ //creacion del metodo que se ejecutara al dar click al boton
        // el view regresara el resultado del evento en este caso un onClick
        random.setSeed(System.currentTimeMillis());// aqui utilizo el metodo random cada ves que se da click, obtiene el t
        // tiempo actaul del sistema para hacer un numero pseudo aleatorio
        int random2 = random.nextInt(10);//aqui lo convierto en entero con un valor que va de 0 a 9

        if (random2 == 0){ //aqui comparo el valor del numero random con una de sus posibles valores
            imagenAle.setImageResource(R.drawable.a);// si entra en el if mando al ImageView la imagen contenida en drawable llamda "a"

        }if (random2 == 1){
            imagenAle.setImageResource(R.drawable.b);

        }if (random2 == 2){
            imagenAle.setImageResource(R.drawable.c);

        }if (random2 == 3){
            imagenAle.setImageResource(R.drawable.d);

        }if (random2 == 4){
            imagenAle.setImageResource(R.drawable.e);

        }if (random2 == 5){
            imagenAle.setImageResource(R.drawable.f);

        }if (random2 == 6){
            imagenAle.setImageResource(R.drawable.g);

        }if (random2 == 7){
            imagenAle.setImageResource(R.drawable.h);

        }if (random2 == 8){
            imagenAle.setImageResource(R.drawable.i);

        }if (random2 == 9){
            imagenAle.setImageResource(R.drawable.j);

        }
    }
}