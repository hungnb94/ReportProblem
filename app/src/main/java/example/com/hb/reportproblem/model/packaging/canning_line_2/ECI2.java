package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class ECI2 implements INode, ISimpleNode {
//    ECI-2
//    ECI conveyors
//    Cameras system
//    Air compressure system
//    ECI instrument divices

    @Override
    public String getName() {
        return "ECI-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("ECI-2");
        list.add("ECI conveyors");
        list.add("Cameras system");
        list.add("Air compressure system");
        list.add("ECI instrument divices");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}