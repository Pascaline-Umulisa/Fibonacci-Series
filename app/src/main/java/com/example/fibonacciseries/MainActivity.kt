package com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaySeries()
    }

    fun displaySeries(){
        var numberList= mutableListOf<Int>(0,1)
        var sum=0
        var i=1
        for (n in 1..100){
            sum=numberList[i]+numberList[i-1]
            numberList.add(sum)
            i++
        }
        var numberAdapter=NumbersRecyclerViewAdapter(numberList)
        binding.rvNums.layoutManager=LinearLayoutManager(this)
        binding.rvNums.adapter=numberAdapter
//        var namesAdapter=NamesRecyclerViewAdapter(nameList)
//        binding.rvNames.layoutManager= LinearLayoutManager(this)
//        binding.rvNames.adapter=namesAdapter

        }
    }
