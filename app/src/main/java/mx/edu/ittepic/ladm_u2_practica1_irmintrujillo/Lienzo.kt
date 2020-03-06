package mx.edu.ittepic.ladm_u2_practica1_irmintrujillo

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity) : View(p){   //se requiere p para que view sepa en cual activity va a trabajar
    var puntero =p
    //primera tanda
    var circulo2 = FiguraGeometrica(1079, 500, 5)
    var circulo3 = FiguraGeometrica(1000, 600, 5)
    var circulo4 = FiguraGeometrica(1050, 700, 5)
    var circulo5 = FiguraGeometrica(999, 800, 5)
    var circulo6 = FiguraGeometrica(1070, 900, 5)
    var circulo7 = FiguraGeometrica(890, 1000, 5)
    var circulo8 = FiguraGeometrica(1050, 1100, 5)
    var circulo9 = FiguraGeometrica(1030, 1200, 5)
    var circulo10 = FiguraGeometrica(1010, 1300, 5)

//segunda tanda
    var circulo12 = FiguraGeometrica(1049, 499, 5)
    var circulo13 = FiguraGeometrica(800, 600, 5)
    var circulo14 = FiguraGeometrica(1250, 700, 5)
    var circulo15 = FiguraGeometrica(1100, 800, 5)
    var circulo16 = FiguraGeometrica(1270, 900, 5)
    var circulo17 = FiguraGeometrica(1090, 1000, 5)
    var circulo18 = FiguraGeometrica(1250, 1100, 5)
    var circulo19 = FiguraGeometrica(1230, 1200, 5)

//tercera tanda

    var circulo112 = FiguraGeometrica(1249, 499, 5)
    var circulo113 = FiguraGeometrica(1000, 600, 5)
    var circulo114 = FiguraGeometrica(1450, 700, 5)
    var circulo115 = FiguraGeometrica(1300, 800, 5)
    var circulo116 = FiguraGeometrica(1470, 900, 5)
    var circulo117 = FiguraGeometrica(1290, 1000, 5)
    var circulo118 = FiguraGeometrica(1450, 1100, 5)
    var circulo119 = FiguraGeometrica(1430, 1200, 5)
    var estrella1=FiguraGeometrica(1000,20,5)
    var estrella2= FiguraGeometrica(1000,700,5)
    var estrella3=  FiguraGeometrica(800,137,5)
    var estrella4= FiguraGeometrica(90,500,5)
    var estrella5=   FiguraGeometrica(196,600,5)
    var estrella6=  FiguraGeometrica(450,490,5)
    var estrella7= FiguraGeometrica(450,210,5)
    var estrella8= FiguraGeometrica(700,800,5)
    var estrella9= FiguraGeometrica(88,1000,5)
//// nubes moviendose
   var nube1= FiguraGeometrica(600,500,80)
    var nube2= FiguraGeometrica(700,500,80)
    var nube3= FiguraGeometrica(800,500,80)
    var x = -350
    var nube4= FiguraGeometrica(x+600,900,80)
    var nube5= FiguraGeometrica(x+700,900,80)
    var nube6= FiguraGeometrica(x+800,900,80)

    var punteroFiguraGeometrica: FiguraGeometrica? = null


    override fun onDraw(c: Canvas) {
            super.onDraw(c)
            puntero.setTitle(""+width+","+""+height) //me da la resolucion de la pantañña (canzas)
            //aqui en este metodo se realiza el dibujo
            var p = Paint()

                var fondo =p.color
             fondo = Color.rgb(0,0,51)
            c.drawColor(fondo) //pinta todo el back ground de un color


            //arena
            p.color = Color.rgb(112,112,56)
            c.drawCircle(1080f,1792f,750f,p)
            c.drawCircle(0f,1792f,600f,p)



            //luna
            p.color = Color.rgb(233,233,233)
            c.drawCircle(200f,200f,150f,p)
               p.color = Color.rgb(0,0,51)
            c.drawCircle(230f,180f,130f,p)

        //ESTRELLAS
        p.color = Color.rgb(233,233,233)
         //   c.drawCircle(1000f,20f,5f,p)
         //   c.drawCircle(1000f,700f,5f,p)
          //  c.drawCircle(800f,137f,5f,p)
          //  c.drawCircle(90f,500f,5f,p)
          //  c.drawCircle(196f,600f,5f,p)
          //  c.drawCircle(450f,490f,5f,p)
          //  c.drawCircle(450f,210f,5f,p)
           // c.drawCircle(700f,800f,5f,p)


            //nubes
            p.color= Color.rgb(0,0,34)
         //   c.drawCircle(600f,500f,80f,p)
         //   c.drawCircle(700f,500f,80f,p)
         //   c.drawCircle(800f,500f,80f,p)
       //     var x = -350
        //    c.drawCircle(x+600f,900f,80f,p)
        //    c.drawCircle(x+700f,900f,80f,p)
          //  c.drawCircle(x+800f,900f,80f,p)


          //cactus izquierdo
          p.color=Color.rgb(0,111,0)
          c.drawRect(200f,1500f,280f,1800f,p)
          c.drawRect(100f,1600f,380f,1650f,p)
          c.drawRect(100f,1550f,150f,1600f,p)
          c.drawRect(330f,1550f,380f,1600f,p)
        p.color=Color.RED
        c.drawCircle(130f,1555f,5f,p)
        c.drawCircle(350f,1555f,5f,p)

        //cactus derecho
        p.color=Color.rgb(0,111,0)
            c.drawRect(700f,1300f,780f,1600f,p)
            c.drawRect(600F,1400F,880f,1450f,p)
            c.drawRect(600f,1350f,650f,1400f,p)
            c.drawRect(830f,1450f,880f,1500f,p)
            p.color=Color.RED
            c.drawCircle(630f,1355f,5f,p)

////////// nieve
        p.color = Color.rgb(128,128,0)
        circulo2.pintar(c, p)
        circulo3.pintar(c, p)
        circulo4.pintar(c, p)
        circulo5.pintar(c, p)
        circulo6.pintar(c, p)
        circulo7.pintar(c, p)
        circulo8.pintar(c, p)
        circulo9.pintar(c, p)
        circulo10.pintar(c, p)

        circulo12.pintar(c, p)
        circulo13.pintar(c, p)
        circulo14.pintar(c, p)
        circulo15.pintar(c, p)
        circulo16.pintar(c, p)
        circulo17.pintar(c, p)
        circulo18.pintar(c, p)
        circulo19.pintar(c, p)

        circulo112.pintar(c, p)
        circulo113.pintar(c, p)
        circulo114.pintar(c, p)
        circulo115.pintar(c, p)
        circulo116.pintar(c, p)
        circulo117.pintar(c, p)
        circulo118.pintar(c, p)
        circulo119.pintar(c, p)

        p.color = Color.rgb(233,233,233)
        //p.color=Color.GREEN
        estrella1.pintar(c,p)
        estrella2.pintar(c,p)
        estrella3.pintar(c,p)
        estrella4.pintar(c,p)
        estrella5.pintar(c,p)
        estrella6.pintar(c,p)
        estrella7.pintar(c,p)
        estrella8.pintar(c,p)
        estrella9.pintar(c,p)
    //    p.style = Paint.Style.STROKE
       // p.color = Color.WHITE
     //   p.strokeWidth = 10f
    //    circulo2.pintar(c, p)
        p.color= Color.rgb(0,0,34)
        nube1.pintar(c,p)
        nube2.pintar(c,p)
        nube3.pintar(c,p)

        nube4.pintar(c,p)
        nube5.pintar(c,p)
        nube6.pintar(c,p)

    }


    fun animarCirculo() {
        circulo2.rebote(width, height)
        circulo3.rebote(width, height)
        circulo4.rebote(width, height)
        circulo5.rebote(width, height)
        circulo6.rebote(width, height)
        circulo7.rebote(width, height)
        circulo8.rebote(width, height)
        circulo9.rebote(width, height)
        circulo10.rebote(width, height)


        circulo12.rebote(width, height)
        circulo13.rebote(width, height)
        circulo14.rebote(width, height)
        circulo15.rebote(width, height)
        circulo16.rebote(width, height)
        circulo17.rebote(width, height)
        circulo18.rebote(width, height)
        circulo19.rebote(width, height)

        circulo112.rebote(width, height)
        circulo113.rebote(width, height)
        circulo114.rebote(width, height)
        circulo115.rebote(width, height)
        circulo116.rebote(width, height)
        circulo117.rebote(width, height)
        circulo118.rebote(width, height)
        circulo119.rebote(width, height)

        nube1.rebote(width,height)
        nube2.rebote(width,height)
        nube3.rebote(width,height)

        nube4.rebote(width,height)
        nube5.rebote(width,height)
        nube6.rebote(width,height)
        estrella1.brilla(0.5f)
        estrella2.brilla(1f)
        estrella3.brilla(1.5f)
        estrella4.brilla(0.8f)
        estrella5.brilla(0.1f)
        estrella6.brilla(0.4f)
        estrella7.brilla(0.9f)
        estrella8.brilla(0.33f)
        estrella9.brilla(0.70f)



        invalidate()
    }


}