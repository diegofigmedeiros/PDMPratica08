package com.example.pdm_pratica_08

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TelaReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Telinha desbloqueada", Toast.LENGTH_SHORT).show()
    }

}