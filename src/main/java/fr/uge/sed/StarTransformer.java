package fr.uge.sed;

record StarTransformer(int repeat) implements Transformer {
    StarTransformer {
        if (repeat < 0) {
            throw new IllegalArgumentException();
        }
    }
}
