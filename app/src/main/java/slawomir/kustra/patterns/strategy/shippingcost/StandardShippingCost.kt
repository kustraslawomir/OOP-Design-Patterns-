package slawomir.kustra.patterns.strategy.shippingcost

import slawomir.kustra.patterns.strategy.SalesOrder
import slawomir.kustra.patterns.strategy.ShippingCostStrategy

class StandardShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = 15

}