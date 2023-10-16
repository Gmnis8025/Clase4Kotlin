package com.example.clase4

class Menor (
   private val nombre:String,
   private val edad: Int,
   private val colegio: String,
   private val actividad: Actividad //lo toma de enum class

):Persona(nombre, edad), AccionesMenor, Acciones //hereda

{
    override fun obtenerNombre(): String
    {
        return "Mi nombre es: ${this.nombre}"
    }

    override fun obtenerEdad(): String
    {
        return "Mi edad es reservada"
    }

    override fun estudiar(): String
    {
        return "Estoy estudiando en el ${this.colegio}"
    }

    override fun comer(): String {
        return "Estoy comiendo"
    }

    override fun jugar(): String
    {
        return "Estoy jugando a ${this.actividad}"
    }

}
enum class Actividad {
    FUTBOL,
    DANZA,
    PINTUERA,
    HANDBALL,
    GUITARRA
}