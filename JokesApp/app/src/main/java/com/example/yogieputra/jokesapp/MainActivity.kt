package com.example.yogieputra.jokesapp

import android.app.ProgressDialog
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.yogieputra.jokesapp.Helper.Helper
import com.example.yogieputra.jokesapp.Models.ChuckNorrisJoke
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJoke.setOnClickListener {
            var asyncTask = object:AsyncTask<String, Void, String>(){

                var mDialog = ProgressDialog(this@MainActivity)

                override fun onPreExecute() {
                    mDialog.setTitle("Please waiting...")
                    mDialog.show()
                }

                override fun doInBackground(vararg params: String?): String {
                    val helper = Helper()
                    return helper.getHTTPData("http://api.icndb.com/jokes/random")
                }

                override fun onPostExecute(result: String?) {
                    mDialog.dismiss()
                    val chuckNorrisJoke = Gson().fromJson(result, ChuckNorrisJoke::class.java)
                    txtJoke.text = chuckNorrisJoke.value.joke
                    if (txtJoke.visibility == View.INVISIBLE)
                        txtJoke.visibility = View.VISIBLE

                }
            }
            asyncTask.execute()
        }
    }
}
