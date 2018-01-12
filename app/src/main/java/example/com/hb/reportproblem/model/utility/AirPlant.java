package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;
import example.com.hb.reportproblem.model.utility.CO2Area.ControlAndElectricSystem;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class AirPlant implements INode, ISimpleNode {
//    Control and electric system
//    Well pump
//    Trickler
//    Hệ thống lọc
//    RO
//    Lọc than
//    Soft water tank
//    Product water tank
//    Boiler feed pumps and tank
//    Valves and piping system

    ControlAndElectricSystem controlAndElectricSystem = new ControlAndElectricSystem();
    WellPump wellPump = new WellPump();
    Trickler trickler = new Trickler();
    HeThongLoc heThongLoc = new HeThongLoc();
    RO ro = new RO();
    LocThan locThan = new LocThan();
    SoftWaterTank softWaterTank = new SoftWaterTank();
    ProductTaterTank productTaterTank = new ProductTaterTank();
    BoilerFeedPumpsAndTank boilerFeedPumpsAndTank = new BoilerFeedPumpsAndTank();
    ValvesAndPipingSystem valvesAndPipingSystem = new ValvesAndPipingSystem();

    @Override
    public String getName() {
        return "Air plant";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(controlAndElectricSystem.getName());
        list.add(wellPump.getName());
        list.add(trickler.getName());
        list.add(heThongLoc.getName());
        list.add(ro.getName());
        list.add(locThan.getName());
        list.add(softWaterTank.getName());
        list.add(productTaterTank.getName());
        list.add(boilerFeedPumpsAndTank.getName());
        list.add(valvesAndPipingSystem.getName());
        return list;
    }

    @Override
    public ArrayList getChilds() {
        ArrayList list = new ArrayList<>();
        list.add(controlAndElectricSystem);
        list.add(wellPump);
        list.add(trickler);
        list.add(heThongLoc);
        list.add(ro);
        list.add(locThan);
        list.add(softWaterTank);
        list.add(productTaterTank);
        list.add(boilerFeedPumpsAndTank);
        list.add(valvesAndPipingSystem);
        return list;
    }

//    public class ControlAndElectricSystem implements ISimpleNode{
//        @Override
//        public String getName() {
//            return "Control and electric system";
//        }
//    }

    public class WellPump implements ISimpleNode {
        @Override
        public String getName() {
            return "Well pump";
        }
    }

    public class Trickler implements ISimpleNode {
        @Override
        public String getName() {
            return "Trickler";
        }
    }

    public class HeThongLoc implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống lọc";
        }
    }

    public class RO implements ISimpleNode {
        @Override
        public String getName() {
            return "RO";
        }
    }

    public class LocThan implements ISimpleNode {
        @Override
        public String getName() {
            return "Lọc than";
        }
    }

    public class SoftWaterTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Soft water tank";
        }
    }

    public class ProductTaterTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Product water tank";
        }
    }

    public class BoilerFeedPumpsAndTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Boiler feed pumps and tank";
        }
    }

    public class ValvesAndPipingSystem implements ISimpleNode {
        @Override
        public String getName() {
            return "Valves and piping system";
        }
    }
}
