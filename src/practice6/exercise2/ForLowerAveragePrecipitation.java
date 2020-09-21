package practice6.exercise2;

public class ForLowerAveragePrecipitation extends Rain{

    private int records;
    private double valuePrecipitation;

    public ForLowerAveragePrecipitation(int records, double valuePrecipitation) {
        this.records = records;
        this.valuePrecipitation = valuePrecipitation;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getValuePrecipitation() {
        return valuePrecipitation;
    }

    public void setValuePrecipitation(double valuePrecipitation) {
        this.valuePrecipitation = valuePrecipitation;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getAverageRain(records) < this.valuePrecipitation;
    }
}
