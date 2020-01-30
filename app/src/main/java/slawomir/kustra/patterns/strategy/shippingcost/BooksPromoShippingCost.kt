package slawomir.kustra.patterns.strategy.shippingcost

import slawomir.kustra.patterns.strategy.SalesOrder
import slawomir.kustra.patterns.strategy.ShippingCostStrategy

class BooksPromoShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = if (salesOrder.productsPrice() >= 200)
        0
    else 5
}
