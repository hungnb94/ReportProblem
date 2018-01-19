package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegChainConveyor implements INode, ISimpleNode {
//    Keg - Chain Convetor (Empty Keg)
//    Băng tải đầu vào
//    Các sensor
//    Xích
//    Khung băng tải
//    Cụm đẩy keg đầu vào

    @Override
    public String getName() {
        return "Keg - Chain Conveyor (Empty Keg)";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Chain Convetor (Empty Keg)");
        list.add("Băng tải đầu vào");
        list.add("Các sensor");
        list.add("Xích");
        list.add("Khung băng tải");
        list.add("Cụm đẩy keg đầu vào");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}