package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by hung on 1/12/2018.
 */

public class NguoiVietTag implements INode, ISimpleNode {
    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Đặng Hữu Kha");
        list.add("Đỗ Hải Quân");
        list.add("Đoàn Hồng Quảng");
        list.add("Đoàn Thị Thu Hằng");
        list.add("Giao Thế Việt");
        list.add("Hoàng Quốc Khánh");
        list.add("Lê Hữu Khải");
        list.add("Lê Huy Cường");
        list.add("Lê Thành Dương");
        list.add("Lê Văn Tuyển");
        list.add("Lê Xuân Chỉnh");
        list.add("Lưu Hải Đăng");
        list.add("Ngô Đình Thắng");
        list.add("Ngô Minh Thủy");
        list.add("Nguyễn Huy Thắng");
        list.add("Nguyễn Mạnh Hùng");
        list.add("Nguyễn Quốc Quân");
        list.add("PM Work Shop Meeting");
        list.add("Nguyễn Trọng Khuê");
        list.add("Nguyễn Văn Bằng");
        list.add("Phạm Xuân Hòa");
        list.add("Phạm Duy Vượng");
        list.add("Phạm Quang Thành");
        list.add("Trần Văn Nam");
        list.add("Trần Văn Nghĩa");
        list.add("Từ Phương Nam");
        list.add("Vũ Văn Dư");
        list.add("Phạm Hồng Tiến");
        list.add("Nguyễn Trần Kiên");
        list.add("Trần Trọng Lệ");
        list.add("Nguyễn Đình Huy");
        list.add("Lương Văn Minh");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }

    @Override
    public String getName() {
        return "Người Viết Tag";
    }
}
