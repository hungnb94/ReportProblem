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

    CO2Area.ControlAndElectricSystem controlAndElectricSystem;
    HeThongTienXuLyNuocThai heThongTienXuLyNuocThai;
    UASB uasb;
    SBR sbr;
    HeThongCacBebun heThongCacBebun;
    StirrerTank stirrerTank;
    MBBR mbbr;
    HeThongBeKiKhi heThongBeKiKhi;
    BOPits boPits;
    AnoxicTank anoxicTank;
    CoagulationTank coagulationTank;
    SandFilters sandFilters;
    SedimentationTank sedimentationTank;
    ChemicalSystem chemicalSystem;
    CacBeDauRa cacBeDauRa;
    Biogas biogas;

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

    private class HeThongTienXuLyNuocThai implements ISimpleNode{
        @Override
        public String getName() {
            return "Hệ thống tiền xử lý nước thải";
        }
    }

    private class UASB implements ISimpleNode{
        @Override
        public String getName() {
            return "UASB";
        }
    }

    private class SBR implements ISimpleNode {
        @Override
        public String getName() {
            return "SBR";
        }
    }

    private class HeThongCacBebun implements ISimpleNode{
        @Override
        public String getName() {
            return "Hệ thống các bể bùn";
        }
    }

    private class StirrerTank implements ISimpleNode {
        @Override
        public String getName() {
            return "stirrer tank";
        }
    }

    private class MBBR implements ISimpleNode {
        @Override
        public String getName() {
            return "MBBR";
        }
    }

    private class HeThongBeKiKhi implements ISimpleNode{
        @Override
        public String getName() {
            return "Hệ thống bể kị khí";
        }
    }

    private class BOPits implements ISimpleNode{
        @Override
        public String getName() {
            return "BO pits";
        }
    }

    private class AnoxicTank implements ISimpleNode
    {
        @Override
        public String getName() {
            return "Anoxic tank";
        }
    }

    private class CoagulationTank implements ISimpleNode{
        @Override
        public String getName() {
            return "Coagulation tank";
        }
    }

    private class SandFilters implements ISimpleNode{
        @Override
        public String getName() {
            return "Sand filters";
        }
    }

    private class SedimentationTank implements ISimpleNode {
        @Override
        public String getName() {
            return "Sedimentation tank";
        }
    }

    private class ChemicalSystem implements ISimpleNode{
        @Override
        public String getName() {
            return "Chemical system";
        }
    }

    private class CacBeDauRa implements ISimpleNode {
        @Override
        public String getName() {
            return "Các bể đầu ra";
        }
    }

    private class Biogas implements ISimpleNode {
        @Override
        public String getName() {
            return "Biogas";
        }
    }
}
