package example.com.hb.reportproblem.model.packaging;

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

    public static class BottleConveyorGroup implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Conveyor Group";
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

    public class CrateWasher implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Crate Washer";
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

    public class BottleUnpacker implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Unpacker";
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

    public class BottlePacker implements INode, ISimpleNode {

        @Override
        public String getName() {
            return "Bottle Packer";
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

    public class BottleFiller implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Filler";
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

    public class BottleWasher implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Washer";
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

    public class BottlePasteuriser implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Pasteuriser";
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

    public class BottlePalletiser implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle Palletiser";
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

    public class BottleDePalletiser implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bottle De-palletiser";
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

    public class EBI implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "EBI";
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

    public class LabellerMachineGroup implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Labeller Machine Group";
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

    public class CrateConveyorGroup implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Crate Conveyor Group";
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
