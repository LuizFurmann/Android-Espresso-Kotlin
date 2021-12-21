package com.aplicativo.espressotutorial.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplicativo.espressotutorial.R
import com.aplicativo.espressotutorial.adapter.LeadAdapter
import com.aplicativo.espressotutorial.databinding.ActivityLeadBinding
import com.aplicativo.espressotutorial.model.Lead

class LeadActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLeadBinding

    lateinit var leaderAdapter: LeadAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeadBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        var leadList = mutableListOf(
            Lead("1","Alisson","alisson@email.com","445621","Rua João Pedro"),
            Lead("2","Luiz","luiz@email.com","462145","Rua Fernando Duarte"),
            Lead("3","Vanessa","vanessa@email.com","465462","Rua Desembargador"),
            Lead("4","Aline","aline@email.com","7846394","Rua João valdemar"),
            Lead("5","Pedro","pedro@email.com","895434","Rua Vicente de Mauá")
        )

        binding.rvLeads.layoutManager = LinearLayoutManager(this)
        leaderAdapter = LeadAdapter()
        leaderAdapter.submitList(leadList)
        binding.rvLeads.adapter = leaderAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.searchmenu, menu)
        val search = menu.findItem(R.id.search)
        val searchView = search.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                return true
            }
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
}