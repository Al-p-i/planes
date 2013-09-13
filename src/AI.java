/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 09.09.13
 * Time: 9:10
 * To change this template use File | Settings | File Templates.
 */
public abstract class AI {
    public abstract PlaneState act(PlaneState myState, PlaneState enemyState);
}
