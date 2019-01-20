package com.jdp.solid.openclose;

public interface Specification<T> {

    boolean isSatisfied(T item);

}

class AndSpecification<T> implements Specification<T> {

    private Specification<T> one;
    private Specification<T> two;

    AndSpecification(Specification<T> one, Specification<T> two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public boolean isSatisfied(T item) {
        return one.isSatisfied(item) && two.isSatisfied(item);
    }
}

class OrSpecification<T> implements Specification<T> {

    private Specification<T> one;
    private Specification<T> two;

    OrSpecification(Specification<T> one, Specification<T> two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public boolean isSatisfied(T item) {
        return one.isSatisfied(item) || two.isSatisfied(item);
    }
}

class ColorSpecification implements Specification<Product> {

    private Color color;

    ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.color.equals(item.getColor());
    }
}

class SizeSpecification implements Specification<Product> {

    private Size Size;

    SizeSpecification(Size Size) {
        this.Size = Size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.Size.equals(item.getSize());
    }
}

class NameSpecification implements Specification<Product> {

    private String name;

    NameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.name.equals(item.getName());
    }
}