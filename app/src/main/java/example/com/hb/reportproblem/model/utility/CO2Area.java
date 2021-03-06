package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class CO2Area implements INode, ISimpleNode {
//    CO2 washer 1
//    CO2 washer 2
//    CO2 Compressor 1
//    CO2 Compressor 2
//    CO2 Compressor 3
//    Hệ thống làm khô và hút mùi CO2
//    Hóa lỏng CO2
//    NH3 CO2 comp
//    Bay hơi CO2
//    Tank chứa CO2
//    Load and unload CO2
//    CO2 pump cylinder
//    Air compressor
//    Air drier
//    Air tank and piping system
//    Control and electric system
//    Primery pumps
//    Secondary pumps
//    PHE
//    Stratification tank
//    Expantion tanks
//    NH3 tank
//    NH3 compressor
//    Condenser
//    Valves and piping system

    CO2Washer1 co2Washer1 = new CO2Washer1();
    CO2Washer2 co2Washer2 = new CO2Washer2();
    CO2Compressor1 co2Compressor1 = new CO2Compressor1();
    CO2Compressor2 co2Compressor2 = new CO2Compressor2();
    CO2Compressor3 co2Compressor3 = new CO2Compressor3();
    HeThongHutMuiCO2 heThongHutMuiCO2 = new HeThongHutMuiCO2();
    HoaLongCO2 hoaLongCO2 = new HoaLongCO2();
    NH3_CO2Comp nh3_co2Comp = new NH3_CO2Comp();
    BayHoiCO2 bayHoiCO2 = new BayHoiCO2();
    TankChuaCO2 tankChuaCO2 = new TankChuaCO2();
    LoadAndUnloadCO2 loadAndUnloadCO2 = new LoadAndUnloadCO2();
    CO2PumpCylinder co2PumpCylinder = new CO2PumpCylinder();
    AirCompressor airCompressor = new AirCompressor();
    AirDrier airDrier = new AirDrier();
    AirTankAndPipingSystem airTankAndPipingSystem = new AirTankAndPipingSystem();
    ControlAndElectricSystem controlAndElectricSystem = new ControlAndElectricSystem();
    PrimeryPumps primeryPumps = new PrimeryPumps();
    SecondaryPumps secondaryPumps = new SecondaryPumps();
    PHE phe = new PHE();
    StratificationTank stratificationTank = new StratificationTank();
    ExpantionTanks expantionTanks = new ExpantionTanks();
    NH3Tank nh3Tank = new NH3Tank();
    NH3Compressor nh3Compressor = new NH3Compressor();
    Condenser condenser = new Condenser();
    ValvesAndPipingSystem valvesAndPipingSystem = new ValvesAndPipingSystem();

    @Override
    public String getName() {
        return "CO2 area";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(co2Washer1.getName());
        list.add(co2Washer2.getName());
        list.add(co2Compressor1.getName());
        list.add(co2Compressor2.getName());
        list.add(co2Compressor3.getName());
        list.add(heThongHutMuiCO2.getName());
        list.add(hoaLongCO2.getName());
        list.add(nh3_co2Comp.getName());
        list.add(bayHoiCO2.getName());
        list.add(tankChuaCO2.getName());
        list.add(loadAndUnloadCO2.getName());
        list.add(co2PumpCylinder.getName());
        list.add(airCompressor.getName());
        list.add(airDrier.getName());
        list.add(airTankAndPipingSystem.getName());
        list.add(controlAndElectricSystem.getName());
        list.add(primeryPumps.getName());
        list.add(secondaryPumps.getName());
        list.add(phe.getName());
        list.add(stratificationTank.getName());
        list.add(expantionTanks.getName());
        list.add(nh3Tank.getName());
        list.add(nh3Compressor.getName());
        list.add(condenser.getName());
        list.add(valvesAndPipingSystem.getName());
        return list;
    }

    @Override
    public ArrayList getChilds() {
        ArrayList list = new ArrayList<>();
        list.add(co2Washer1);
        list.add(co2Washer2);
        list.add(co2Compressor1);
        list.add(co2Compressor2);
        list.add(co2Compressor3);
        list.add(heThongHutMuiCO2);
        list.add(hoaLongCO2);
        list.add(nh3_co2Comp);
        list.add(bayHoiCO2);
        list.add(tankChuaCO2);
        list.add(loadAndUnloadCO2);
        list.add(co2PumpCylinder);
        list.add(airCompressor);
        list.add(airDrier);
        list.add(airTankAndPipingSystem);
        list.add(controlAndElectricSystem);
        list.add(primeryPumps);
        list.add(secondaryPumps);
        list.add(phe);
        list.add(stratificationTank);
        list.add(expantionTanks);
        list.add(nh3Tank);
        list.add(nh3Compressor);
        list.add(condenser);
        list.add(valvesAndPipingSystem);
        return list;
    }

    public class CO2Washer1 implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 washer 1";
        }
    }

    public class CO2Washer2 implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 washer 2";
        }
    }

    public class CO2Compressor1 implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 Compressor 1";
        }
    }

    public class CO2Compressor2 implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 Compressor 2";
        }
    }

    public class CO2Compressor3 implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 Compressor 3";
        }
    }

    public class HeThongHutMuiCO2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống làm khô và hút mùi CO2";
        }
    }

    public class HoaLongCO2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Hóa lỏng CO2";
        }
    }

    public class NH3_CO2Comp implements ISimpleNode {
        @Override
        public String getName() {
            return "NH3 CO2 comp";
        }
    }

    public class BayHoiCO2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Bay hơi CO2";
        }
    }

    public class TankChuaCO2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Tank chứa CO2";
        }
    }

    public class LoadAndUnloadCO2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Load and unload CO2";
        }
    }

    public class CO2PumpCylinder implements ISimpleNode {
        @Override
        public String getName() {
            return "CO2 pump cylinder";
        }
    }

    public class AirCompressor implements ISimpleNode {
        @Override
        public String getName() {
            return "Air compressor";
        }
    }

    public class AirDrier implements ISimpleNode {
        @Override
        public String getName() {
            return "Air drier";
        }
    }

    public class AirTankAndPipingSystem implements ISimpleNode {
        @Override
        public String getName() {
            return "Air tank and piping system";
        }
    }

    public static class ControlAndElectricSystem implements ISimpleNode {
        @Override
        public String getName() {
            return "ResourceBundle.Control and electric system";
        }
    }

    public class PrimeryPumps implements ISimpleNode {
        @Override
        public String getName() {
            return "Primery pumps";
        }
    }

    public class SecondaryPumps implements ISimpleNode {
        @Override
        public String getName() {
            return "Secondary pumps";
        }
    }

    public class PHE implements ISimpleNode {
        @Override
        public String getName() {
            return "PHE";
        }
    }

    public class StratificationTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Stratification tank";
        }
    }

    public class ExpantionTanks implements ISimpleNode {
        @Override
        public String getName() {
            return "Expantion tanks";
        }
    }

    public class NH3Tank implements ISimpleNode {
        @Override
        public String getName() {
            return "NH3 tank";
        }
    }

    public class NH3Compressor implements ISimpleNode {
        @Override
        public String getName() {
            return "NH3 compressor";
        }
    }

    public class Condenser implements ISimpleNode {
        @Override
        public String getName() {
            return "Condenser";
        }
    }

    public class ValvesAndPipingSystem implements ISimpleNode {
        @Override
        public String getName() {
            return "Valves and piping system";
        }
    }
}
