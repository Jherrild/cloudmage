package Game

import Card.Card
import Deck.Deck
import java.util.*

/**
 * @author jherrild@expedia.com
 * Created on 8/24/17
 */
class Player(id : UUID = UUID.randomUUID(), deck : Deck) {
    val id = id

    var deck = deck
    var hand = emptyList<Card>()
}