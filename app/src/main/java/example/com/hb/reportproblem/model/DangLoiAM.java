package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by hung on 1/12/2018.
 */

public class DangLoiAM implements INode, ISimpleNode {
    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A1 - Hoạt động bất thường");
        list.add("A2 - 1. Hỏng linh kiện điện");
        list.add("A2 - 2. Hỏng linh kiện cơ khí");
        list.add("A3 - Mất bu lông, con tán, chi tiết");
        list.add("A4 - Khó làm vệ sinh");
        list.add("A5 - Khó kiểm tra");
        list.add("A6 - Khó bôi trơn");
        list.add("A7 - 1. Tiếng ồn quá mức quy định");
        list.add("A7 - 2. Rung, lắc, mùi khét");
        list.add("A8 - 1. Nhiệt độ bất thường");
        list.add("A8 - 2. Áp lực bất thường");
        list.add("A9 - Thiếu, dư bôi trơn");
        list.add("A10 - 1.Rò rỉ khí, CO2 (Nguy Hiểm)");
        list.add("A10 - 2.Rò rỉ nước ra ngoài");
        list.add("A10 - 3.Rò rỉ dầu, mỡ bôi trơn");
        list.add("A10 - 4.Rò rỉ steam, hơi nóng, nước nóng (Nguy Hiểm)");
        list.add("A11 - 1.Tổn thất, rò rỉ nguyên vật liệu");
        list.add("A11 - 2.Tổn thất, rò rỉ thành phẩm");
        list.add("A11 - 3.Tổn thất, rò rỉ hoá chất (Nguy Hiểm)");
        list.add("A12 - Dây điện, khí bố trí không gọn gàng");
        list.add("A13 - Thiếu thông tin nhận dạng");
        list.add("A14 - Chi tiết quay không được che chắn");
        list.add("A15 - 1. Thiếu xắp xếp bố trí nơi làm việc (5S)");
        list.add("A15 - 2. Thiếu vệ sinh");
        list.add("A15 - 3. Linh kiện không cần thiết, thừa");
        list.add("A15 - 4. Thiếu chỉ dẫn");
        list.add("A15 - 5. Rỉ xét");
        list.add("A15 - 6. Không an toàn cho thiết bị hoặc con người");
        list.add("A15 - 7. Thiếu nắp đậy");
        list.add("A15 - 8. Lỏng bu lông");
        list.add("A15 - 9. Xích trùng");
        list.add("A15 - 10. Chương trình lỗi");
        list.add("A15 - 11. Khu vực trơn trượt");
        list.add("A15 - 12. Thường xuyên bám dính chất gây bẩn");
        list.add("A15 - 13. Nhiệt độ cao mà không có cảnh báo");
        list.add("A15 - 14. Khó vận hành, thao tác");
        list.add("A15 - 15. Thiếu kiểm tra");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }

    @Override
    public String getName() {
        return "Dạng Lỗi Về AM";
    }
}
