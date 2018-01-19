package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CartonPalletiser2 implements INode, ISimpleNode {
//    Carton Palletiser-2
//    Hệ thống băng tải đầu vào
//    Hệ thống băng tải chia carton
//    Hệ thống băng tải xếp lớp
//    Hệ thống băng tải robot trung tâm
//    Robot nâng hạ trung tâm
//    Hệ thống khí nén
//    Hệ thống bơm mỡ tự động
//    Hệ thống băng tải pallet magazine đầu vào
//    Hệ thống băng tải full pallet đầu ra
//    Hệ thống băng tải bàn xoay
//    Hệ thống điều khiển và thiết bị điện
//    Các thiết bị an toàn

    @Override
    public String getName() {
        return "Carton Palletiser-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Carton Palletiser-2");
        list.add("Hệ thống băng tải đầu vào");
        list.add("Hệ thống băng tải chia carton");
        list.add("Hệ thống băng tải xếp lớp");
        list.add("Hệ thống băng tải robot trung tâm");
        list.add("Robot nâng hạ trung tâm");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống bơm mỡ tự động");
        list.add("Hệ thống băng tải pallet magazine đầu vào");
        list.add("Hệ thống băng tải full pallet đầu ra");
        list.add("Hệ thống băng tải bàn xoay");
        list.add("Hệ thống điều khiển và thiết bị điện");
        list.add("Các thiết bị an toàn");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}