package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class CIPAndService implements INode, ISimpleNode {
    HotWater hotWater = new HotWater();
    HotCIP hotCIP = new HotCIP();
    ColdCIP coldCIP = new ColdCIP();
    BH_CIP bh_cip = new BH_CIP();
    CIPChemStore cipChemStore = new CIPChemStore();
    DosingChemStore dosingChemStore = new DosingChemStore();
    WasteArea wasteArea = new WasteArea();
    BrewhouseStore brewhouseStore = new BrewhouseStore();
    DAWTank dawTank = new DAWTank();
    Forklift forklift = new Forklift();

    @Override
    public String getName() {
        return "CIP & Service";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(hotWater.getName());
        list.add(hotCIP.getName());
        list.add(coldCIP.getName());
        list.add(bh_cip.getName());
        list.add(cipChemStore.getName());
        list.add(dosingChemStore.getName());
        list.add(wasteArea.getName());
        list.add(brewhouseStore.getName());
        list.add(dawTank.getName());
        list.add(forklift.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(hotWater);
        list.add(hotCIP);
        list.add(coldCIP);
        list.add(bh_cip);
        list.add(cipChemStore);
        list.add(dosingChemStore);
        list.add(wasteArea);
        list.add(brewhouseStore);
        list.add(dawTank);
        list.add(forklift);
        return list;
    }

    public class HotWater implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Hot water";
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

    public class HotCIP implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Hot CIP";
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

    public class ColdCIP implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Cold CIP";
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

    public class BH_CIP implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "BH CIP";
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

    public class CIPChemStore implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "CIP chem store";
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

    public class DosingChemStore implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Dosing chem store";
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

    public class WasteArea implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Waste area";
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

    public class BrewhouseStore implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Brewhouse store";
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

    public class DAWTank implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "DAW tank";
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

    public class Forklift implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Forklift";
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
}
