package com.bhs.valley

import android.content.Context
import android.widget.Toast

class MainActivity {
    fun showMessage(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}