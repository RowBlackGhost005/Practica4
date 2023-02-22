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

    var antojitos = ArrayList<Product>()
    var especialidades = ArrayList<Product>()
    var combinations = ArrayList<Product>()
    var tortas = ArrayList<Product>()
    var sopas = ArrayList<Product>()
    var bebidas = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        agregarProductos()

        var listView:ListView = findViewById(R.id.listView) as ListView

        var adaptador:AdaptadorProductos = AdaptadorProductos(this , antojitos)
        listView.adapter = adaptador
    }

    fun agregarProductos(){
        antojitos.add(Product("Quesadillas" , R.drawable.quesadillas , "Rellenas con su carne favorita, servidas con ensalada.", 5.69))
        antojitos.add(Product("Huaraches" , R.drawable.huaraches , "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema.", 10.85))
        antojitos.add(Product("Gringas" , R.drawable.gringas , "Tortilla de harina con queso, carne al pastor y piña.", 7.99))
        antojitos.add(Product("Sincronizadas" , R.drawable.sincronizadas , "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole.", 7.69))
        antojitos.add(Product("Sopes" , R.drawable.sopes , "RTortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema.", 3.56))
        antojitos.add(Product("Tostadas" , R.drawable.tostadas , "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate.", 3.73))

        especialidades.add(Product("Mojarra Frita", R.drawable.mojarra , "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas. Agregue arroz y frijoles por $1.50 adiconales.", 15.99))
        especialidades.add(Product("Ceviche" , R.drawable.ceviche , "Tilapia, camarones, aguacate y pico de gallo servido con chips", 6.99))
        especialidades.add(Product("Fajita Burrito" , R.drawable.burritos , "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuca y guacamole.", 12.99))
        especialidades.add(Product("Fajita Quesadilla" , R.drawable.fajitaquesadilla , "Quesadilla extra garande, rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada." , 13.99))
        especialidades.add(Product("Botana de Camarones" , R.drawable.botanacamarones , "Botana de camarones." , 17.99))
        especialidades.add(Product("Coctel Camaron" , R.drawable.coctel , "Coctel de camarón." , 14.50))

        combinations.add(Product("Traditional Taco Combo" , R.drawable.combinationtaco , "Tortilla de maiz, tu carne favorita, servido con arroz y frijoles.", 6.99))
        combinations.add(Product("Mexican Burritos", R.drawable.taco , "Tu carne favorita en un burrito grande hecho con tortilla de harina con arroz, frijoles, lechuga, cebolla asada, pico de gallo, guacamole y crema agria." , 11.99))
        combinations.add(Product("Los Portales Burrito" , R.drawable.burritosportales , "Tortilla de harina enrollada con cactus asado, chuleta, pastor, cebolla asada, arroz o frijoles. Servida con una porción de ensalada, crema agria y guacamole.", 12.99))
        combinations.add(Product("Cinco", R.drawable.cinco , "Tortilla tostada con tu carne favorita, lechuga y queso. Un burrito con tu carne favorita, pico de gallo, crema agria, guacamole y frijoles. Servida con arroz y frijoles.", 7.99))
        combinations.add(Product("Dos Amigos" , R.drawable.dosamigos , "Dos tortillas tostadas con tu carne favorita cubierta de lechuga y queso rallado. Servido con una porción de arroz y frijoles.", 8.99))
        combinations.add(Product("Burrito Pepe", R.drawable.burritopepe , "Tortilla de harina con tu carne favorita con frijoles, lechuga, crema agria, guacamole y pico de gallo. Servido con una porción de arroz." , 7.49))

        tortas.add(Product("Torta Regular" , R.drawable.torta , "Todas las tordas vienen con lechuga, cebolla, tomate, aguacate, crema agria, chile jalapeño y tu carne favorita." , 11.99))
        tortas.add(Product("Torta-Milanesa de Res o Pollo" , R.drawable.tortamilanesa , "Torta de carne de res o pollo.", 12.99))
        tortas.add(Product("Torta Cubana" , R.drawable.tortacubana , "Chorizo, asada, jamon, pastor y queso." , 13.59))
        tortas.add(Product("Torta Mixta" , R.drawable.tortamixta , "Chorizo, asada y pastor." , 12.99))

        sopas.add(Product("Pozole" , R.drawable.pozole , "Solo entre semana." , 5.99))
        sopas.add(Product("Menudo" , R.drawable.menudo , "De miércoles a domingo." , 5.99))
        sopas.add(Product("Caldo de Res" , R.drawable.caldores , "Caldo de Res" , 5.99))
        sopas.add(Product("Caldo de Camarón" , R.drawable.caldocamaron , "Caldo de camarón" , 12.99))
        sopas.add(Product("Sopa de Mariscos" , R.drawable.sopamariscos , "Sopa de mariscos" , 19.99))
        sopas.add(Product("Coctel de Camarón" , R.drawable.caldocamaron , "Coctel de camarón", 14.99))

        bebidas.add(Product("Sodas 20oz" , R.drawable.sodas , "" , 2.99))
        bebidas.add(Product("Jarritos" , R.drawable.jarritos , "" , 2.35))
        bebidas.add(Product("Aguas Frescas" , R.drawable.drinks , "" , 2.99))
        bebidas.add(Product("Domestic Beer" , R.drawable.domesticbeer , "" , 3.55))
        bebidas.add(Product("Mexican Beer" , R.drawable.mexicanbeer , "" , 3.99))
        bebidas.add(Product("Micheladas" , R.drawable.michelada , "" , 6.75))
        bebidas.add(Product("Caguama" , R.drawable.caguama , "" , 8.99))
        bebidas.add(Product("Caguama Michelada" , R.drawable.caguamamichelada , "" , 10.99))
        bebidas.add(Product("Cubetazos" , R.drawable.cubetazo , "" , 21.99))
        bebidas.add(Product("Lata Beer" , R.drawable.domesticbeer , "" ,2.99))
        bebidas.add(Product("Charolazo" , R.drawable.charolazo , "" , 15.75))
        bebidas.add(Product("Charolazo con Camarones" , R.drawable.charolazo , "" , 21.99))
        bebidas.add(Product("La mamalona" , R.drawable.michelada , "Michelada 2 cervezas" , 12.99))
        bebidas.add(Product("La mamalona con camarones" , R.drawable.michelada , "" , 14.99))
        bebidas.add(Product("Cubetazo (6 cerverzas)" , R.drawable.cubetasix , "" , 21.99))
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