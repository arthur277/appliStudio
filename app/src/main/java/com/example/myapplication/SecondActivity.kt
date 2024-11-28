package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        recyclerView = findViewById(R.id.recyclerView)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val bookList = getBookList()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(bookList)
    }

    private fun getBookList(): List<Book> {
        return listOf(
            Book("Le Petit Prince", "Antoine de Saint-Exupéry"),
            Book("1984", "George Orwell"),
            Book("Harry Potter", "J.K. Rowling"),
            // Add more books if needed
        )
    }
}
