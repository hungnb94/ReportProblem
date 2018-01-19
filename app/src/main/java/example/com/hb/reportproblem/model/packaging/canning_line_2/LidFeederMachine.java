package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class LidFeederMachine implements INode, ISimpleNode {

    @Override
    public String getName() {
        return "Lid Feeder Machine";
    }

    @Override
    public ArrayList<String> getList() {
        return null;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}