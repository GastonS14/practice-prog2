package practice6.exercise2;

public class ForLowerPrecipitation extends Rain{

    private int records;
    private double maxValuePrecipitation;

    public ForLowerPrecipitation(int records, double maxValuePrecipitation) {
        this.records = records;
        this.maxValuePrecipitation = maxValuePrecipitation;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getMaxValuePrecipitation() {
        return maxValuePrecipitation;
    }

    public void setMaxValuePrecipitation(double maxValuePrecipitation) {
        this.maxValuePrecipitation = maxValuePrecipitation;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getLowestPrecipitation(records) < this.maxValuePrecipitation;
    }
}

