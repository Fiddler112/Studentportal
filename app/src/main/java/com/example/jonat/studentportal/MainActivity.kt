package com.example.jonat.studentportal

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.view.GestureDetector
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val intent = Intent(this, AddSiteActivity::class.java)
            startActivity(intent)
        }
        dmciBtn.setOnClickListener { view ->
            var url = "https://www.hva.nl/"
            val intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra(CustomViewHolder.URL_KEY, url)
            startActivity(intent)
        }
        roosterBtn.setOnClickListener { view ->
           var url = "https://rooster.hva.nl/"
            val intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra(CustomViewHolder.URL_KEY, url)
            startActivity(intent)
        }
        vloBtn.setOnClickListener { view ->
           var url = "https://vlo.informatica.hva.nl/index.php"
            val intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra(CustomViewHolder.URL_KEY, url)
            startActivity(intent)
        }

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = MainAdapter()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
