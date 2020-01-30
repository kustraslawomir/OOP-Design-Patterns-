package slawomir.kustra.patterns.strategy.shippingcost

import slawomir.kustra.patterns.strategy.SalesOrder
import slawomir.kustra.patterns.strategy.ShippingCostStrategy

class InternationalShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = if (salesOrder.isHeavy())
        70 else 50
}