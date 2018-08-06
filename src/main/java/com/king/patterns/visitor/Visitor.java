package com.king.patterns.visitor;

public interface Visitor {
    void visit(Gunner gunner);

    void visit(Rider rider);

    void visit(Archer archer);
}