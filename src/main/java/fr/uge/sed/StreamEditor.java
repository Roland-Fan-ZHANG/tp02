package fr.uge.sed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.Objects;

public final class StreamEditor {
    StreamEditor() {}

    public static Transformer createTransformer(String command) {
        return switch (command) {
            case "u" -> new UpperCaseTransformer();
            case "l" -> new LowerCaseTransformer();
            default -> {
                if (command.startsWith("*")) {
                    int repeat = Character.getNumericValue(command.charAt(1));
                    yield new StarTransformer(repeat);
                }
                throw new IllegalArgumentException("Commande inconnue : " + command);
            }
        };
    }

    public static void rewrite(BufferedReader reader, Writer writer, Transformer transformer) throws IOException {
        Objects.requireNonNull(reader);
        Objects.requireNonNull(writer);
        Objects.requireNonNull(transformer);
        String line;
        while ((line = reader.readLine()) != null) {
            String transformedLine = switch (transformer){
                case UpperCaseTransformer _ -> line.toUpperCase(Locale.ROOT);
                case LowerCaseTransformer _ -> line.toLowerCase(Locale.ROOT);
                case StarTransformer t -> {
                    var result = new StringBuilder();
                    for(var c : line.toCharArray()){
                        if(c == '*'){
                            result.append("*".repeat(t.repeat()));
                        }else{
                            result.append(c);
                        }
                    }
                    yield result.toString();
                }
            };
            writer.write(transformedLine + "\n");
        }
    }
}

