package fr.uge.sed;

public final class StarTransformer implements Transformer {
    private final int repeat;

    StarTransformer(int repeat) {
        if (repeat < 0) {
            throw new IllegalArgumentException("repeat must be >= 0");
        }
        this.repeat = repeat;
    }

    public int repeat(){
        return repeat;
    }

//    @Override
//    public String transform(String line) {
//        var result = new StringBuilder();
//        for (char c : line.toCharArray()) {
//            if (c == '*') {
//                result.append("*".repeat(repeat));
//            } else {
//                result.append(c);
//            }
//        }
//        return result.toString();
//    }
}
