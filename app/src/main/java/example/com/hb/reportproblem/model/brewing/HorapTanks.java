package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class HorapTanks implements INode, ISimpleNode {
//    Horap tanks
//    Horap tanks 111
//    Horap tanks 112
//    Horap tanks 121
//    Horap tanks 122
//    Horap tanks 311

    @Override
    public String getName() {
        return "Horap tanks";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Horap tanks");
        list.add("Horap tanks 111");
        list.add("Horap tanks 112");
        list.add("Horap tanks 121");
        list.add("Horap tanks 122");
        list.add("Horap tanks 311");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}