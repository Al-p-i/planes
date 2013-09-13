/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 12.09.13
 * Time: 9:09
 * To change this template use File | Settings | File Templates.
 */
public abstract class Behaviour {
    public abstract PlaneState apply(MyBehaviourState behaviourState, PlaneState myState, PlaneState enemyState);
}
