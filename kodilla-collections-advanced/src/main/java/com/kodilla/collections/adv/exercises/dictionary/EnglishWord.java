package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech PartOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        PartOfSpeech = partOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return PartOfSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return PartOfSpeech == that.PartOfSpeech && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PartOfSpeech, word);
    }
}
