package fr.uge.sed;

public final class UpperCaseTransformer implements Transformer{
    @Override
    public String transform(String line) {
        return line.toUpperCase();
    }
}
