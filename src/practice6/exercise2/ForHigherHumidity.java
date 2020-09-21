package practice6.exercise2;

public class ForHigherHumidity extends Rain{

    private int records;
    private double maxValueHumidity;

    public ForHigherHumidity(int records, double maxValueHumidity) {
        this.records = records;
        this.maxValueHumidity = maxValueHumidity;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getMaxValueHumidity() {
        return maxValueHumidity;
    }

    public void setMaxValueHumidity(double maxValueHumidity) {
        this.maxValueHumidity = maxValueHumidity;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getMaxHumidity(records) > this.maxValueHumidity;
    }
}



