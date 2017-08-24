package Deck

import Card.Card
import java.util.*

/**
 * @author jestenh@gmail.com
 * Created on 8/23/17
 *
 * Cards are 'drawn' from beginning of list, and added to the end. This means that the 'top' card on your deck is the 0th index
 */
class Deck {
    var cards = mutableListOf<Card>()
    var graveyard : Deck = Deck()

    fun getSize() : Int {
        return cards.size
    }

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun shuffle() {
        val random = Random()
        for(i in (cards.size - 1) downTo 1) {
            var index = random.nextInt(i)
            this.swap(i, index)
        }
    }

    fun draw(number : Int) : List<Card> {
        var drawCards = mutableListOf<Card>()

        for(i in 0..number-1) {
            drawCards.add(cards.removeAt(i))
        }
        return drawCards
    }

    fun addToBottom(card : Card) {
        cards.add(card)
    }

    fun addToTop(card : Card) {
        cards.add(0, card)
    }

    /**
     * Remove cards from this.deck and add to deck given as argument.
     *   Deck argument defaults to this deck's graveyard.
     */
    fun mill(number : Int, deck : Deck = graveyard) {
        for(card in this.draw(number)) {
            deck.addToTop(card)
        }
    }

    /**
     * Swaps two cards in deck
     */
    private fun swap(one : Int, two : Int) {
        val swapCard = cards[one]
        cards[one] = cards[two]
        cards[two] = swapCard
    }
}