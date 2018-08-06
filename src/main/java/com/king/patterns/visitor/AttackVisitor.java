package com.king.patterns.visitor;

public class AttackVisitor implements Visitor {
    @Override
    public void visit(Gunner gunner) {
        System.out.println(gunner.getGunner() + " 发起进攻");
    }

    @Override
    public void visit(Rider rider) {
        System.out.println(rider.getRider() + " 发起进攻");
    }

    @Override
    public void visit(Archer archer) {
        System.out.println(archer.getArcher() + " 发起进攻");
    }
}