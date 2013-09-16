package ai;

/**
 * Created with IntelliJ IDEA.
 * User: alexeyk
 * Date: 12.09.13
 * Time: 9:07
 * To change this template use File | Settings | File Templates.
 */
public class EasyAI extends AI {
    private MyBehaviourState myBehaviourState;
    private EnemyBehaviourState enemyBehaviourState;


    public EasyAI() {
        this.myBehaviourState = new IdleBehaviourState();
        this.enemyBehaviourState = EnemyBehaviourState.VICTIM;
    }

    @Override
    public PlaneState act(PlaneState myState, final PlaneState enemyState) {
//        действуем исходя из текущего состояния поведения
        this.enemyBehaviourState = getEnemyBehaviourState();
        return myBehaviourState.act(myState, enemyState, this.enemyBehaviourState);
    }

    EnemyBehaviourState getEnemyBehaviourState() {
        throw new NotImplementedException();
    }


    private boolean isDangerous(PlaneState enemyStatem, PlaneState myState) {
        throw new NotImplementedException();
    }


    static enum EnemyBehaviourState {
        PREDATOR,
        VICTIM
    }
}
