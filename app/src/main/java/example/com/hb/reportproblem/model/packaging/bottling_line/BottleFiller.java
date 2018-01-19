package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottleFiller implements INode, ISimpleNode {
//    Bottle Filler Machine Group
//    Băng tải đầu vào
//    Băng tải đầu ra
//    Starwheel
//            Crowner
//    Ringbowl
//    Van chiết
//    Hệ thống điện và điều khiển
//    Băng tải nắp
//    Cụm van Matrix
//    Hệ thống khí nén, CO2
//    Hệ thống hút chân không
//    Gầm máy, thành máy
//    Caustic Detector
//    Các thiết bị an toàn của máy
//    Hệ thống bôi trơn băng tải
//    Hệ thống HPI
//            FHI1

    @Override
    public String getName() {
        return "Bottle Filler";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Filler Machine Group");
        list.add("Băng tải đầu vào");
        list.add("Băng tải đầu ra");
        list.add("Starwheel");
        list.add("Crowner");
        list.add("Ringbowl");
        list.add("Van chiết");
        list.add("Hệ thống điện và điều khiển");
        list.add("Băng tải nắp");
        list.add("Cụm van Matrix");
        list.add("Hệ thống khí nén, CO2");
        list.add("Hệ thống hút chân không");
        list.add("Gầm máy, thành máy");
        list.add("Caustic Detector");
        list.add("Các thiết bị an toàn của máy");
        list.add("Hệ thống bôi trơn băng tải");
        list.add("Hệ thống HPI");
        list.add("FHI1");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}