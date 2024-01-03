package com.example.fnatic_fitness

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LegProgram : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leg_program)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Model>()

        data.add(Model("CALVES RAISES", "This exercise will focus on your soleus and gastrocnemius. do this exercise with 3x set with failure each set, and make sure your form is good.", R.drawable.calves_raises))
        data.add(Model("BULGARIAN SPLIT SQUAT", "This exercise will focus on your quadriceps and core. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.bulgarian_split_squat))
        data.add(Model("HACK SQUAT", "This exercise will focus on your quadriceps. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.hack_squat))
        data.add(Model("HAMSTRING CURL", "This exercise will focus on your hamstring. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.hamstring_curl))
        data.add(Model("LEG EXTENSIONS", "This exercise will focus on your quadriceps. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.leg_extension))
        data.add(Model("LUNGES", "This exercise will focus on your quadriceps, hamstring, glutes and calves. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.lunges_with_stickbar))
        data.add(Model("MACHINE PRESS VAR 1", "This exercise will focus on your outer sweep and aductor. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.machine_press_outerandaductor))
        data.add(Model("MACHINE PRESS VAR 2", "This exercise will focus on your quadriceps and hamstring. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.machine_press_quadsandhamstring))
        data.add(Model("ROMANIAN DEADLIFT", "This exercise will focus on your hamstring and core. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.romanian_deadlift))
        data.add(Model("SQUATS STICKBAR", "This exercise will focus on your quadriceps, core and outersweep. do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.squats_stick_weight))

        val adapter = LegAdapter(data)
        recyclerview.adapter = adapter
    }
}