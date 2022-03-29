//Kevin Lee ROjas

import Modelo.Serie
import Modelo.VideoJuego
import View.Entregable

fun main(args: Array<String>) {

    var serie = arrayOf<Serie>()
    var videoJuego = arrayOf<VideoJuego>()

    val serie1 = Serie("TWD",10,"Terror","Robert Kirkman")
    val serie2 = Serie("Friends",12,"Comedia","Marta Kauffman")
    val videoJuego1 = VideoJuego("GTA",10,"Violencia","Rockstar")
    val videoJuego2 = VideoJuego("Sims",5,"Simulacion","EA")

    serie = serie.plus(serie1)
    serie = serie.plus(serie2)
    videoJuego = videoJuego.plus(videoJuego1)
    videoJuego = videoJuego.plus(videoJuego2)

    println("Cantidad de Series:")
    println(serie.size)
    println("Cantidad de Juegos:")
    println(videoJuego.size)

    for (i in serie.indices){
        println("Informacion de la Serie:")
        println(serie[i].titulo)
        println(serie[i].numeroDeTemporada)
        println(serie[i].genero)
        println(serie[i].creador)
        println(serie.size)
        println("Fin")
    }
    for (i in videoJuego.indices){
        println("Informacion del juego:")
        println(videoJuego[i].titulo)
        println(videoJuego[i].horaEstimadas)
        println(videoJuego[i].genero)
        println(videoJuego[i].compania)
        println(videoJuego.size)
        println("Fin")
    }

    var objS = Serie()
    var objV = VideoJuego()

    print(objS.devolver())
    print(objS.entregar())
    print(objS.isEntregado())

    print(objV.devolver())
    print(objV.entregar())
    print(objV.isEntregado())




    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}