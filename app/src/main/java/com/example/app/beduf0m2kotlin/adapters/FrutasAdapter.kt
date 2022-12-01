package com.example.app.beduf0m2kotlin.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.beduf0m2kotlin.R
import com.example.app.beduf0m2kotlin.models.Planta

class FrutasAdapter (private val context: Context, private val dataSet: List<Planta>) :
    RecyclerView.Adapter<FrutasAdapter.ViewHolder>() {


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemNameFruta: TextView
        val imagView: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            itemNameFruta = view.findViewById(R.id.item_name_fruta)
            imagView = view.findViewById(R.id.item_name_img)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_recyclerview_fruta, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        Glide.with(context)
            .load(dataSet[position].imagen)
            .into(viewHolder.imagView);
        viewHolder.itemNameFruta.text = context.resources.getString(dataSet[position].stringResourceint)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
