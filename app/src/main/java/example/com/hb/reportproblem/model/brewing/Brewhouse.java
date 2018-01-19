package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Brewhouse implements INode, ISimpleNode {
    IntakePit intakePit = new IntakePit();
    MaltStore maltStore = new MaltStore();
    MillingRoom millingRoom = new MillingRoom();
    MashGroup mashGroup = new MashGroup();
    MashFilter mashFilter = new MashFilter();
    WortGroupCooler wortGroupCooler = new WortGroupCooler();

    @Override
    public String getName() {
        return "Brewhouse";
    }

    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(intakePit.getName());
        list.add(maltStore.getName());
        list.add(millingRoom.getName());
        list.add(mashGroup.getName());
        list.add(mashFilter.getName());
        list.add(wortGroupCooler.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(intakePit);
        list.add(maltStore);
        list.add(millingRoom);
        list.add(mashGroup);
        list.add(mashFilter);
        list.add(wortGroupCooler);
        return list;
    }
}
