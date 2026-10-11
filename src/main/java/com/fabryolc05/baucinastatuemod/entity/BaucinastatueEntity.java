package com.fabryolc05.baucinastatuemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

public class BaucinastatueEntity extends Animal {
    protected BaucinastatueEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public void push(double x, double y, double z) {
        // Do nothing to prevent being pushed
    }

    public void transformToBoat() {
        // Logic to transform the statue into a boat
    }
}