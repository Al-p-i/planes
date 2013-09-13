/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 12.09.13
 * Time: 9:07
 * To change this template use File | Settings | File Templates.
 */
public class EasyAI extends AI {
    MyBehaviourState myBehaviourState;
    EnemyBehaviourState enemyBehaviourState;


    public EasyAI() {
        this.myBehaviourState = MyBehaviourState.IDLE;
        this.enemyBehaviourState = EnemyBehaviourState.VICTIM;
    }

    @Override
    public PlaneState act(PlaneState myState, final PlaneState enemyState) {
//        действуем исходя из текущего состояния поведения
        if (enemyBehaviourState == EnemyBehaviourState.VICTIM) {
            if (myBehaviourState == MyBehaviourState.IDLE) {
                if (isDangerous(enemyState, myState)) {
                    myBehaviourState = MyBehaviourState.ESCAPE;
                } else {
                    myBehaviourState = MyBehaviourState.PURSUIT;
                }
            }
        }

    }


    private boolean isDangerous(PlaneState enemyStatem, PlaneState myState) {
        throw new NotImplementedException();
    }


    static enum EnemyBehaviourState {
        PREDATOR,
        VICTIM
    }

    public enum MyBehaviourState {
        IDLE,
        PURSUIT,
        ESCAPE,
        EVASION,
        FOLLOW_PRAISE
    }
}
