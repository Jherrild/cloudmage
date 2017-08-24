package Card

import Mana.Color
import Mana.Cost

/**
 * @author jestenh@gmail.com
 * Created on 8/23/17
 */
class Land(colors : List<Color>, cost : Cost) : Card {
    override var colors = colors
    override var cost = cost
}