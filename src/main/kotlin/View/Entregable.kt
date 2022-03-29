package View
import Modelo.Serie
import Modelo.VideoJuego

interface Entregable {

    var estado: Boolean

    fun entregar() {
        println(true)
    }

    fun devolver() {
        println(false)
    }

    fun isEntregado(){
        println(estado)
    }
}