package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottlePasteuriser implements INode, ISimpleNode {
//    Bottle Pasteuriser
//    Cụm motors bơm tuần hoàn
//    Thành máy, khung máy
//    Hệ thống cấp nước
//    Hệ thống cấp hơi và trao đổi nhiệt
//    Hệ thống làm lạnh
//    Hệ thống Dosing hóa chất
//    Băng tải đầu vào
//    Băng tải đầu ra và air blower
//    Hệ thống cấp khí nén
//    Hệ thống điện và điều khiển
//    Các thiết bị an toàn của máy
//    Hệ thống bôi trơn băng tải

    @Override
    public String getName() {
        return "Bottle Pasteuriser";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Pasteuriser");
        list.add("Cụm motors bơm tuần hoàn");
        list.add("Thành máy, khung máy");
        list.add("Hệ thống cấp nước");
        list.add("Hệ thống cấp hơi và trao đổi nhiệt");
        list.add("Hệ thống làm lạnh");
        list.add("Hệ thống Dosing hóa chất");
        list.add("Băng tải đầu vào");
        list.add("Băng tải đầu ra và air blower");
        list.add("Hệ thống cấp khí nén");
        list.add("Hệ thống điện và điều khiển");
        list.add("Các thiết bị an toàn của máy");
        list.add("Hệ thống bôi trơn băng tải");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}