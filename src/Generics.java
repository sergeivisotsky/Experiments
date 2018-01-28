public class Generics {
    CarType<String> carType = new CarType<>();

}

class CarType<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
