package com.example.fragment_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity","onCreate")
        val adapter = ViewPagerAdapter(supportFragmentManager)
        findViewById<ViewPager>(R.id.viewpager).adapter=adapter
    }

    override fun onRestart(){
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }

    override fun onStart(){
        super.onStart()
        Log.e("MainActivity","onStart")
    }

    override  fun onResume(){
        super.onResume()
        Log.e("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }
}
class  ViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){
    override fun getItem(position: Int) = when(position){
        0 -> FirstFragment()
        1 -> SecondFragment()
        else -> ThirdFragment()
    }
    override fun getCount()=3
}