package com.susheelkaram.jetpacknavigationexample

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.susheelkaram.jetpacknavigationexample.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    lateinit var B: ActivityMainBinding
    lateinit var appBarConfiguration : AppBarConfiguration
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController =  findNavController(R.id.defaultNavHostFragment)
        setupNavigation()
    }


    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, B.drawerLayout)
    }

    private fun setupNavigation() {
        // Set Toolbar as Action bar
        setSupportActionBar(B.toolbarMain)

        // Create Appbar Configuration to Automatically set Toolbar title
        // and handles Hamburger (Nav drawer) and Back arrow keys
        val appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)

        // Setting up Collapsing Toolbar with Navigation controller
        collapsibleToolbarLayout.setupWithNavController(toolbar_Main, navController, appBarConfiguration)

        // Setting up Navigation Drawer with Navigation controller
        nav_view.setupWithNavController(navController)

        bottomNav.setupWithNavController(navController)
    }

    override fun onBackPressed() {
        // Closes Navigation drawer if open on Pressing back key
        if (B.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            B.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}