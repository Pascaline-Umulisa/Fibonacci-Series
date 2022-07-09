package com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacciseries.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaySeries(100)
    }

    fun displaySeries(size:Int){
        var numberList= mutableListOf<BigInteger>(BigInteger.ZERO,BigInteger.ONE)
        while (numberList.size<size){
            var i=numberList.get(numberList.lastIndex)
            var j=numberList.get(numberList.lastIndex-1)
           var sum=i+j
            numberList.add((sum))
        }
        var numberAdapter=NumbersRecyclerViewAdapter(numberList)
        binding.rvNums.layoutManager=LinearLayoutManager(this)
        binding.rvNums.adapter=numberAdapter
//        var namesAdapter=NamesRecyclerViewAdapter(nameList)
//        binding.rvNames.layoutManager= LinearLayoutManager(this)
//        binding.rvNames.adapter=namesAdapter

        }
    }
//fun displaySeries(size:Int){
//    var numberList= mutableListOf<Int>(0,1)
//    var sum=0
//    var i=1
//    for (n in 1..size){
//        sum=numberList[i]+numberList[i-1]
//        numberList.add(sum)
//        i++
//    }