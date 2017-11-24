package com.example.pncht.ui

import android.app.FragmentTransaction
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        fragmentManager.beginTransaction()
                .add(R.id.main_fragment_container, HomeFragment.newInstance(), "HomeFragment")
                .commit();
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                toolbar.setTitle("Home")
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, HomeFragment.newInstance(), "BulletinFragment")
                        .commit()
//                val intent = Intent(this@MainActivity, MainActivity::class.java)
//                intent.putExtra("key","Kotlin")
//                startActivity(intent)
            }
            R.id.nav_bulletin -> {
                toolbar.setTitle("Bulletin")
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, BulletinFragment.newInstance(), "BulletinFragment")
                        .commit()
//                val intent = Intent(this@MainActivity, Bulletin::class.java)
//                intent.putExtra("key","Kotlin")
//                startActivity(intent)
            }
            R.id.nav_event -> {
                toolbar.setTitle("Event")
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, EventFragment.newInstance(), "EventFragment")
                        .commit()
//                val intent = Intent(this@MainActivity, Event::class.java)
//                intent.putExtra("key","Kotlin")
//                startActivity(intent)
            }
            R.id.nav_minigame -> {
                toolbar.setTitle("Home")
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, MinigameFragment.newInstance(), "MinigameFragment")
                        .commit()
//                val intent = Intent(this@MainActivity, Minigame::class.java)
//                intent.putExtra("key","Kotlin")
//                startActivity(intent)
            }
            R.id.nav_logout -> {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                intent.putExtra("key","Kotlin")
                startActivity(intent)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
