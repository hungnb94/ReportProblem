package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class WWTPArea implements INode, ISimpleNode {
    @Override
    public String getName() {
        return "WWTP area";
    }

    @Override
    public ArrayList<String> getList() {
        return null;
    }
}
