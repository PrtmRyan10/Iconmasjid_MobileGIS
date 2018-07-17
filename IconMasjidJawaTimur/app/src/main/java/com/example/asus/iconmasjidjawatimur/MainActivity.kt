package com.example.asus.iconmasjidjawatimur

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMapI.setOnClickListener {
            val maintomap = Intent(this, MapsActivity::class.java)
            startActivity(maintomap)

            btnMap0.setOnClickListener {
                val maintomapi = Intent(this, MapsActivity2::class.java)
                startActivity(maintomapi)

                btnMap1.setOnClickListener {
                    val maintomapa = Intent(this, MapsActivity3::class.java)
                    startActivity(maintomapa)

                    btnMap2.setOnClickListener {
                        val maintomaps = Intent(this, MapsActivity4::class.java)
                        startActivity(maintomaps)

                        btnMap3.setOnClickListener {
                            val maintomapd = Intent(this, MapsActivity5::class.java)
                            startActivity(maintomapd)

                            btnMap4.setOnClickListener {
                                val maintomapf = Intent(this, MapsActivity6::class.java)
                                startActivity(maintomapf)

                                btnMap5.setOnClickListener {
                                    val maintomapt = Intent(this, MapsActivity7::class.java)
                                    startActivity(maintomapt)

                                    btnMap6.setOnClickListener {
                                        val maintomapj = Intent(this, MapsActivity8::class.java)
                                        startActivity(maintomapj)


                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}




