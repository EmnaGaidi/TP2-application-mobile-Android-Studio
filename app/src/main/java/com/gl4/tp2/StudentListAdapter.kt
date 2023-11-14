package com.gl4.tp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import android.content.Context
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import java.util.Locale

class StudentListAdapter(private val context: Context, private var studentList: List<Student>) :
    RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.student_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val currentStudent = studentList[position]

        holder.name.text = currentStudent.lastName+" "+currentStudent.firstName

        val gender = currentStudent.gender
        val imageResource = when (gender) {
            Student.Gender.MAN -> R.drawable.man
            Student.Gender.WOMAN -> R.drawable.woman
        }
        holder.imageView.setImageResource(imageResource)
    }


    override fun getItemCount(): Int {
        return studentList.size
    }

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
    var dataFilterList = ArrayList<Student>()
    init {
        dataFilterList = studentList as ArrayList<Student>
    }

}
