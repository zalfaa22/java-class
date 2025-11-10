package latihanClass;
class Segitiga {
    private double a, t, sisiA, sisiB, sisiC;

    public Segitiga(double a, double t, double sisiA, double sisiB, double sisiC) {
        this.a = a;
        this.t = t;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double getAlas() {return a;} 
    public void setAlas(double a) {this.a = a;} 

    public double getTinggi() {return t;}
    public void setTinggi(double t) {this.t = t;}

    public double getSisiA() {return sisiA;}
    public void setSisiA(double sisiA) {this.sisiA = sisiA;}

    public double getSisiB() {return sisiB;}
    public void setSisiB(double sisiB) {this.sisiB = sisiB;}

    public double getSisiC() {return sisiC;}
    public void setSisiC(double sisiC) {this.sisiC = sisiC;}

    public double getLuas() {
        return 0.5 * a * t;
    }

    public double getKeliling() {
        return sisiA + sisiB + sisiC;
    }
}

class Persegi {
    private double s;

    public Persegi(double s) {
        this.s = s;
    }

    public double getSisi() {return s;} 
    public void setSisi(double s) {this.s = s;} 

    public double getLuas() {
        return s * s;
    }

    public double getKeliling() {
        return s * 4;
    }
}

class Lingkaran {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getJariJari() {return r;}
    public void setJariJari(double r) { this.r = r; }

    public double getLuas() {
        return Math.PI * r * r;
    }

    public double getKeliling() {
        return 2 * Math.PI * r;
    }
}