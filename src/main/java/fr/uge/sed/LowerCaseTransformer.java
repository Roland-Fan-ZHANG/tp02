package fr.uge.sed;

public final class LowerCaseTransformer implements Transformer{
    @Override
    public String transform(String line) {
        return line.toLowerCase();
    }
}
