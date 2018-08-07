package com.king.patterns.builder;

public class TextBuilder implements Builder {
    private StringBuffer out = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        out.append("==============================\n");
        out.append("『 " + title + " 』\n");
        out.append("\n");
    }

    @Override
    public void makeString(String str) {
        out.append("■ " + str + "\n");
        out.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            out.append("　・" + items[i] + "\n");
        }
        out.append("\n");
    }

    @Override
    public void close() {
        out.append("==============================\n");
    }

    public String getResult() {
        return out.toString();
    }
}