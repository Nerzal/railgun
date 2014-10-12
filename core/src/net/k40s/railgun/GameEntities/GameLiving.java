package net.k40s.railgun.GameEntities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import net.k40s.railgun.DynamicGameObject;

/**
 * Created by Tobias on 12.10.2014.
 * This is the super class for all "living" objects in the game.
 * Everything with some kind of brain, healthpoints etc. is going to extend this class.
 */
public class GameLiving extends DynamicGameObject {
    protected double hp;
    private double attackDamage;
    private double attackRange;
    private float centerX;
    private float centerY;
    private GameLiving target;


    public GameLiving(int posX, int posY, int width, int height, Texture tex, Vector2 velocity) {
        super(posX, posY, width, height, tex, velocity);
        updateCenterXY();
    }

    public void updateCenterXY() {
        this.centerX = position.x + (position.width / 2);
        this.centerY = position.y + (position.height / 2);
    }

    public float getCenterX() {
        return centerX;
    }

    public void setCenterX(float centerX) {
        this.centerX = centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public void setCenterY(float centerY) {
        this.centerY = centerY;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    public GameLiving getTarget() {
        return target;
    }

    public void setTarget(GameLiving target) {
        this.target = target;
    }
}
