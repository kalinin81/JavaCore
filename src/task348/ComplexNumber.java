package task348;


import java.util.Objects;

public class ComplexNumber {

    private double re;
    private double im;

    public static void main(String[] args){
        ComplexNumber cn=new ComplexNumber(1D,2D);
        int h=cn.hashCode();
        System.out.println(h);
    }
    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.getRe(), getRe()) == 0 &&
                Double.compare(that.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        double re=getRe();
        double im=getIm();
        return Objects.hash(re, im);
    }
}
