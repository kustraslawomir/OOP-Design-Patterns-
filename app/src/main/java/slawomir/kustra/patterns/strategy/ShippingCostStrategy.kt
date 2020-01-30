package slawomir.kustra.patterns.strategy

abstract class ShippingCostStrategy(val salesOrder: SalesOrder) {

    abstract fun shippingCost(): Int

}