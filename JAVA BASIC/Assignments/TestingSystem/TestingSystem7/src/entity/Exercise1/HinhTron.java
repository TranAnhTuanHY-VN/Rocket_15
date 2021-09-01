package entity.Exercise1;

public class HinhTron extends HinhHoc{
    private float R;
    private final float pi=3.14f;

    public HinhTron(float R) throws Exception {
        this.R = R;
    }

    @Override
    public float dienTich(float a, float b) {
        return 0;
    }

    @Override
    public float chuVi(float a, float b) {
        return 0;
    }

    @Override
    public float dienTich(float R) {
        return (float) Math.pow((pi*R),2);
    }

    @Override
    public float chuVi(float R) {
        return 2*pi*R;
    }
}
