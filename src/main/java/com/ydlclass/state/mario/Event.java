package com.ydlclass.state.mario;

/**
 * @author it楠老师
 * @createTime 2023-06-03
 */
public enum Event {
    // 吃蘑菇，吃火花，被敌人攻击，掉入坑里
    MUSHROOM(0), FIRE_FLOWER(1), ENEMY_ATTACK(2), FALL_INTO_PIT(3);

    private int index;

    Event(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
