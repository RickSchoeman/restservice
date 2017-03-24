package restservice;

/**
 * Created by ricks on 24-3-2017.
 */
public class Windmolen {
    double windsnelheid;
    double watt;
    double kwh;

    public void windmolen(){
    }

    public double getKwh(double windsnelheid){
        watt = 0.5 * 1.59 * (Math.PI * Math.pow(30, 2)) * Math.pow(windsnelheid, 3.0);
        kwh = watt * 1 / 1000;
        return kwh;
    }


}
