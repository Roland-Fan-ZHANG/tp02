package fr.uge.sed;

public sealed interface Transformer permits UpperCaseTransformer, LowerCaseTransformer, StarTransformer{
}
