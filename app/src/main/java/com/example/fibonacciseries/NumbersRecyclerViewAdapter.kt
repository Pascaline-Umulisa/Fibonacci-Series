package com.example.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumbersRecyclerViewAdapter (var numbersList:List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_view,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvItem.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }

}
class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvItem=itemView.findViewById<TextView>(R.id.tvItem)
}