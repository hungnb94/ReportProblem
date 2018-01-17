package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class CoolingArea implements INode, ISimpleNode {
//    Control and electric system
//    Hệ thống tiền xử lý nước thải
//    UASB
//    SBR
//    Hệ thống các bể bùn
//    stirrer tank
//    MBBR
//    Hệ thống bể kị khí
//    BO pits
//    Anoxic tank
//    Coagulation tank
//    Sand filters
//    Sedimentation tank
//    Chemical system
//    Các bể đầu ra
//    Biogas

    CO2Area.ControlAndElectricSystem controlAndElectricSystem = new CO2Area.ControlAndElectricSystem();
    HeThongTienXuLyNuocThai heThongTienXuLyNuocThai = new HeThongTienXuLyNuocThai();
    UASB uasb = new UASB();
    SBR sbr = new SBR();
    HeThongCacBebun heThongCacBebun = new HeThongCacBebun();
    StirrerTank stirrerTank = new StirrerTank();
    MBBR mbbr = new MBBR();
    HeThongBeKiKhi heThongBeKiKhi = new HeThongBeKiKhi();
    BOPits boPits = new BOPits();
    AnoxicTank anoxicTank = new AnoxicTank();
    CoagulationTank coagulationTank = new CoagulationTank();
    SandFilters sandFilters = new SandFilters();
    SedimentationTank sedimentationTank = new SedimentationTank();
    ChemicalSystem chemicalSystem = new ChemicalSystem();
    CacBeDauRa cacBeDauRa = new CacBeDauRa();
    Biogas biogas = new Biogas();

    @Override
    public String getName() {
        return "Cooling area";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(controlAndElectricSystem.getName());
        list.add(heThongTienXuLyNuocThai.getName());
        list.add(uasb.getName());
        list.add(sbr.getName());
        list.add(heThongCacBebun.getName());
        list.add(stirrerTank.getName());
        list.add(mbbr.getName());
        list.add(heThongBeKiKhi.getName());
        list.add(boPits.getName());
        list.add(anoxicTank.getName());
        list.add(coagulationTank.getName());
        list.add(sandFilters.getName());
        list.add(sedimentationTank.getName());
        list.add(chemicalSystem.getName());
        list.add(cacBeDauRa.getName());
        list.add(biogas.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList list = new ArrayList<>();
        list.add(controlAndElectricSystem);
        list.add(heThongTienXuLyNuocThai);
        list.add(uasb);
        list.add(sbr);
        list.add(heThongCacBebun);
        list.add(stirrerTank);
        list.add(mbbr);
        list.add(heThongBeKiKhi);
        list.add(boPits);
        list.add(anoxicTank);
        list.add(coagulationTank);
        list.add(sandFilters);
        list.add(sedimentationTank);
        list.add(chemicalSystem);
        list.add(cacBeDauRa);
        list.add(biogas);
        return list;
    }

    public class HeThongTienXuLyNuocThai implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống tiền xử lý nước thải";
        }
    }

    public class UASB implements ISimpleNode {
        @Override
        public String getName() {
            return "UASB";
        }
    }

    public class SBR implements ISimpleNode {
        @Override
        public String getName() {
            return "SBR";
        }
    }

    public class HeThongCacBebun implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống các bể bùn";
        }
    }

    public class StirrerTank implements ISimpleNode {
        @Override
        public String getName() {
            return "stirrer tank";
        }
    }

    public class MBBR implements ISimpleNode {
        @Override
        public String getName() {
            return "MBBR";
        }
    }

    public class HeThongBeKiKhi implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống bể kị khí";
        }
    }

    public class BOPits implements ISimpleNode {
        @Override
        public String getName() {
            return "BO pits";
        }
    }

    public class AnoxicTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Anoxic tank";
        }
    }

    public class CoagulationTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Coagulation tank";
        }
    }

    public class SandFilters implements ISimpleNode {
        @Override
        public String getName() {
            return "Sand filters";
        }
    }

    public class SedimentationTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Sedimentation tank";
        }
    }

    public class ChemicalSystem implements ISimpleNode {
        @Override
        public String getName() {
            return "Chemical system";
        }
    }

    public class CacBeDauRa implements ISimpleNode {
        @Override
        public String getName() {
            return "Các bể đầu ra";
        }
    }

    public class Biogas implements ISimpleNode {
        @Override
        public String getName() {
            return "Biogas";
        }
    }
}

