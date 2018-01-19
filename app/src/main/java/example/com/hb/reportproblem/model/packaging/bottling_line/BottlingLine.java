package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class BottlingLine implements INode, ISimpleNode {
    BottleConveyorGroup bottleConveyorGroup = new BottleConveyorGroup();
    CrateWasher crateWasher = new CrateWasher();
    BottleUnpacker bottleUnpacker = new BottleUnpacker();
    BottlePacker bottlePacker = new BottlePacker();
    BottleFiller bottleFiller = new BottleFiller();
    BottleWasher bottleWasher = new BottleWasher();
    BottlePasteuriser bottlePasteuriser = new BottlePasteuriser();
    BottlePalletiser bottlePalletiser = new BottlePalletiser();
    BottleDePalletiser bottleDePalletiser = new BottleDePalletiser();
    EBI ebi = new EBI();
    LabellerMachineGroup labellerMachineGroup = new LabellerMachineGroup();
    CrateConveyorGroup crateConveyorGroup = new CrateConveyorGroup();

    @Override
    public String getName() {
        return "Bottling Line";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(bottleConveyorGroup.getName());
        list.add(crateWasher.getName());
        list.add(bottleUnpacker.getName());
        list.add(bottlePacker.getName());
        list.add(bottleFiller.getName());
        list.add(bottleWasher.getName());
        list.add(bottlePasteuriser.getName());
        list.add(bottlePalletiser.getName());
        list.add(bottleDePalletiser.getName());
        list.add(ebi.getName());
        list.add(labellerMachineGroup.getName());
        list.add(crateConveyorGroup.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(bottleConveyorGroup);
        list.add(crateWasher);
        list.add(bottleUnpacker);
        list.add(bottlePacker);
        list.add(bottleFiller);
        list.add(bottleWasher);
        list.add(bottlePasteuriser);
        list.add(bottlePalletiser);
        list.add(bottleDePalletiser);
        list.add(ebi);
        list.add(labellerMachineGroup);
        list.add(crateConveyorGroup);
        return list;
    }
}
