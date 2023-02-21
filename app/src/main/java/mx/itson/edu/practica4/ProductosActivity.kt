package mx.itson.edu.practica4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {

    var antojitos = ArrayList<Product>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        agregarProductos()

        var listView : ListView = findViewById(R.id.listView) as ListView

        var adaptador: AdaptadorProductos = AdaptadorProductos(this , antojitos)
        listView.adapter = adaptador
    }

    fun agregarProductos(){
        antojitos.add(Product("Quesadillas" , R.drawable.antojitos , "Rellenas con su carne favorita, servidas con ensalada.", 5.69))
        antojitos.add(Product("Huaraches" , R.drawable.antojitos , "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema.", 10.85))
        antojitos.add(Product("Gringas" , R.drawable.antojitos , "Tortilla de harina con queso, carne al pastor y piña.", 7.99))
        antojitos.add(Product("Sincronizadas" , R.drawable.antojitos , "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole.", 7.69))
        antojitos.add(Product("Sopes" , R.drawable.antojitos , "RTortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema.", 3.56))
        antojitos.add(Product("Tostadas" , R.drawable.antojitos , "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate.", 3.73))
    }

    private class AdaptadorProductos:BaseAdapter{

        var productos = ArrayList<Product>()
        var contexto:Context? = null

        constructor(contexto:Context, producto:ArrayList<Product>){
            this.productos = producto
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

            var prod = productos[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista
        }


    }
}