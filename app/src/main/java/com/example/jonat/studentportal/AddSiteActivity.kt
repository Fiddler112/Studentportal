package com.example.jonat.studentportal

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.add_website.*



class AddSiteActivity : Activity() {

    private var mUrlText: EditText? = null
    private var mTitleText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_website)

        mUrlText = findViewById(R.id.url) as EditText
        mTitleText = findViewById(R.id.title) as EditText

        addBtn.setOnClickListener { view ->
            var urlText = mUrlText!!.text.toString()
            var titleText = mTitleText!!.text.toString()
            val weblink = Weblink(urlText,titleText)

            webviewList.add(weblink)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}