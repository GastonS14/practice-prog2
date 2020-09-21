package practice6.exercise2;

public class Main {

    public static void main(String[] args) {

        // Conditions for Tandil
        ForLowerAveragePrecipitation forLowerAveragePrecipitationTandil = new ForLowerAveragePrecipitation(2, 110);
        ForHigherMaximumTemperature forHigherMaximumTemperature = new ForHigherMaximumTemperature(4,25);
        And andTandil = new And(forLowerAveragePrecipitationTandil, forHigherMaximumTemperature);

        WeatherStation tandil = new WeatherStation("Tandil", andTandil);
        tandil.addRainPerHour(100.0);
        tandil.addRainPerHour(120.0);
        tandil.addRainPerHour(10.0);
        tandil.addTemperatureRecords(20.0);
        tandil.addTemperatureRecords(26.0);
        tandil.addTemperatureRecords(40.0);
        tandil.addTemperatureRecords(50.0);
        tandil.addTemperatureRecords(60.0);

        System.out.println("Lloverá en " + tandil.getName() + "? " + tandil.willRain());

        // Conditions for Vela
        ForHigherHumidity forHigherHumidity = new ForHigherHumidity(1, 54);

        WeatherStation vela = new WeatherStation("Vela", forHigherHumidity);
        vela.addHumidityRecords(40.0);
        vela.addHumidityRecords(6.0);
        vela.addHumidityRecords(60.0);

        System.out.println("Lloverá en " + vela.getName() + "? " + vela.willRain());

        // Conditions for Balcarce
        ForLowerAveragePrecipitation forLowerAveragePrecipitationBalcarce = new ForLowerAveragePrecipitation(2, 135);
        ForHigherMaximumTemperature forHigherMaximumTemperatureBalcarce = new ForHigherMaximumTemperature(3,28);
        And andBalcarce = new And(forLowerAveragePrecipitationBalcarce, forHigherMaximumTemperatureBalcarce);

        WeatherStation balcarce = new WeatherStation("Balcarce", andBalcarce);
        balcarce.addRainPerHour(100.0);
        balcarce.addRainPerHour(120.0);
        balcarce.addRainPerHour(10.0);
        balcarce.addTemperatureRecords(20.0);
        balcarce.addTemperatureRecords(30.0);
        balcarce.addTemperatureRecords(40.0);
        balcarce.addTemperatureRecords(50.0);

        System.out.println("Lloverá en " + balcarce.getName() + "? " + balcarce.willRain());

        // Conditions for Bahia Blanca
        ForHigherWindSpeed forHigherWindSpeed = new ForHigherWindSpeed(1, 35);
        ForLowerPrecipitation forLowerPrecipitation = new ForLowerPrecipitation(1,29);
        ForLowerAverageHumidity forLowerAverageHumidity = new ForLowerAverageHumidity(3,53);
        And b1 = new And(forHigherWindSpeed, forLowerPrecipitation);
        And andBahiablanca = new And(b1, forLowerAverageHumidity);

        WeatherStation bahiaBlanca = new WeatherStation("Bahia Blance", andBahiablanca);
        bahiaBlanca.addWindSpeedRecords(40.0);
        bahiaBlanca.addWindSpeedRecords(40.0);
        bahiaBlanca.addRainPerHour(40.0);
        bahiaBlanca.addRainPerHour(20.0);
        bahiaBlanca.addHumidityRecords(140.0);
        bahiaBlanca.addHumidityRecords(80.0);
        bahiaBlanca.addHumidityRecords(55.0);
        bahiaBlanca.addHumidityRecords(40.0);
        bahiaBlanca.addHumidityRecords(20.0);

        System.out.println("Lloverá en " + bahiaBlanca.getName() + "? " + bahiaBlanca.willRain());

        //Conditions for Azul
        ForHigherHumidity forHigherHumidityAzul = new ForHigherHumidity(1, 63);

        WeatherStation azul = new WeatherStation("Azul", forHigherHumidity);
        azul.addHumidityRecords(40.0);
        azul.addHumidityRecords(6.0);
        azul.addHumidityRecords(68.0);

        System.out.println("Lloverá en " + azul.getName() + "? " + azul.willRain());
    }
}
