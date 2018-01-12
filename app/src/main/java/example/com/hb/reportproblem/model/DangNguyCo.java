package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by hung on 1/12/2018.
 */

public class DangNguyCo implements INode, ISimpleNode {
    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("S1: Thiếu cảnh báo, hướng dẫn an toàn");
        list.add("S2: Nguy hiểm liên quan tới hóa chất");
        list.add("S3: Nguy cơ về điện");
        list.add("S4: Nguy cơ gây bỏng (Bỏng nóng - Bỏng lạnh)");
        list.add("S5: Nguy cơ ngã từ trên cao");
        list.add("S6: Nguy cơ ngã do sàn trơn trượt");
        list.add("S7: Va chạm với chi tiết cố định, vật sắc nhọn");
        list.add("S8: Va chạm với chi tiết, thiết bị chuyển động");
        list.add("S9: Nguy cơ cháy nổ (Chai nổ)");
        list.add("S10-1: Nguy cơ về môi trường: Mùi (hóa chất)");
        list.add("S10-2: Nguy cơ về môi trường: Bụi (Bụi phổi silic…)");
        list.add("S10-3: Nguy cơ về môi trường: Rác");
        list.add("S10-4: Nguy cơ về môi trường: Độ ồn cao");
        list.add("S10-5: Nguy cơ về môi trường: Thiếu sáng");
        list.add("S10-6: Nguy cơ về môi trường: Thiếu khí, thông khí kém");
        list.add("S11: Nguy cơ khác");
        list.add("S12: Nguy cơ liên quan tới sản phẩm");
        list.add("");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }

    @Override
    public String getName() {
        return "Dạng Nguy Cơ Về An Toàn";
    }
}
