package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottleUnpacker implements INode, ISimpleNode {
//    Bottle Unpacker Machine Group
//    Băng tải crate đầu vào
//    Băng tải crate đầu ra
//    Các thiết bị an toàn của máy
//    Gầm máy, thành máy
//    Băng tải chai đầu ra
//    Băng tải bàn chai
//    Băng tải crate trung tâm
//    Giàn gắp chai
//    Cụm tay CAM ra vào
//    Hệ thống khí nén
//    Hệ thống điện và điều khiển
//    Hệ thống bôi trơn băng tải

    @Override
    public String getName() {
        return "Bottle Unpacker";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Unpacker Machine Group");
        list.add("Băng tải crate đầu vào");
        list.add("Băng tải crate đầu ra");
        list.add("Các thiết bị an toàn của máy");
        list.add("Gầm máy, thành máy");
        list.add("Băng tải chai đầu ra");
        list.add("Băng tải bàn chai");
        list.add("Băng tải crate trung tâm");
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