package Card

import Mana.Color
import Mana.Cost

/**
 * @author jestenh@gmail.com
 * Created on 8/23/17
 */
interface Card {
    var colors : List<Color>
    var cost : Cost

    fun hasCost() : Boolean {
        return cost.componentCount() != 0
    }
}