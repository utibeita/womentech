package com.example.anothertry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var teamAScore: TextView
    private lateinit var teamBScore: TextView
    private lateinit var EnterTeamAScore: EditText
    private lateinit var EnterTeamBScore: EditText
    private lateinit var AddButton: Button

    private var aScore = 0
    private var bScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddButton = findViewById(R.id.addButton)
        EnterTeamAScore = findViewById(R.id.enterTeamAscore)
        EnterTeamBScore = findViewById(R.id.enterTeamBscore)
        teamAScore = findViewById(R.id.TeamAscore)
        teamBScore = findViewById(R.id.TeamBscore)

        AddButton.setOnClickListener {
//            Toast.makeText(this, "Add Score was Clicked", Toast.LENGTH_LONG).show()
            aScore = EnterTeamAScore.text.toString().toInt()
            bScore = EnterTeamBScore.text.toString().toInt()

            teamAScore.text = "teamA: $aScore"
            teamBScore.text = "teamB: $bScore"

        }
    }
}