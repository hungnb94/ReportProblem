package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottlePacker implements INode, ISimpleNode {
//    Bottle Packer Machine Group
//    Băng tải crate đầu vào
//    Băng tải crate đầu ra
//    Các thiết bị an toàn của máy
//    Gầm máy, Thành máy, Khung máy
//    Băng tải chai đầu vào
//    Băng tai bàn chai
//    Băng tải trung tâm
//    FCI
//    Giàn gắp chai
//    Cụm tay CAM ra vào
//    Hệ thống khí nén
//    Hệ thống điện và điều khiển
//    Hệ thống bôi trơn băng tải

    @Override
    public String getName() {
        return "Bottle Packer";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Packer Machine Group");
        list.add("Băng tải crate đầu vào");
        list.add("Băng tải crate đầu ra");
        list.add("Các thiết bị an toàn của máy");
        list.add("Gầm máy, Thành máy, Khung máy");
        list.add("Băng tải chai đầu vào");
        list.add("Băng tai bàn chai");
        list.add("Băng tải trung tâm");
        list.add("FCI");
        list.add("Giàn gắp chai");
        list.add("Cụm tay CAM ra vào");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống điện và điều khiển");
        list.add("Hệ thống bôi trơn băng tải");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}