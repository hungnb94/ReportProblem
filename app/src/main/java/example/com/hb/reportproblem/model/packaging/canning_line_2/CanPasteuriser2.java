package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CanPasteuriser2 implements INode, ISimpleNode {
//    Can Pasteuriser-2
//    Infeed and outfeed conveyor
//    Hệ thống băng tải trung tâm
//    Hệ thống bơm tuần hoàn các khoang gia nhiệt
//    Hệ thống bơm tuần hoàn các khoang thanh trùng
//    Hệ thống bơm tuần hoàn các khoang làm mát
//    Valves and Instrument divices
//    Hệ thống khí nén cung cấp cho máy
//    Hệ thống bơm dosing hóa chất
//    Hệ thống hơi và giàn trao đổi nhiệt
//    Hệ thống điều khiển và tủ điện
//    Các thiết bị an toàn

    @Override
    public String getName() {
        return "Can Pasteuriser-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Can Pasteuriser-2");
        list.add("Infeed and outfeed conveyor");
        list.add("Hệ thống băng tải trung tâm");
        list.add("Hệ thống bơm tuần hoàn các khoang gia nhiệt");
        list.add("Hệ thống bơm tuần hoàn các khoang thanh trùng");
        list.add("Hệ thống bơm tuần hoàn các khoang làm mát");
        list.add("Valves and Instrument divices");
        list.add("Hệ thống khí nén cung cấp cho máy");
        list.add("Hệ thống bơm dosing hóa chất");
        list.add("Hệ thống hơi và giàn trao đổi nhiệt");
        list.add("Hệ thống điều khiển và tủ điện");
        list.add("Các thiết bị an toàn");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}