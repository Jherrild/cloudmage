package Mana

/**
 * @author jestenh@gmail.com
 * Created on 8/23/17
 */
class CostComponent(colors: List<Color>, count: Int) {
    val colors = colors
    val count = count

    fun colors() : List<Color> {
        return colors
    }

    fun hasOptions() : Boolean {
        return (colors.size > 1)
    }
}