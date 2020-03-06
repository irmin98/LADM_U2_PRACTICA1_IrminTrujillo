package mx.edu.ittepic.ladm_u2_practica1_irmintrujillo

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        sleep(6000)
        while(true){
            sleep(70)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}