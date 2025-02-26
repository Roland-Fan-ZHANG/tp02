package fr.uge.sed;

public final class StarTransformer implements Transformer{
    private final int repeat;

    StarTransformer(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public String transform(String line) {
        return line.replaceAll(".", "$0".repeat(repeat));
    }
}
