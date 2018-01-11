package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class CIPAndService implements INode, ISimpleNode {
    HotWater hotWater;
    HotCIP hotCIP;
    ColdCIP coldCIP;
    BH_CIP bh_cip;
    CIPChemStore cipChemStore;
    DosingChemStore dosingChemStore;
    WasteArea wasteArea;
    BrewhouseStore brewhouseStore;
    DAWTank dawTank;
    Forklift forklift;

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

    public class HotWater implements ISimpleNode {
        @Override
        public String getName() {
            return "Hot water";
        }
    }

    public class HotCIP implements ISimpleNode {
        @Override
        public String getName() {
            return "Hot CIP";
        }
    }

    public class ColdCIP implements ISimpleNode {
        @Override
        public String getName() {
            return "Cold CIP";
        }
    }

    public class BH_CIP implements ISimpleNode {
        @Override
        public String getName() {
            return "BH CIP";
        }
    }

    public class CIPChemStore implements ISimpleNode {
        @Override
        public String getName() {
            return "CIP chem store";
        }
    }

    public class DosingChemStore implements ISimpleNode {
        @Override
        public String getName() {
            return "Dosing chem store";
        }
    }

    public class WasteArea implements ISimpleNode {
        @Override
        public String getName() {
            return "Waste area";
        }
    }

    public class BrewhouseStore implements ISimpleNode {
        @Override
        public String getName() {
            return "Brewhouse store";
        }
    }

    public class DAWTank implements ISimpleNode {
        @Override
        public String getName() {
            return "DAW tank";
        }
    }

    public class Forklift implements ISimpleNode {
        @Override
        public String getName() {
            return "Forklift";
        }
    }
}
