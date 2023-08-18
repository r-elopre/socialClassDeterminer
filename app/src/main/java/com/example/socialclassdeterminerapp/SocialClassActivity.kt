package com.example.socialclassdeterminerapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SocialClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_class)

        val yourClass : TextView = findViewById(R.id.textView2)
        val classExplanation : TextView = findViewById(R.id.textView3)
        val articleButton : Button = findViewById(R.id.button2)
        val shareButton : Button = findViewById(R.id.button3)

        var income: Int = receiveIncome()

        var poor = 10957
        var lowButNotPoor = 21914
        var lowerMiddle = 43828
        var middle = 76666
        var uppperMiddle = 131484
        var upperButNotRich = 219140
        var rich = 99999999



        if (income < poor){

            var poorclass = classExplanation.setText("You are poor class")
            var subject = "My social class"
            var text = "I belong to the poor social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

            } else if (income <= lowButNotPoor){
            var lowIncome = classExplanation.setText("You are low-income but not poor class")
            var subject = "My social class"
            var text = "I belong to the low income social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

        }    else if (income <= lowerMiddle) {
            var lowerMiddle = classExplanation.setText("You are lower middle class")
            var subject = "My social class"
            var text = "I belong to the lower middle social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

        }   else if (income <= middle) {
            var middle = classExplanation.setText("You are middle class")
            var subject = "My social class"
            var text = "I belong to the middle social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

        }   else if (income <= uppperMiddle) {
            var upperMiddle = classExplanation.setText("You are upper middle class")
            var subject = "My social class"
            var text = "I belong to the upper middle social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

        }   else if (income <= upperButNotRich) {
            var mostUpperMiddle = classExplanation.setText("You are the most upper middle class,\n but not rich")
            var subject = "My social class"
            var text = "I belong to the most upper middle social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }

        }   else {
            var rich = classExplanation.setText("You belong to the rich social class")
            var subject = "My social class"
            var text = "I belong to the rich social class"

            shareButton.setOnClickListener(){
                shareData(subject, text)
            }
        }



        articleButton.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://news.abs-cbn.com/news/09/17/20/who-are-identified-rich-poor-govt-shows-income-class-brackets-in-ph"))
            startActivity(intent)
        }


    }


    fun receiveIncome(): Int {
        var bundle: Bundle? = intent.extras
        var incomeString = bundle?.get("income").toString()

        // Convert the incomeString to an integer
        var incomeInt = incomeString.toIntOrNull() ?: 0 // Default to 0 if conversion fails

        return incomeInt
    }

    fun shareData(subject: String, text: String) {
        val i = Intent(Intent.ACTION_SEND)
        i.type = "text/plain"
        i.putExtra(Intent.EXTRA_SUBJECT, subject)
        i.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(i, "Share via"))
    }



}