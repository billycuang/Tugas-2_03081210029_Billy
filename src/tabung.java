
public class tabung {
    double phi=22.0/7;
    int r = 0, t = 0;
    public double hitungVolume(){    
        return phi*r*r*t;
    }
    public void displayVolume(){
        System.out.println("Volume: "+hitungVolume());
    }
}
