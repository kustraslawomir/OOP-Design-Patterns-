package slawomir.kustra.patterns.behaviour.strategy.shippingcost

import slawomir.kustra.patterns.behaviour.strategy.SalesOrder
import slawomir.kustra.patterns.behaviour.strategy.ShippingCostStrategy

class BooksPromoShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = if (salesOrder.productsPrice() >= 200)
        0
    else 5
}
