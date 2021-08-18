package entity.Exercise1;

public class HinhChuNhat extends HinhHoc{
    private float a;
    private float b;

    public HinhChuNhat(float a, float b) throws Exception {
        this.a = a;
        this.b = b;
    }

    @Override
    public float dienTich(float a, float b) {
        return a*b;
    }

    @Override
    public float chuVi(float a, float b) {
        return (a + b) * 2;
    }

    @Override
    public float dienTich(float a) {
        return 0;
    }

    @Override
    public float chuVi(float a) {
        return 0;
    }
}
