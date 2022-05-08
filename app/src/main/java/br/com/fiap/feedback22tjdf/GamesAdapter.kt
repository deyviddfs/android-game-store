package br.com.fiap.feedback22tjdf

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GamesAdapter (private val dataSet: List<Games>): RecyclerView.Adapter<GamesAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView: ImageView
        val textView: TextView
        val textView2: TextView
        val textView3: TextView

        init {
            imageView = view.findViewById(R.id.imageView)
            textView = view.findViewById(R.id.textView)
            textView2 = view.findViewById(R.id.textView2)
            textView3 = view.findViewById(R.id.textView3)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_games, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val games = dataSet[position]

        holder.imageView.setImageResource(games.image)
        holder.textView.text = games.name
        holder.textView2.text = games.desc
        holder.textView3.text = games.price

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}