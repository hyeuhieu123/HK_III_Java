package B1.util;


import B1.entity.Product;

@FunctionalInterface
public interface ProductFilter{
    boolean filter(Product product);
}