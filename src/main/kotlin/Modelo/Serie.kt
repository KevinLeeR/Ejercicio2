package Modelo
import View.Entregable

class Serie: Entregable{
    var titulo: String =""
    var numeroDeTemporada: Int = 3
    var entregado: Boolean = false
    var genero: String = ""
    var creador: String = ""

    constructor()

    constructor(titulo: String, creador: String){
        this.titulo = titulo
        this.creador = creador
    }

    constructor(titulo: String, numeroDeTemporada: Int, genero: String, creador: String){
        this.titulo = titulo
        this.creador = creador
        this.genero = genero
        this.numeroDeTemporada = numeroDeTemporada
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