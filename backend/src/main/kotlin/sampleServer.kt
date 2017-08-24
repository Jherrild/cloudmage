import com.google.gson.Gson
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.host.embeddedServer
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.response.header
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.routing

/**
 * @author jestenh@gmail.com
 * Created on 8/22/17
 */

fun main(args: Array<String>) {
    val gson = Gson()

    embeddedServer(Netty, 8080) {
        routing {
            //TODO: Figure out why get("/path") isn't working
            get("/api/ping/{count?}") {
                var count: Int = Integer.valueOf(call.parameters["count"] ?: "1")

                if (count < 1) {
                    count = 1
                }

                var obj = Array<Entry>(count, { i -> Entry("$i: Hello, World!") })
                var str = gson.toJson(obj)

                call.response.header("Access-Control-Allow-Origin", "*")
                call.respondText(str, ContentType.Application.Json)
            }
        }
    }.start(wait = true)
}

data class Entry(val message: String)
