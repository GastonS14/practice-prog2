package practice6.exercise2;

import java.util.Collections;
import java.util.Vector;

public class WeatherStation {

    private String name;
    private Vector<Double> temperatureRecords;
    private Vector<Double> humidityRecords;
    private Vector<Double> windSpeedRecords;
    private Vector<Double> rainPerHourRecords;
    private Rain rain;

    public WeatherStation(String name, Rain rain) {
        this.name = name;
        temperatureRecords = new Vector<>();
        humidityRecords = new Vector<>();
        windSpeedRecords = new Vector<>();
        rainPerHourRecords = new Vector<>();
        this.rain = rain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTemperatureRecords(Double temperature) {
        temperatureRecords.add(temperature);
    }

    public void removeTemperatureRecords(Double temperature) {
        temperatureRecords.remove(temperature);
    }

    /**
     * if records > Vector.size() throws Null pointer exception
     * @param records range of the vector
     * @return the lowest value of the highest temperatures in a range of temperatureRecords
     */
    public double getMinTemperature(int records) {
        return this.getMin(temperatureRecords, records);
    }

    public void addHumidityRecords(Double humidity) {
        humidityRecords.add(humidity);
    }

    public void removeHumidityRecords(Double humidity) {
        humidityRecords.remove(humidity);
    }

    /**
     * if records > Vector.size() throws Null pointer exception
     * @param records range of the vector
     * @return the average of the humidityRecords range
     */
    public double getAverageHumidity(int records) {
        double aux = 0;
        for(int i=humidityRecords.size()-1; i>= humidityRecords.size()-records; i--)
            aux+=humidityRecords.elementAt(i);
        return aux/records;
    }

    /**
     * @param records range of the vector
     * @return the highest number of the humidityRecords in a range
     */
    public double getMaxHumidity(int records){
        return this.getMax(humidityRecords, records);
    }

    public void addWindSpeedRecords(Double windSpeed) {
        windSpeedRecords.add(windSpeed);
    }

    public void removeWindSpeedRecords(Double windSpeed) {
        windSpeedRecords.remove(windSpeed);
    }

    /**
     * @param records range of the vector
     * @return the highest number of the windSpeedRecords in a range
     */
    public double getWindSpeed(int records) {
        return this.getMax(windSpeedRecords, records);
    }

    public void addRainPerHour(Double rain) {
        rainPerHourRecords.add(rain);
    }

    public void removeRainPerHour(Double rain) {
        rainPerHourRecords.remove(rain);
    }

    /**
     * if records > Vector.size() throws Null pointer exception
     * @param records range of the vector
     * @return the average of the rainPerHourRecords range
     */
    public double getAverageRain(int records) {
        double aux = 0;
        for(int i=rainPerHourRecords.size()-1; i>= rainPerHourRecords.size()-records; i--)
            aux+=rainPerHourRecords.elementAt(i);
        return aux/records;
    }

    public double getLowestPrecipitation(int records){
        return this.getMax(rainPerHourRecords, records);
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public boolean willRain(){
        return rain.willRain(this);
    }

    /**
     * if range > Vector.size() throws Null pointer exception
     * @param range range of the vector
     * @return the highest number of the Vector in a range
     */
    private double getMax(Vector<Double> a, int range){
        Vector<Double> aux = new Vector<>();
        for(int i=a.size()-1; i>= a.size()-range; i--)
            aux.add(a.elementAt(i));
        Collections.sort(aux);
        Collections.reverse(aux);
        return aux.firstElement();
    }

    /**
     * if range > Vector.size() throws Null pointer exception
     * @param range range of the vector
     * @return the lowest number of the Vector in a range
     */
    private double getMin(Vector<Double> a, int range){
        Vector<Double> aux = new Vector<>();
        for(int i=a.size()-1; i>= a.size()-range; i--)
            aux.add(a.elementAt(i));
        Collections.sort(aux);
        return aux.firstElement();
    }
}
