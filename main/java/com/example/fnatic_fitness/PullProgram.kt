package com.example.fnatic_fitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PullProgram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pull_program)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Model>()

        data.add(Model("PULL UP", "This exercise will focus on your  latissimus dorsi, trapezius, and biceps brachii, and do this exercise with 3x set with failure each set, and make sure your form is good.", R.drawable.pull_up))
        data.add(Model("BENT OVER ROWS", "This exercise will focus on your latissimus dorsi and trapezius. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.bent_over_rows))
        data.add(Model("DUMBELL ROWS", "This exercise will focus on your latissimus dorsi, trapezius, rhomboid and rear delt. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.dumbell_rows))
        data.add(Model("WIDE GRIP LAT PULLDOWN", "This exercise will focus on your latissimus dorsi and trapezius. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.lat_pulldown))
        data.add(Model("FACE PULL", "This exercise will focus on your rear delt, trapeziues and rhomboid. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.face_pull))
        data.add(Model("INCLINE DUMBELL CURL", "This exercise will focus on your biceps short head and long head, do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.incline_dumbell_curl))
        data.add(Model("HAMMER CURL", "This exercise will focus on your biceps brachialis and forearms. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.dumbell_hammer_curl))
        data.add(Model("PREACHERS CURL", "This exercise will focus on your biceps short head and long head. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.preachers_curl))
        data.add(Model("DUMBELL WRIST CURL", "This exercise will focus on your flexors. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.dumbell_wrist_curl))
        data.add(Model("DUMBELL REVERSE WRIST CURL", "This exercise will focus on your extensors. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.dumbell_reverse_wrist_curl))

        val adapter = PullAdapter(data)
        recyclerview.adapter = adapter
    }
}