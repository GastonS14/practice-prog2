package practice6.exercise2;

public class ForLowerAverageHumidity extends Rain{

    private int records;
    private double valueHumidity;

    public ForLowerAverageHumidity(int records, double valueHumidity) {
        this.records = records;
        this.valueHumidity = valueHumidity;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public double getValueHumidity() {
        return valueHumidity;
    }

    public void setValueHumidity(double valueHumidity) {
        this.valueHumidity = valueHumidity;
    }

    @Override
    public boolean willRain(WeatherStation ws) {
        return ws.getAverageHumidity(records) < this.valueHumidity;
    }
}

