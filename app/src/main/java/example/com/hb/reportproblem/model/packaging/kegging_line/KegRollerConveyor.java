package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegRollerConveyor implements INode, ISimpleNode {
//    Keg - Roller Convetor (Full Keg)
//    Roller
//    Các sensor
//    Khung băng tải
//    Cảm biến nhiệt
//            Pusher
//    Cụm đỡ keg đầu ra

    @Override
    public String getName() {
        return "Keg - Roller Conveyor (Full Keg)";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Roller Convetor (Full Keg)");
        list.add("Roller");
        list.add("Các sensor");
        list.add("Khung băng tải");
        list.add("Cảm biến nhiệt");
        list.add("Pusher");
        list.add("Cụm đỡ keg đầu ra");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}