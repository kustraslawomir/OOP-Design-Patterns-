package slawomir.kustra.patterns.behaviour.strategy.shippingcost

import slawomir.kustra.patterns.behaviour.strategy.SalesOrder
import slawomir.kustra.patterns.behaviour.strategy.ShippingCostStrategy

class StandardShippingCost(salesOrder: SalesOrder) : ShippingCostStrategy(salesOrder) {

    override fun shippingCost() = 15

}