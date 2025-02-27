package fr.uge.sed;

record StarTransformer(int repeat) implements Transformer {
    StarTransformer {
        if (repeat < 0) {
            throw new IllegalArgumentException("repeat must be >= 0");
        }
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
