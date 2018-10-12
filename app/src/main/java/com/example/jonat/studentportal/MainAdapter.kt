package com.example.jonat.studentportal

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.result_row.view.*

var webviewList = mutableListOf<Weblink>()

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {



    // Number items
    override fun getItemCount(): Int {
        return webviewList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val resultRow = layoutInflater.inflate(R.layout.result_row, parent, false)
        return CustomViewHolder(resultRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val webview = webviewList.get(position)
        holder?.view?.textView_result?.text = webview.title

        holder?.weblink = webview
    }

}

class CustomViewHolder(val view: View, var weblink: Weblink? = null): RecyclerView.ViewHolder(view) {

    companion object {
        val URL_KEY = "URL"
    }
    init {
        view.setOnClickListener {

            val intent = Intent(view.context, WebviewActivity::class.java)
            intent.putExtra(URL_KEY, weblink?.url)
            view.context.startActivity(intent)
        }
    }
}