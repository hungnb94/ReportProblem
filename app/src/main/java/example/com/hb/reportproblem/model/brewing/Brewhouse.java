package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Brewhouse implements INode, ISimpleNode {
    IntakePit intakePit;
    MaltStore maltStore;
    MillingRoom millingRoom;
    MashGroup mashGroup;
    MashFilter mashFilter;
    WortGroupCooler wortGroupCooler;

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

    public class IntakePit implements ISimpleNode {
        @Override
        public String getName() {
            return "Intake pit";
        }
    }

    public class MaltStore implements ISimpleNode {
        @Override
        public String getName() {
            return "Malt store";
        }
    }

    public class MillingRoom implements ISimpleNode {
        @Override
        public String getName() {
            return "Milling room";
        }
    }

    public class MashGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Mash group";
        }
    }

    public class MashFilter implements ISimpleNode {
        @Override
        public String getName() {
            return "Mash filter";
        }
    }

    public class WortGroupCooler implements ISimpleNode {
        @Override
        public String getName() {
            return "Wort group & cooler";
        }
    }
}
