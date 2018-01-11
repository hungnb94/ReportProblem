package example.com.hb.reportproblem.model.packaging;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class BottlingLine implements INode, ISimpleNode {
    BottleConveyorGroup bottleConveyorGroup;
    CrateWasher crateWasher;
    BottleUnpacker bottleUnpacker;
    BottlePacker bottlePacker;
    BottleFiller bottleFiller;
    BottleWasher bottleWasher;
    BottlePasteuriser bottlePasteuriser;
    BottlePalletiser bottlePalletiser;
    BottleDePalletiser bottleDePalletiser;
    EBI ebi;
    LabellerMachineGroup labellerMachineGroup;
    CrateConveyorGroup crateConveyorGroup;

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

    public class BottleConveyorGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Conveyor Group";
        }
    }

    public class CrateWasher implements ISimpleNode {
        @Override
        public String getName() {
            return "Crate Washer";
        }
    }

    public class BottleUnpacker implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Unpacker";
        }
    }

    public class BottlePacker implements ISimpleNode {

        @Override
        public String getName() {
            return "Bottle Packer";
        }
    }

    public class BottleFiller implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Filler";
        }
    }

    public class BottleWasher implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Washer";
        }
    }

    public class BottlePasteuriser implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Pasteuriser";
        }
    }

    public class BottlePalletiser implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Palletiser";
        }
    }

    public class BottleDePalletiser implements ISimpleNode {
        @Override
        public String getName() {
            return "Bottle De-palletiser";
        }
    }

    public class EBI implements ISimpleNode {
        @Override
        public String getName() {
            return "EBI";
        }
    }

    public class LabellerMachineGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Labeller Machine Group";
        }
    }

    public class CrateConveyorGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Crate Conveyor Group";
        }
    }
}
