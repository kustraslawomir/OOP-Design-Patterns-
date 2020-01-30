package slawomir.kustra.patterns.strategy

import slawomir.kustra.patterns.strategy.model.BOOK
import slawomir.kustra.patterns.strategy.model.Product
import slawomir.kustra.patterns.strategy.shippingcost.BooksPromoShippingCost
import slawomir.kustra.patterns.strategy.shippingcost.InternationalShippingCost
import slawomir.kustra.patterns.strategy.shippingcost.StandardShippingCost
import slawomir.utils.Country

abstract class SalesOrder(private val country: String) {

    private val products = arrayListOf<Product>()

    fun getTotalPrice() = productsPrice()
        .plus(getShippingCostStrategy().shippingCost())

    fun productsPrice() = products.map { book -> book.price }
        .sum()

    private fun getShippingCostStrategy(): ShippingCostStrategy {

        if (isInternational())
            return InternationalShippingCost(this)

        if (onlyBooks())
            return BooksPromoShippingCost(this)

        return StandardShippingCost(this)
    }

    fun isHeavy() = products.map {
            product -> product.weight
    }.sum() > 50

    private fun isInternational() = country != Country.POLAND

    private fun onlyBooks() = products.none { product -> product.productType != BOOK }

    fun addProduct(product: Product) = products.add(product)
}

