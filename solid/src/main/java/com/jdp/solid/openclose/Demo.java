package com.jdp.solid.openclose;

import java.util.Arrays;
import java.util.List;

/*
This example shows open-close rule example.
If its needed to change the filter of product list
it is sufficient to add new specification
*/
public class Demo {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(new Product("Product 1", Color.RED, Size.MEDIUM),
                                                new Product("Product 2", Color.GREEN, Size.MEDIUM),
                                                new Product("Product 3", Color.BLUE, Size.MEDIUM),
                                                new Product("Product 4", Color.YELLOW, Size.MEDIUM),
                                                new Product("Product 5", Color.RED, Size.MEDIUM),
                                                new Product("Product 6", Color.RED, Size.MEDIUM));

        AndSpecification<Product> specification =
            new AndSpecification<>(
                new OrSpecification<>(
                        new NameSpecification("Product 1"),
                        new NameSpecification("Product 6")),
                new AndSpecification<>(
                        new ColorSpecification(Color.RED),
                        new SizeSpecification(Size.MEDIUM))
            );

        new ProductFilter().filter(products, specification).forEach(System.out::println);
    }
}
