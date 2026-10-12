class SaintPetesburgCofeDom (
    DenishBlueberryPrice: Double,
    CroissantPrice: Double,
    ChocolateCroissantPrice: Double,
    PizzaPrice: Double,
    CheeseBallsPrice: Double
) : CafeDom(DenishBlueberryPrice, CroissantPrice,
ChocolateCroissantPrice, PizzaPrice,
CheeseBallsPrice)
{
    override fun DenishBlueberrySale() {
        println("Спасибо за покупку дениша с голубикой в Санкт-Петербурге!")
    }
    override fun CroissantSale() {
        println("Спасибо за покупку круассана в Санкт-Петербурге!")
    }
    override fun ChocolateCroissantSale() {
        println("Спасибо за покупку шоколадного круассана в Санкт-Петербурге!")
    }
    override fun PizzaSale() {
        println("Спасибо за покупку слойки-пиццы в Санкт-Петербурге!")
    }
    override fun CheeseBallsSale() {
        println("Спасибо за покупку сырных шариков в Санкт-Петербурге!")
    }
}