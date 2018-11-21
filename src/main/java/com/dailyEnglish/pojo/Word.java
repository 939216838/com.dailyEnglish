package com.dailyEnglish.pojo;

import java.time.LocalDateTime;

public class Word {
    private String word;
    private String bytes;
    private LocalDateTime today;

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public LocalDateTime getToday() {
        return today;
    }

    public void setToday(LocalDateTime today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", bytes='" + bytes + '\'' +
                ", today=" + today +
                '}';
    }
}
