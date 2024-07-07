package com.work.search.algorithms;

/**
 *
 * @author linux
 */
public final class SearchFactory {

    private SearchFactory() {

    }

    public static SearchBase createFactory(TypesSearch type) {
        switch (type) {            
            case BINARY_SEARCH -> {
                return new BBinaria();
            }
            case LINEAR_SEARCH -> {
                return new BLineal();
            }
            default -> throw new IllegalArgumentException("La opcion no es valida");
        }
    }
}
