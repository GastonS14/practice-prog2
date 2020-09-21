package practice6.exercise2;

public class And  extends Rain{

    private Rain condition;
    private Rain condition2;

    public And(Rain condition, Rain condition2){
        this.condition = condition;
        this.condition2 = condition2;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return condition.willRain(ws) && condition2.willRain(ws);
    }

}
