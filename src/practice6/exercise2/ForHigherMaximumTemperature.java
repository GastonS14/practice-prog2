package practice6.exercise2;

public class ForHigherMaximumTemperature extends Rain{

    private int records;
    private double maxValueTemperature;

    public ForHigherMaximumTemperature(int records, double maxValueTemperature) {
        this.records = records;
        this.maxValueTemperature = maxValueTemperature;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getMaxValueTemperature() {
        return maxValueTemperature;
    }

    public void setMaxValueTemperature(double maxValueTemperature) {
        this.maxValueTemperature = maxValueTemperature;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getMinTemperature(records) > this.maxValueTemperature;
    }
}


