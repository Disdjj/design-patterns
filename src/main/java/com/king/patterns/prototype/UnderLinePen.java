package com.king.patterns.prototype;

public class UnderLinePen implements Product {
    /**
     * 下划线字符
     */
    private char underLineChar;

    public UnderLinePen(char ch) {
        this.underLineChar = ch;
    }

    /**
     * 传入str后, 会打印str和下划线
     */
    @Override
    public void use(String str) {
        System.out.println("\"" + str + "\"");
        System.out.print(" ");
        for (int i = 0; i < str.getBytes().length; i++) {
            System.out.print(underLineChar);
        }
        System.out.println("");
    }

    /**
     * 返回一个克隆
     */
    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
