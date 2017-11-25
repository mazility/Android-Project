package ResApi

import android.util.Log
import com.github.kittinunf.fuel.*
import Model.Faculty
import android.os.AsyncTask
import android.widget.ListView
import com.example.pncht.ui.BulletinAdapter


/**
 * Created by pncht on 11/25/2017.
 */
class ResApiProvider {

    var TAG = "RestApi"
    var url: String = "https://auopenhouse.herokuapp.com/api/student"

    fun getListOfFaculty(): ArrayList<Faculty> {
        val listOfFaculties = ArrayList<Faculty>()

        Fuel.get(url+"/faculties").responseObject(Faculty.Deserializer())  { request, response, result ->
            Log.d(TAG, request.toString())
            Log.d(TAG, response.toString())

            result.fold({ faculties ->
                faculties?.forEach { f ->
                    listOfFaculties.add(f)
                }
            }, { err ->
                Log.e(TAG, err.toString())
            })
        }

        return listOfFaculties
    }
}