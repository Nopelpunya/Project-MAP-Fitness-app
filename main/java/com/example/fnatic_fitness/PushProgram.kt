package com.example.fnatic_fitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PushProgram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_push_program)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Model>()

        data.add(Model("PAC FLY", "This exercise will focus on your whole chest muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.chest_fly))
        data.add(Model("FLAT BENCH PRESS", "This exercise will focus on your whole chest muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.flat_bench_press))
        data.add(Model("INCLINE DUMBELL PRESS", "This exercise will focus on your upper chest muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.incline_bench_press))
        data.add(Model("DECLINE DUMBELL PRESS", "This exercise will focus on your lower chest muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.decline_bench_press))
        data.add(Model("CLOSE GRIP", "This exercise will focus on your inner chest muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.close_grip))
        data.add(Model("DIPS", "This exercise will focus on your whole chest muscle and your medial head and lateral head triceps, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.dip_workout))
        data.add(Model("OVERHEAD TRICEP EXTENSIONS", "This exercise will focus on your long head and lateral head triceps muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.overhead_tricep_press))
        data.add(Model("TRICEPS KICKBACK", "This exercise will focus on your long head triceps muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.triceps_kickback))
        data.add(Model("BAR PUSHDOWN", "This exercise will focus on your lateral head triceps muscle, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.bar_pushdown))
        data.add(Model("SEATED DUMBELL PRESS", "This exercise will focus on your front delt shoulder, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.seated_dumbell_press))
        data.add(Model("FRONT RAISE", "This exercise will focus on your front delt shoulder, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.front_raise))
        data.add(Model("LATERAL RAISE", "This exercise will focus on your middle delt or raises shoulder, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.lateral_raise))
        data.add(Model("BENT OVER DUMBELL FLY", "This exercise will focus on your rear delt shoulder, and do this exercise with 3-4x set and 10-12 reps, and make sure your form is good.", R.drawable.bent_over_dumbell_fly))

        val adapter = PushAdapter(data)
        recyclerview.adapter = adapter
    }
}