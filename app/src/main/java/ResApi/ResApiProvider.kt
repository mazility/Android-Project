package ResApi

import android.util.Log
import com.github.kittinunf.fuel.*
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.core.interceptors.loggingResponseInterceptor
import com.github.kittinunf.fuel.livedata.liveDataObject
import com.github.kittinunf.fuel.rx.rx_object
import com.github.kittinunf.result.Result
import com.github.kittinunf.result.getAs
import Model.Faculty



/**
 * Created by pncht on 11/25/2017.
 */
class ResApiProvider {

    var TAG = "RestApi"
    var url: String = "https://auopenhouse.herokuapp.com/api/student"

    fun getListOfFaculty(): ArrayList<Faculty> {
        val listOfFaculties = ArrayList<Faculty>()

       /*Fuel.get(url+"/faculties").responseJson  { request, response, result ->
           Log.d(TAG, request.toString())
           Log.d(TAG, response.toString())

           result.fold({ data ->
               Log.d(TAG, data.array().toString())
               data.array().run {  }
           }, { err ->
               Log.e(TAG, err.toString())
           })
        }*/
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