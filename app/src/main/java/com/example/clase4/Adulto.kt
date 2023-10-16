package com.example.clase4

class Adulto (
  private val nombre: String,
  private val edad: Int,
  private val profesion: String,
  private val estadoCivil: EstadoCivil
):Persona (nombre, edad), AccionesAdulto, Acciones //hereda

/////////////// los siguientes son funciones
{
   fun obtenerEstadocivil(): String
   {
      return "Mi estado civil es: + ${this.estadoCivil}"
   }

   override fun obtenerNombre(): String {
      return "Mi nombre es: ${this.nombre}"
   }

   override fun obtenerEdad(): String {
      return "Mi edad es: ${this.edad}"
   }

   override fun estudiar(): String {
      return "Estoy estudiando"
   }

   override fun comer(): String {
      return "Estoy comiendo"
   }

   override fun trabajar(): String {
      return "Estoy trabajando"
   }


}
enum class EstadoCivil{
   CASADO,
   SOLTERO,
   DIVORCIADO,
   CONYUGE,
   VIUDO

}
