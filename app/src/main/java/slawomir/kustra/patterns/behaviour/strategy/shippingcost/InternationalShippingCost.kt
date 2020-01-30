package slawomir.kustra.patterns.behaviour.strategy.shippingcost

import slawomir.kustra.patterns.behaviour.strategy.SalesOrder
import slawomir.kustra.patterns.behaviour.strategy.ShippingCostStrategy

class InternationalShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = if (salesOrder.isHeavy())
        70 else 50
}