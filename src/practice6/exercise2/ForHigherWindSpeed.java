package practice6.exercise2;

public class ForHigherWindSpeed extends Rain{

    private int records;
    private double maxValueWindSpeed;

    public ForHigherWindSpeed(int records, double maxValueWindSpeed) {
        this.records = records;
        this.maxValueWindSpeed = maxValueWindSpeed;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getMaxValueWindSpeed() {
        return maxValueWindSpeed;
    }

    public void setMaxValueWindSpeed(double maxValueWindSpeed) {
        this.maxValueWindSpeed = maxValueWindSpeed;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getWindSpeed(records) > this.maxValueWindSpeed;
    }
}