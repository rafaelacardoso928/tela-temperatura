
public class ConversorTemperatura {
    public double temperaturaCelsius;
    public int temperaturaFahrenheit;
    public String tipoClima;

    

    public  ConversorTemperatura(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        this.temperaturaFahrenheit = (int)(temperaturaCelsius *9/5) + 32;
        if (temperaturaFahrenheit <= 64.4) {
            this.tipoClima=  "O clima é frio";
        } else if (temperaturaFahrenheit >= 66.2 && this.temperaturaFahrenheit <= 73.4) {
            this.tipoClima = "O clima é agradável.";
        } else if (temperaturaFahrenheit >= 75.2 && this.temperaturaFahrenheit <= 95) {
            this.tipoClima = "O clima é quente.";
        } else if (temperaturaFahrenheit > 95){
            this.tipoClima = "O clima é muito quente";

        }

    }
    
      public  ConversorTemperatura(int temperaturaFahrenheit) {
        
        this.temperaturaFahrenheit = (temperaturaFahrenheit - 32) * 5/9;
        if (temperaturaCelsius <= 20) {
            this.tipoClima=  "O clima é frio";
        } else if (temperaturaCelsius >= 22 && temperaturaCelsius <= 27) {
            this.tipoClima = "O clima é agradável.";
        } else if (temperaturaCelsius >= 30 && temperaturaCelsius <= 38) {
            this.tipoClima = "O clima é quente.";
        } else if (temperaturaCelsius >= 41) {
            this.tipoClima = "O clima é muito quente";

        }

    }

    @Override
    public String toString() {
        return "temperaturaCelsius=" + temperaturaCelsius + ",\n temperaturaFahrenheit=" + temperaturaFahrenheit + ",\n tipoClima=" + tipoClima;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(int temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public String getTipoClima() {
        return tipoClima;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

}

