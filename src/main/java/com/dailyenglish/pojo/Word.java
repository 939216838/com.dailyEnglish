package com.dailyenglish.pojo;

import java.time.LocalDateTime;

public class Word {
    private String word;
    private String query;
    private String bytes;
    private LocalDateTime today;
    private String from;
    private String to;

    public Word() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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
