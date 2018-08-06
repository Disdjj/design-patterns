package com.king.patterns.visitor;

public class RetreatVisitor implements Visitor {
    @Override
    public void visit(Gunner gunner) {
        System.out.println(gunner.getGunner() + " 开始撤退");
    }

    @Override
    public void visit(Rider rider) {
        System.out.println(rider.getRider() + " 开始撤退");
    }

    @Override
    public void visit(Archer archer) {
        System.out.println(archer.getArcher() + " 开始撤退");
    }
}
