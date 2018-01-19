package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class CanningLine2 implements INode, ISimpleNode {
    //    Can Depalletiser-2
//    Can Empty Conveyor Group-2
//    ECI-2
//    Can Filler Group-2
//    Seamer-2
//    CIP Unit-2
//    FHI1-2
//    Full Can Conveyor-2
//    Can Pasteuriser-2
//    Wrap Machine Group-2
//    FCI Goup-2
//    Can Coder-2
//    Carton Coder-2
//    Full Carton Divider-2
//    Carton Palletiser-2
//    Lid Feeder Machine
//    FHI2.1/FHI2.2-2
    CanDepalletiser2 canDepalletiser2 = new CanDepalletiser2();
    CanEmptyConveyorGroup2 canEmptyConveyorGroup2 = new CanEmptyConveyorGroup2();
    ECI2 eci2 = new ECI2();
    CanFillerGroup2 canFillerGroup2 = new CanFillerGroup2();
    Seamer2 seamer2 = new Seamer2();
    CIPUnit2 cipUnit2 = new CIPUnit2();
    FHI1_2 fhi1_2 = new FHI1_2();
    FullCanConveyor2 fullCanConveyor2 = new FullCanConveyor2();
    CanPasteuriser2 canPasteuriser2 = new CanPasteuriser2();
    WrapMachineGroup2 wrapMachineGroup2 = new WrapMachineGroup2();
    FCIGoup2 fciGoup2 = new FCIGoup2();
    CanCoder2 canCoder2 = new CanCoder2();
    CartonCoder2 cartonCoder2 = new CartonCoder2();
    FullCartonDivider2 fullCartonDivider2 = new FullCartonDivider2();
    CartonPalletiser2 cartonPalletiser2 = new CartonPalletiser2();
    LidFeederMachine lidFeederMachine = new LidFeederMachine();
    FHI2_1FHI2_2 fhi2_1FHI2_2 = new FHI2_1FHI2_2();

    @Override
    public String getName() {
        return "Canning Line 2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(canDepalletiser2.getName());
        list.add(canEmptyConveyorGroup2.getName());
        list.add(eci2.getName());
        list.add(canFillerGroup2.getName());
        list.add(seamer2.getName());
        list.add(cipUnit2.getName());
        list.add(fhi1_2.getName());
        list.add(fullCanConveyor2.getName());
        list.add(canPasteuriser2.getName());
        list.add(wrapMachineGroup2.getName());
        list.add(fciGoup2.getName());
        list.add(canCoder2.getName());
        list.add(cartonCoder2.getName());
        list.add(fullCartonDivider2.getName());
        list.add(cartonPalletiser2.getName());
        list.add(lidFeederMachine.getName());
        list.add(fhi2_1FHI2_2.getName());
        return list;
    }

    @Override
    public ArrayList getChilds() {
        ArrayList list = new ArrayList();
        list.add(canDepalletiser2);
        list.add(canEmptyConveyorGroup2);
        list.add(eci2);
        list.add(canFillerGroup2);
        list.add(seamer2);
        list.add(cipUnit2);
        list.add(fhi1_2);
        list.add(fullCanConveyor2);
        list.add(canPasteuriser2);
        list.add(wrapMachineGroup2);
        list.add(fciGoup2);
        list.add(canCoder2);
        list.add(cartonCoder2);
        list.add(fullCartonDivider2);
        list.add(cartonPalletiser2);
        list.add(lidFeederMachine);
        list.add(fhi2_1FHI2_2);
        return list;
    }
}

