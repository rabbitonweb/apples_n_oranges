package ano

sealed trait Item
object Apple extends Item
object Orange extends Item

object Checkout {

  def price(item: Item) = item match {
    case Apple => BigDecimal("0.6")
    case Orange => BigDecimal("0.25")
  }

  def totalCost(items: Seq[Item]): BigDecimal = items match {
    case Nil => BigDecimal("0.0")
    case elem :: Nil => price(elem)
  }
}
