package Task8;

import java.util.Objects;

public class CustomDouble {
    private int whole;
    private double fraction;

    public CustomDouble(double value) {
        this.whole = (int) value;
        this.fraction = value - this.whole;
    }

    public int getWhole() {
        return whole;
    }

    public void setWhole(final int whole) {
        this.whole = whole;
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(final double fraction) {
        if (fraction < 1 && fraction > -1) {
            this.fraction = fraction;
        }
        else {
            throw new IllegalArgumentException("Second parameter is not a fraction number");
        }
    }

    public double toDouble (){
        return (double)this.whole + this.fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return this.toDouble() == that.toDouble();
    }

    @Override
    public int hashCode() {
        return Objects.hash(whole, fraction);
    }

    public CustomDouble sum (CustomDouble x){
        return new CustomDouble(this.toDouble() + x.toDouble());
    }

    public CustomDouble diff (CustomDouble x){
        return new CustomDouble(this.toDouble() - x.toDouble());
    }

    public CustomDouble mult (CustomDouble x){
        return new CustomDouble(this.toDouble() * x.toDouble());
    }

    public CustomDouble div (CustomDouble x){
        if (x.toDouble() != 0) {
            return new CustomDouble(this.toDouble() / x.toDouble());
        }
        else{
            throw new IllegalArgumentException("Parameter can't be 0");
        }
    }
}
