package id.novian.binar.challenge2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        openActivityGojek()
    }

    private fun openActivityGojek() {
        val buttonGojek = findViewById<Button>(R.id.buttonGojek)
        buttonGojek.setOnClickListener {
            val intent = Intent(this, GojekActivity::class.java)
            startActivity(intent)
        }
    }

}