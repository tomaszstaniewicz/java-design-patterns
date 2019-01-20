package com.jdp.solid.openclose;

import java.util.Collection;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filter(Collection<T> collection, Specification<T> specification);

}

class ProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(Collection<Product> collection, Specification<Product> specification) {
        return collection.stream().filter(specification::isSatisfied);
    }
}
