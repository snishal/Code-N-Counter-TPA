package app.ducs.tpa.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import app.ducs.tpa.R

import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        setSupportActionBar(toolbar)
        
    }

}
