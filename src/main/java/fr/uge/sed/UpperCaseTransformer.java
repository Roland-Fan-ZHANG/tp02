package fr.uge.sed;

import java.util.Locale;

public final class UpperCaseTransformer implements Transformer{
    @Override
    public String transform(String line) {
        return line.toUpperCase(Locale.ROOT);
    }
}
