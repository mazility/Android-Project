package Model

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson
import java.util.*

/**
 * Created by pncht on 11/25/2017.
 */
/*class Faculty {
    var FID: String? = null
    var Name: String? = null
    var Info: String? = null
    var Website: String? = null
    var Icon: String? = null
    var Location_Latitude: Float? = null
    var Location_Longtitude: Float? = null
}*/
data class Faculty (
        var FID: String,
        var Name: String,
        var Info: String,
        var Website: String,
        var Icon: String,
        var Location_Latitude: Float,
        var Location_Longtitude: Float
){
    class Deserializer: ResponseDeserializable<Array<Faculty>>{
        override fun deserialize(content: String): Array<Faculty>? = Gson().fromJson(content, Array<Faculty>::class.java)
    }
}

