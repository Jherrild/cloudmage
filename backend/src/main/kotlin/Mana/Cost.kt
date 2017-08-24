package Mana

/**
 * @author jestenh@gmail.com
 * Created on 8/23/17
 */
class Cost(components: List<CostComponent> = emptyList<CostComponent>()) {
    val components = components

    fun componentCount(): Int {
        return components.size
    }

    fun getComponent(index: Int): CostComponent{
        return components[index]
    }
}