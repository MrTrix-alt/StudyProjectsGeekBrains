package ClassesAndMethodes.Testinn;

interface Calc {

    double sum();
    double diff();
    double prod();
    double division();

    default double abs(double _numb) {
        return Math.abs(_numb);
    }
    default double square(double _numb) {
        return _numb * _numb;
    }
    default double squareNumb(double _numb1, double _numb2) {
        return Math.pow(_numb1, _numb2);
    }
}
