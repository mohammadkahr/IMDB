package com.example.imdb_deadlygray

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.imdb_deadlygray.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main2)
        NavigationUI.setupWithNavController(navView, navController)



//        Client.getInstance().searchMovie(Credentials.APIkey).enqueue(
//            object : Callback<Movie> {
//                override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
//                    Log.d(TAG, "onResponse: " + response.code())
//                    Log.d(TAG, "onResponse: " + response.body())
//                    Log.d(TAG, "onResponse:ERROR " + response.errorBody())
//                }
//
//                override fun onFailure(call: Call<Movie>, t: Throwable) {
//
//                    Log.e(TAG, "onFailure: ", t)
//                }
//
//            }
//        )


        //copy on api.requests
//        CoroutineScope(Dispatchers.Default).launch {
//            try {
//                val response = Client.getInstance().searchMovie(Credentials.APIkey).execute()
//                Log.d(TAG, "onResponse: " + response.code())
//                Log.d(TAG, "onResponse: " + response.body())
//                Log.d(TAG, "onResponse:ERROR " + response.errorBody())
//               ImageView(this@MainActivity).setImageURI(Uri.parse(""))
//            } catch (e: java.lang.Exception) {
//                Log.e(TAG, "onCreate: ", e)
//            }
//
//        }


//
//        binding.navView.setOnItemSelectedListener {
//            val states = arrayOf(
//                intArrayOf(android.R.attr.state_enabled),
//                intArrayOf(-android.R.attr.state_checked),
//                intArrayOf(android.R.attr.state_pressed)
//            )
//
//            val colors1 = intArrayOf(
//                Color.CYAN,
//                Color.CYAN,
//                Color.CYAN,
//            )
//
//
//            val colors2 = intArrayOf(
//                Color.rgb(204,153,255),
//                Color.rgb(204,153,255),
//                Color.rgb(204,153,255),
//            )
//
//            val colors3 = intArrayOf(
//                Color.rgb(219, 165, 6),
//                Color.rgb(219, 165, 6),
//                Color.rgb(219, 165, 6),
//            )
//
//            val colors4 = intArrayOf(
//                Color.GRAY,
//                Color.GRAY,
//                Color.GRAY,
//            )
//
//            val colors5 = intArrayOf(
//                Color.rgb(242,219,131),
//                Color.rgb(242,219,131),
//                Color.rgb(242,219,131),
//            )
//
//            val colors6 = intArrayOf(
//                Color.rgb(255,255,204),
//                Color.rgb(255,255,204),
//                Color.rgb(255,255,204),
//            )
//
//            val colors7 = intArrayOf(
//                Color.rgb(224,224,224),
//                Color.rgb(224,224,224),
//                Color.rgb(224,224,224),
//            )
//
//            val colors8 = intArrayOf(
//                Color.rgb(204,153,255),
//                Color.rgb(204,153,255),
//                Color.rgb(204,153,255),
//            )
//
//            val myList1 = ColorStateList(states, colors3)
//            val myList2 = ColorStateList(states, colors1)
//            val myList3 = ColorStateList(states, colors2)
//            val myList4 = ColorStateList(states, colors4)
//            val bList1 = ColorStateList(states, colors5)
//            val bList2 = ColorStateList(states, colors6)
//            val bList3 = ColorStateList(states, colors7)
//            val bList4 = ColorStateList(states, colors8)
//            if (it.title.toString().equals("Home")) {
//                binding.navView.itemIconTintList = myList1
//                binding.navView.itemTextColor = myList1
//                navController.navigate(R.id.navigation_home)
//
////                binding.navView.setBackgroundColor()
//
//            }
//            if (it.title.toString().equals("Search")) {
//                binding.navView.itemIconTintList = myList2
//                binding.navView.itemTextColor = myList2
//                navController.navigate(R.id.navigation_dashboard)
//            }
//            if (it.title.toString().equals("Movie")) {
//                binding.navView.itemIconTintList = myList3
//                binding.navView.itemTextColor = myList3
//                navController.navigate(R.id.navigation_notifications)
//            }
//            if (it.title.toString().equals("You")) {
//                binding.navView.itemIconTintList = myList4
//                binding.navView.itemTextColor = myList4
//                navController.navigate(R.id.navigation_search)
//            }
//            true
//        }
    }
}