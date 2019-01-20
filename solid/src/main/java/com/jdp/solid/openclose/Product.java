package com.jdp.solid.openclose;

enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW
}

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
}


class Product {

    private String name;
    private Color color;
    private Size size;

    Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    String getName() {
        return name;
    }

    Color getColor() {
        return color;
    }

    Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }

}
