package com.gharseldin.planttdd

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.gharseldin.planttdd.service.PlantService
import kotlinx.android.synthetic.main.activity_main.*

class SearchPlantActivity : AppCompatActivity() {

    var plantService = PlantService();
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name = plantName.text?.toString()

        searchPlants.setOnClickListener(View.OnClickListener {
            searchPlants()
        })
    }


    fun searchPlants(): Unit {
        val plants = plantService.fetchPlants(name)

        for (plant in plants) {
            Toast.makeText(this, plant.toString(), Toast.LENGTH_LONG).show()

        }
    }
}
