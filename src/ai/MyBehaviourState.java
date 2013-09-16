package ai;

/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 14.09.13
 * Time: 13:15
 * To change this template use File | Settings | File Templates.
 */
public interface MyBehaviourState {
    PlaneState act(PlaneState myState, final PlaneState enemyState, EasyAI.EnemyBehaviourState enemyBehaviourState);
}
