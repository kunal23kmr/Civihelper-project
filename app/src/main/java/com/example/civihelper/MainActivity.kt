package com.example.civihelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatDelegate
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.electricity)
        val button2 = findViewById<Button>(R.id.water)
        val button3 = findViewById<Button>(R.id.street_light)
        val button4 = findViewById<Button>(R.id.road)
        val button5 = findViewById<Button>(R.id.other)

        button1.setOnClickListener {
            val intent = Intent(this,form::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,form::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,form::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,form::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this,form::class.java)
            startActivity(intent)
        }


        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navview : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navview.setNavigationItemSelectedListener {

            when(it.itemId) {


                R.id.nav_dark_mode -> Toast.makeText(
                    applicationContext,
                    "Clicked Dark Mode",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.about -> Toast.makeText(
                    applicationContext,
                    "Clicked About",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_login -> Toast.makeText(
                    applicationContext,
                    "Clicked Login",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_share -> Toast.makeText(
                    applicationContext,
                    "Clicked Share",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_rate_us -> Toast.makeText(
                    applicationContext,
                    "Clicked Rate_us",
                    Toast.LENGTH_SHORT
                ).show()
            }

            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)) {
            return true

        }
        return super.onOptionsItemSelected(item)

    }

}