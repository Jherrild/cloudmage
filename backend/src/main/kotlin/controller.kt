
import org.jetbrains.ktor.host.embeddedServer
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.post
import org.jetbrains.ktor.routing.routing

/**
 * @author jestenh@gmail.com
 * Created on 8/22/17
 */
fun main(args: Array<String>) {
    embeddedServer(Netty, 8080) {
        routing {
            get("/api/resources/images/{id}") {
                var id = call.parameters["id"]
                call.respondText("Hello, ${id}!", ContentType.Text.Html)
            }
            get("/api/actions/shuffle/{player_id}") {
               //TODO: return shuffled deck of 'player_id'
            }
            post("/api/actions/draw/{player_id}") {
                //TODO: return a card drawn from the deck of 'player_id'
            }
        }
    }.start(wait = true)
}
