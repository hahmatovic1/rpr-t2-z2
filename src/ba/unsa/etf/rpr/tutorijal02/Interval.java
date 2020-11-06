package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    double pocetnaTacka, krajnjaTacka;
    boolean pocetnaPripada;
    boolean krajnjaPripada;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pocetnaPripada, boolean krajnjaPripada) {
        if(pocetnaTacka>krajnjaTacka) throw new IllegalAccessException("pocetna tacka veca od krajnje");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pocetnaPripada = true;
        this.krajnjaPripada = true;
    }

    public Interval(){
        pocetnaTacka = 0;
        krajnjaTacka = 0;
        pocetnaPripada = false;
        krajnjaPripada = false;
    }

    public boolean isNull(){
        if(pocetnaTacka == krajnjaTacka)
            return true;
        return false;
    }

    public boolean isIn(double tacka){
        if(pocetnaTacka<tacka && tacka<krajnjaTacka)
            return true;
        return false;
    }

    public Interval intersect(Interval interval){
        Interval presjek = new Interval();
        if(this.krajnjaTacka < interval.pocetnaTacka || interval.krajnjaTacka < this.pocetnaTacka)
            return presjek;
        if(this.krajnjaTacka <= interval.pocetnaTacka)
            presjek = new Interval(this.pocetnaTacka, interval.krajnjaTacka, true, true);
        else
            presjek = new Interval(interval.pocetnaTacka, interval.krajnjaTacka, true, true);
    }

    /*
    public static Interval(Interval i1, Interval i2){
        Interval presjek = new Interval();
        if(i1.krajnjaTacka == interval.pocetnaTacka || interval.krajnjaTacka == i1.pocetnaTacka)
            return presjek;
        if(i1`.krajnjaTacka <= interval.pocetnaTacka)
            presjek = new Interval(this.pocetnaTacka, interval.krajnjaTacka, true, true);
        else
            presjek = new Interval(interval.pocetnaTacka, interval.krajnjaTacka, true, true);
    }
    }
     */

}
