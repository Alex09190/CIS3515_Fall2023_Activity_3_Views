package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context ,private val textSize : Array<Int>) : BaseAdapter () {
    override fun getCount(): Int = textSize.size

    override fun getItem(position:Int):Any = textSize[position]

    override fun getItemId(position:Int):Long = position.toLong()

    override fun getView(position:Int, convertView:View?, parent:ViewGroup?):View {

        return (getDropDownView(position, convertView, parent) as TextView).apply {
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val tempTextView : TextView
        if (convertView != null) {
            tempTextView = convertView as TextView
        } else {
            tempTextView = TextView(context)
            tempTextView.setPadding(5, 10, 0, 10)
        }

        tempTextView.text = textSize[position].toString()
        tempTextView.textSize = textSize[position].toFloat()

        return tempTextView

    }


}