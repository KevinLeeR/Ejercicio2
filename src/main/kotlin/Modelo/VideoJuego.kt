package Modelo
import View.Entregable

class VideoJuego: Entregable {
    var titulo: String = ""
    var horaEstimadas: Int = 10
    var entregado: Boolean = false
    var genero: String = ""
    var compania:String = ""

    constructor()

    constructor(titulo: String, horasEstimadas: Int){
        this.titulo = titulo
        this.horaEstimadas = horaEstimadas
    }

    constructor(titulo: String, horasEstimadas: Int, genero: String, compania: String){
        this.titulo = titulo
        this.compania = compania
        this.genero = genero
        this.horaEstimadas = horasEstimadas
    }

    override var estado: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun entregar() = println(true)

    override fun devolver() = println(false)

    override fun isEntregado() {
        println(estado)
    }
}