package entity.Exercise1;

public abstract class HinhHoc implements TinhS_C {
    private static int count;

    public HinhHoc()  throws Exception{
        if (count > Configs.SO_LUONG_HINH_TOI_DA) {
            throw new Exception("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
    }
}
