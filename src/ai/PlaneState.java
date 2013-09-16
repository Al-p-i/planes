package ai;

/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 11.09.13
 * Time: 2:56
 * To change this template use File | Settings | File Templates.
 */
public class PlaneState {
    private int x;
    private int y;
    private double angle;
    private boolean flipped;
    private int rechargeRemaining;
    private int health;


    public PlaneState(int x, int y, double angle, boolean flipped, int rechargeRemaining, int health) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.flipped = flipped;
        this.rechargeRemaining = rechargeRemaining;
        this.health = health;
    }
}
