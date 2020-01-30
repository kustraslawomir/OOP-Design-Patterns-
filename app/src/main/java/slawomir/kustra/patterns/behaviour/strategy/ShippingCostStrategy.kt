package slawomir.kustra.patterns.behaviour.strategy

abstract class ShippingCostStrategy(val salesOrder: SalesOrder) {

    abstract fun shippingCost(): Int

}