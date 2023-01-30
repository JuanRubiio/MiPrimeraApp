package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persona :Person =  Person("Juan", 21)
    }

    //Creación de funciones:
    //Alt + intro para convertir funciones a una sola linea para funciones sencillas
    fun sum(a:Int, b:Int): Int = a + b

    fun sumPor2(a:Int, b:Int): Int{
        //Definición de variables
        val result = a+b
        return result*2
    }

    //Creacion de clases, si utilizamos val en los argumentos de entrada no hace falta
    //poner los atributos ni crear un init a modo de constructor
    //Por defecto, todas las variables y clases que creamos son publicas, para
    //ponerlas privadas usamos el private
    //Podemos poner el prefijo data para aportar una especie de toString a la clase a la hora de
    //facilitar la lectura por pantalla de ese objeto, ademas de aportar ciertas funcionalidades
    //como los equals a la hora de comparar dos objetos con los mismos valores
    data class Person(val name:String, val age:Int)
        //val name:String = name
        //val age:Int = age


    //Se pueden utilizar clases extendidas, para hacerlo la clase padre debe ser de prefijo open
    //class Developer(name:String) : Person(name, age = 30)

}

