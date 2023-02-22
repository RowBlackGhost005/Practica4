package mx.itson.edu.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button = findViewById(R.id.btnAntojitos) as Button
        var btnEspecialidades:Button = findViewById(R.id.btnEspecialidades) as Button
        var btnCombinations:Button = findViewById(R.id.btnCombinations) as Button
        var btnTortas:Button = findViewById(R.id.btnTortas) as Button
        var btnSopas:Button = findViewById(R.id.btnSopas) as Button
        var btnDrinks:Button = findViewById(R.id.btnDrinks) as Button


        btnAntojitos.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener{
            var intent:Intent = Intent(this , ProductosActivity::class.java)
            startActivity(intent)
        }

        btnCombinations.setOnClickListener{

        }

        btnTortas.setOnClickListener{

        }

        btnSopas.setOnClickListener{

        }

        btnDrinks.setOnClickListener{

        }
    }
}