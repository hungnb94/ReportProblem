package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottleWasher implements INode, ISimpleNode {
//    Bottle Washer Machine Group
//    Hệ thống khí nén
//    Băng tải đầu vào/ Bàn chai
//    Băng tải đầu ra
//    Pre-jetting tank
//    Main Caustic tank 1
//    Main Caustic tank 2
//    Post Caustic tank
//    Warm water tank 1
//    Warm water tank 2
//    Warm water tank3
//    Fresh water tank
//    Steam supply & condensate
//    Hệ thống cấp nước soft
//    Hệ thống dosing hóa chất
//    Các băng tải nhãn
//    Sàn, nóc máy
//    Các động cơ/mô tơ
//    Các thiết bị an toàn của máy
//    Hệ thống bôi trơn băng tải
//    Hệ thống điện và điều khiển

    @Override
    public String getName() {
        return "Bottle Washer";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Washer Machine Group");
        list.add("Hệ thống khí nén");
        list.add("Băng tải đầu vào/ Bàn chai");
        list.add("Băng tải đầu ra");
        list.add("Pre-jetting tank");
        list.add("Main Caustic tank 1");
        list.add("Main Caustic tank 2");
        list.add("Post Caustic tank");
        list.add("Warm water tank 1");
        list.add("Warm water tank 2");
        list.add("Warm water tank3");
        list.add("Fresh water tank");
        list.add("Steam supply & condensate");
        list.add("Hệ thống cấp nước soft");
        list.add("Hệ thống dosing hóa chất");
        list.add("Các băng tải nhãn");
        list.add("Sàn, nóc máy");
        list.add("Các động cơ/mô tơ");
        list.add("Các thiết bị an toàn của máy");
        list.add("Hệ thống bôi trơn băng tải");
        list.add("Hệ thống điện và điều khiển");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}