package ai;

/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 14.09.13
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class PursuitBehaviourState implements MyBehaviourState {
    @Override
    public PlaneState act(PlaneState myState, final PlaneState enemyState, EasyAI.EnemyBehaviourState enemyBehaviourState) {
//        change state
        if (Utils.onMyWay(myState, enemyState)) {

        }
//        move
//        fight
        throw new NotImplementedException();
    }
}
