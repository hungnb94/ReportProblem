package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CIPUnit2 implements INode,ISimpleNode {
//    CIP Unit-2
//    CIP tanks
//    Pumps and valves
//    Cabinet control and instrument divices
//    Safety divices
//    Can Pasteuriser-2
//    Infeed and outfeed conveyor
//    Hệ thống băng tải trung tâm
//    Hệ thống bơm tuần hoàn các khoang gia nhiệt
//    Hệ thống bơm tuần hoàn các khoang thanh trùng

    @Override
    public String getName() {
        return "CIP Unit-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("CIP Unit-2");
        list.add("CIP tanks");
        list.add("Pumps and valves");
        list.add("Cabinet control and instrument divices");
        list.add("Safety divices");
        list.add("Can Pasteuriser-2");
        list.add("Infeed and outfeed conveyor");
        list.add("Hệ thống băng tải trung tâm");
        list.add("Hệ thống bơm tuần hoàn các khoang gia nhiệt");
        list.add("Hệ thống bơm tuần hoàn các khoang thanh trùng");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}